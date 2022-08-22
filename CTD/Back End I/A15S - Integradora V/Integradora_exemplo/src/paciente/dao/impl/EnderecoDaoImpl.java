package paciente.dao.impl;

import org.apache.log4j.Logger;
import paciente.dao.ConfiguracaoJDBC;
import paciente.dao.IDao;
import paciente.model.Endereco;
import paciente.model.Paciente;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EnderecoDaoImpl implements IDao<Endereco> {

    private ConfiguracaoJDBC configuracaoJDBC;
    final static Logger log = Logger.getLogger(EnderecoDaoImpl.class);

    public EnderecoDaoImpl(ConfiguracaoJDBC configuracaoJDBC) {
        this.configuracaoJDBC = configuracaoJDBC;
    }

    @Override
    public Endereco salvar(Endereco endereco) {
        log.debug("Salvando um novo endereço: " + endereco.toString());
        Connection connection = configuracaoJDBC.conectarDB();
        Statement statement = null;
        String query = String.format("INSERT INTO ENDERECO(RUA,NUMERO,CIDADE,BAIRRO) VALUES('%s', '%s', '%s', '%s')",
                endereco.getRua(),
                endereco.getNumero(),
                endereco.getCidade(),
                endereco.getBairro());

        try {
            statement = connection.createStatement();
            statement.executeUpdate(query, Statement.RETURN_GENERATED_KEYS);
            ResultSet resultSet = statement.getGeneratedKeys();

            if(resultSet.next()){
                endereco.setIdEndereco(resultSet.getInt(1));
            }
            connection.close();

        }catch (Exception e) {
            e.printStackTrace();
        }
        return endereco;
    }

}