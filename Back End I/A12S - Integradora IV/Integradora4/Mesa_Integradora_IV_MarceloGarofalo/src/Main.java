import org.apache.log4j.Logger;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import java.sql.*;

public class Main {

    private static final String sqlCreateTable = "DROP TABLE IF EXISTS FUNCIONARIOS; CREATE TABLE FUNCIONARIOS"
            + "("
            + "ID INT PRIMARY KEY,"
            + "NOME VARCHAR(100) NOT NULL, "
            + "SOBRENOME VARCHAR(100) NOT NULL, "
            + "CPF VARCHAR(20) NOT NULL UNIQUE, "
            + "SALARIO DOUBLE NOT NULL"
            + ")";

    private static final String sqlInsert1 = "INSERT INTO FUNCIONARIOS (ID, NOME, SOBRENOME, CPF, SALARIO) VALUES (1, 'MARCELO', 'NUNES', 333.333.333-33, 30000.00)";
    private static final String sqlInsert2 = "INSERT INTO FUNCIONARIOS (ID, NOME, SOBRENOME, CPF, SALARIO) VALUES (2, 'JOANA', 'SILVA', 444.444.444-44, 45000.00)";
    private static final String sqlInsert3 = "INSERT INTO FUNCIONARIOS (ID, NOME, SOBRENOME, CPF, SALARIO) VALUES (1, 'RODRIGO', 'SOUZA', 555.555.555-55, 650000.00)";
    private static final String sqlInsert4 = "INSERT INTO FUNCIONARIOS (ID, NOME, SOBRENOME, CPF, SALARIO) VALUES (3, 'JANAINA', 'MAIA', 666.666.666-66, 350000.00)";


    private static final String sqlUpdate = "UPDATE FUNCIONARIOS SET SALARIO=20000 WHERE ID=1";
    private static final String sqlDelete1 = "DELETE FROM FUNCIONARIOS WHERE SOBRENOME='SILVA'";

    private static final String sqlDelete2 = "DELETE FROM FUNCIONARIOS WHERE ID=3";

    private static final Logger logger = Logger.getLogger(Main.class);


    public static void main(String[] args) throws Exception {
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();
            statement.execute(sqlCreateTable);

            logger.info("ADICIONANDO FUNCIONÁRIOS");
            sqlOperator(sqlInsert1);
            sqlOperator(sqlInsert3);
            sqlOperator(sqlInsert2);
            sqlOperator(sqlInsert4);

            showFuncionarios(connection);

            logger.debug("ATUALIZANDO FUNCIONÁRIO" + sqlUpdate);
            sqlOperator(sqlUpdate);
            logger.info("FUNCIONÁRIO ATUALIZADO " + sqlUpdate);

            showFuncionarios(connection);

            sqlOperator(sqlDelete1);
            logger.info("FUNCIONÁRIO EXCLUÍDO " + sqlDelete1);

            showFuncionarios(connection);

            sqlOperator(sqlDelete2);
            logger.info("FUNCIONÁRIO EXCLUÍDO " + sqlDelete2);

            showFuncionarios(connection);


        } catch (Exception e) {
            logger.info("OCORREU UM PROBLEMA");
            e.printStackTrace();
        } finally {
            if(connection != null) {
                connection.close();
            }
        }


    }

    public static void sqlOperator(String funcionario) throws SQLException {
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();

            statement.execute(funcionario);
        } catch (JdbcSQLIntegrityConstraintViolationException e) {
            logger.info("ERRO: FOI ADICIONADO UM MESMO ID");
        } catch (Exception e) {
            logger.info("OCORREU UM PROBLEMA");
            e.printStackTrace();
        } finally {
            if(connection != null) {
                connection.close();
            }
        }
    }

    public static void showFuncionarios(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM FUNCIONARIOS";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println(resultSet.getInt(1) + " - " +
                    resultSet.getString(2) + " - " +
                    resultSet.getString(3) + " - " +
                    resultSet.getString(4) + " - " +
                    resultSet.getString(5));
        }
    }
    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();

        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}