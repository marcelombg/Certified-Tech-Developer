import java.sql.*;

public class Main {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS CONTA; CREATE TABLE CONTA "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOME varchar(100) NOT NULL, "
            + " NUMERO_CONTA INT NOT NULL,"
            + " SALDO INT NOT NULL"
            + " )";

    private static final String SQL_INSERT =  "INSERT INTO CONTA (ID, NOME, NUMERO_CONTA, SALDO)" +
            " VALUES (?,?,?,?)";

    private static final String SQL_UPDATE =  "UPDATE CONTA SET SALDO=? WHERE ID=?";

    public static void main(String[] args) throws Exception {

        Conta conta = new Conta(1234567890, "Thiago" , 100000);

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            insertConta(connection, conta);

            updateSaldoConta(connection, conta, 1000);

            connection.setAutoCommit(false);
            updateSaldoConta(connection,conta, 1500);
            int a = 4/0;
            connection.commit();
            connection.setAutoCommit(true);

            consultaConta(connection);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (connection != null)
                connection.close();
        }

        Connection connection1 = getConnection();
        consultaConta(connection1);
    }

    public static void insertConta(Connection connection, Conta conta) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);
        preparedStatement.setInt(1, 1);
        preparedStatement.setString(2, conta.getNome());
        preparedStatement.setInt(3, conta.getNumeroConta());
        preparedStatement.setDouble(4, conta.getSaldo());

        preparedStatement.execute();
    }

    public static void updateSaldoConta(Connection connection, Conta conta, int valor)
            throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE);
        preparedStatement.setDouble(1, conta.getSaldo() + valor);
        preparedStatement.setInt(2, 1);

        preparedStatement.execute();
    }

    public static void consultaConta(Connection connection) throws SQLException {
        String sql = "SELECT * FROM CONTA";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " - " +
                            resultSet.getString(2) + " - " +
                            resultSet.getInt(3) + " - " +
                            resultSet.getInt(4));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

}
