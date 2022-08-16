import org.apache.log4j.Logger;
import org.h2.jdbc.JdbcSQLIntegrityConstraintViolationException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    private static final String sqlCreateTable = "DROP TABLE IF EXISTS Usuario; CREATE TABLE Usuario "
            + "("
            + " ID INT PRIMARY KEY,"
            + " Primeiro_Nome varchar(100) NOT NULL, "
            + " Sobrenome varchar(100) NOT NULL, "
            + " Idade INT NOT NULL "
            + ")";

    private static final String sqlInsert1 =  "INSERT INTO Usuario (ID, Primeiro_Nome, Sobrenome, Idade) VALUES (1, 'Maria', 'Aparecida', 50)";
    private static final String sqlInsert2 =  "INSERT INTO Usuario (ID, Primeiro_Nome, Sobrenome, Idade) VALUES (1, 'Fábio', 'Gomes', 23)";
    private static final String sqlInsert3 =  "INSERT INTO Usuario (ID, Primeiro_Nome, Sobrenome, Idade) VALUES (3, 'Batata', 'Frita', 12)";

    private static final String sqlDelete =  "DELETE FROM Usuario WHERE ID=2";

    private static final Logger logger = Logger.getLogger(Main.class);

    public static void main(String[] args) throws Exception{
        Connection connection = null;

        try {
            connection = getConnection();

            Statement statement = connection.createStatement();

            statement.execute(sqlCreateTable);
            logger.info("Tabela criada");

            statement.execute(sqlInsert1);
            logger.info("Usuário 1 inserido");
            statement.execute(sqlInsert2);
            logger.info("Usuário 2 inserido");
            statement.execute(sqlInsert3);
            logger.info("Usuário 3 inserido");

            statement.execute(sqlDelete);
            logger.info("Usuário 2 deletado");

        } catch (JdbcSQLIntegrityConstraintViolationException erro) {
            logger.error("Primary key repetida");
        } catch (Exception e) {
            logger.error("Algo deu ruim");
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
