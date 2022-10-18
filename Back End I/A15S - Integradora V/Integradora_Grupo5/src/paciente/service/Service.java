package paciente.service;

import paciente.dao.IDao;
import paciente.dao.impl.PacienteDaoImpl;
import paciente.model.Endereco;
import paciente.model.Paciente;

public class Service {

    private IDao<Endereco> enderecoIDao;
    private IDao<Paciente> pacienteIDao;

    public Service(IDao<Endereco> enderecoIDao, PacienteDaoImpl pacienteIDao) {
        this.enderecoIDao = enderecoIDao;
        this.pacienteIDao = pacienteIDao;
    }

    public Endereco salvarEndereco (Endereco endereco){
        return enderecoIDao.salvar(endereco);
    }

    public Paciente salvarPaciente (Paciente paciente){
        return pacienteIDao.salvar(paciente);
    }

}
