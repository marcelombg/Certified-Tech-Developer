import java.sql.*;

//grupo 2
//EDUARDO RUSSO
//LARISSA FELIPE
//MARCELO GAROFALO
//MATHEUS ALMEIDA
//TIAGO PEREIRA DO VALE

public class Main {

    private static final String SQL_CREATE_TABLE = "DROP TABLE IF EXISTS DENTISTA; CREATE TABLE DENTISTA "
            + "("
            + " ID INT PRIMARY KEY,"
            + " NOME varchar(100) NOT NULL, "
            + " SOBRENOME varchar(100),"
            + " MATRICULA INT NOT NULL"
            + " )";

    private static final String SQL_INSERT =  "INSERT INTO DENTISTA (ID, NOME, SOBRENOME, MATRICULA)" +
            " VALUES (?,?,?,?)";

    private static final String SQL_UPDATE =  "UPDATE DENTISTA SET MATRICULA=? WHERE ID=?";

    public static void main(String[] args) throws Exception {

        Dentista dentista = new Dentista(1,"Marcelo", "Muniz", 1);


        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(SQL_CREATE_TABLE);

            insertRegistro(connection, dentista);

            updateRegistro(connection, dentista, 3);

            consultaConta(connection);

        } catch (Exception e) {
            e.printStackTrace();

        } finally {
            if (connection != null)
                connection.close();
        }

    }

    public static void insertRegistro(Connection connection, Dentista dentista) throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_INSERT);
        preparedStatement.setInt(1, 1);
        preparedStatement.setString(2, dentista.getNome());
        preparedStatement.setString(3, dentista.getSobrenome());
        preparedStatement.setDouble(4, dentista.getMatricula());

        preparedStatement.execute();
    }

    public static void updateRegistro(Connection connection, Dentista dentista, double matricula)
            throws SQLException {
        PreparedStatement preparedStatement = connection.prepareStatement(SQL_UPDATE);
        preparedStatement.setDouble(1, matricula);
        preparedStatement.setInt(2, 1);

        preparedStatement.execute();
    }

    public static void consultaConta(Connection connection) throws SQLException {
        String sql = "SELECT * FROM DENTISTA";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            System.out.println(" ID: " + resultSet.getInt(1) +
                    ", NOME: " + resultSet.getString(2) +
                    ", SOBRENOME: " + resultSet.getString(3)  +
                    ", MATRICULA: " + resultSet.getDouble(4));
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }

}
