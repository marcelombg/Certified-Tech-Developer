package paciente;

import org.apache.log4j.Logger;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;
import paciente.dao.ConfiguracaoJDBC;

import java.sql.*;

public class Main {
    final static Logger log = Logger.getLogger(Main.class);
    private static ConfiguracaoJDBC configuracaoJDBC;
    private static final String SQL_CREATETABLE_PACIENTE = "create table if not exists PACIENTE(ID int auto_increment primary key,NOME varchar(255),SOBRENOME varchar(255),RG int,DATA varchar(255))";
    private static final String SQL_CREATETABLE_ENDERECO = "create table if not exists ENDERECO(ID_PACIENTE int auto_increment,RUA varchar(255),NUMERO int,CIDADE varchar(55),BAIRRO varchar(255),foreign key (ID_PACIENTE) references PACIENTE(ID))";
    private static final String SQL_INSERT_PACIENTE1 =  "INSERT INTO PACIENTE(ID,NOME,SOBRENOME,RG,DATA) VALUES (4, 'Paciente1', 'Sobrenome1', 123, '11/11/1111')";
    private static final String SQL_INSERT_PACIENTE2 =  "INSERT INTO PACIENTE(ID,NOME,SOBRENOME,RG,DATA) VALUES (5, 'Paciente2', 'Sobrenome2', 456, '22/22/2222')";
    private static final String SQL_INSERT_ENDERECO1 =  "INSERT INTO ENDERECO(ID_PACIENTE,RUA,NUMERO,CIDADE,BAIRRO) VALUES (4, 'Rua teste1', 123, 'Cidade teste1', 'Bairro teste1')";
    private static final String SQL_INSERT_ENDERECO2 =  "INSERT INTO ENDERECO(ID_PACIENTE,RUA,NUMERO,CIDADE,BAIRRO) VALUES (5, 'Rua teste2', 456, 'Cidade teste2', 'Bairro teste2')";
    private static final String SQL_DELETE =  "DELETE FROM ENDERECO E WHERE ID_PACIENTE='4'; DELETE FROM PACIENTE WHERE ID='4'";
    private static final String DROP_TABLES =  "DROP TABLE ENDERECO; DROP TABLE PACIENTE";

    public static void sqlOperator(String paciente) throws SQLException {
        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();

            statement.execute(paciente);
        } catch (JdbcSQLIntegrityConstraintViolationException e) {
            log.info("\nERRO: FOI ADICIONADO UM MESMO ID");
        } catch (Exception e) {
            log.info("\nOCORREU UM PROBLEMA");
            e.printStackTrace();
        } finally {
            if(connection != null) {
                connection.close();
            }
        }
    }

    public static void consultaPaciente(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM PACIENTE";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt(1) +
                    ", NOME: " + resultSet.getString(2) +
                    ", SOBRENOME: " + resultSet.getString(3)  +
                    ", RG: " + resultSet.getInt(4) +
                    ", DATA: " + resultSet.getString(5));
        }
    }

    public static void consultaEndereco(Connection connection) throws SQLException {
        String sqlQuery = "SELECT * FROM ENDERECO";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println("ID ENDEREÇO: " + resultSet.getInt(1) +
                    ", RUA: " + resultSet.getString(2) +
                    ", NUMERO: " + resultSet.getInt(3)  +
                    ", CIDADE: " + resultSet.getString(4) +
                    ", BAIRRO: " + resultSet.getString(5));
        }
    }

    public static void consultaID4(Connection connection) throws SQLException {
        String sqlQuery = "SELECT* FROM PACIENTE WHERE ID='4'";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sqlQuery);

        while (resultSet.next()) {
            System.out.println("ID: " + resultSet.getInt(1) +
                    ", NOME: " + resultSet.getString(2) +
                    ", SOBRENOME: " + resultSet.getString(3)  +
                    ", RG: " + resultSet.getInt(4) +
                    ", DATA: " + resultSet.getString(5));
        }
    }

    public static void main(String[] args) throws SQLException {

        Connection connection = null;

        try {
            connection = getConnection();
            Statement statement = connection.createStatement();

            sqlOperator(DROP_TABLES);

            statement.execute(SQL_CREATETABLE_PACIENTE);
            statement.execute(SQL_CREATETABLE_ENDERECO);

            log.info("\nADICIONANDO PACIENTES E ENDEREÇOS\n");
            sqlOperator(SQL_INSERT_PACIENTE1);
            sqlOperator(SQL_INSERT_ENDERECO1);
            sqlOperator(SQL_INSERT_PACIENTE2);
            sqlOperator(SQL_INSERT_ENDERECO2);

            log.info("\n");

            log.info("\nCONSULTANDO O ID 4 DA TABELA PACIENTE");
            consultaID4(connection);

            log.info("\n");

            log.info("\nCONSULTANDO TABELA PACIENTE");
            consultaPaciente(connection);

            log.info("\n");

            log.info("\nCONSULTANDO TABELA ENDEREÇO");
            consultaEndereco(connection);

            log.info("\n");

            log.info("\nDELETANDO O ID 4 TABELA PACIENTE");
            sqlOperator(SQL_DELETE);

            log.info("\n");

            log.info("\nCONSULTANDO O ID 4 TABELA PACIENTE");
            consultaID4(connection);

            log.info("\n");

            log.info("\nCONSULTANDO TABELA PACIENTE");
            consultaPaciente(connection);

            log.info("\n");

            log.info("\nCONSULTANDO TABELA ENDEREÇO");
            consultaEndereco(connection);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (connection != null)
                connection.close();
        }
    }

    public static Connection getConnection() throws Exception {
        Class.forName("org.h2.Driver").newInstance();
        return DriverManager.getConnection("jdbc:h2:~/test", "sa", "");
    }
}