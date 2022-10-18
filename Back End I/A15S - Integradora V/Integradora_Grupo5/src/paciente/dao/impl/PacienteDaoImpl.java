package paciente.dao.impl;

import paciente.dao.ConfiguracaoJDBC;
import paciente.dao.IDao;
import paciente.model.Endereco;
import paciente.model.Paciente;
import org.apache.log4j.Logger;

import java.sql.*;

public class PacienteDaoImpl implements IDao<Paciente> {

    private static ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(PacienteDaoImpl.class);

    public PacienteDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Paciente salvar(Paciente paciente) {


        log.debug("Salvando um novo paciente: " + paciente.toString());
        Connection connection = configuracaoJDBC.conectarDB();
        Statement statement = null;
        String query = String.format("INSERT INTO PACIENTE(NOME,SOBRENOME,RG,DATA) VALUES('%s', '%s', '%s', '%s')",
                paciente.getNome(),
                paciente.getSobrenome(),
                paciente.getRg(),
                paciente.getDataCadastro());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()){
                paciente.setId(resultSet.getInt(1));
            }

            connection.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return paciente;
    }
}
