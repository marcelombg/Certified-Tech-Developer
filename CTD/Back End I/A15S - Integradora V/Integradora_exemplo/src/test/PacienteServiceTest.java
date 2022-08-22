//Grupo 05
//Ana Paula Gessi
//Carlos de Lima Junior
//Ederson Oliveira
//Marcelo Garofalo
//Marcos Pires

package test;

import paciente.dao.ConfiguracaoJDBC;
import paciente.dao.impl.EnderecoDaoImpl;
import paciente.dao.impl.PacienteDaoImpl;
import paciente.model.Endereco;
import paciente.model.Paciente;
import org.junit.jupiter.api.Test;
import paciente.service.Service;

import static org.junit.jupiter.api.Assertions.*;

class PacienteServiceTest {

    private Service service =
            new Service(new EnderecoDaoImpl(new ConfiguracaoJDBC()), new PacienteDaoImpl(new ConfiguracaoJDBC()));


    @Test
    public void salvarPaciente(){
        Endereco endereco = new Endereco("Rua teste", 123, "Cidade teste", "Bairro teste");
        Endereco endereco2 = new Endereco("Rua teste2", 1234, "Cidade teste2", "Bairro teste2");
        Paciente paciente = new Paciente( "Marcelo", "Teste", 123456, "teste");
        Paciente paciente2 = new Paciente("Marcelo2", "Teste2", 1234567, "teste");

        service.salvarPaciente(paciente);
        service.salvarPaciente(paciente2);
        service.salvarEndereco(endereco);
        service.salvarEndereco(endereco2);
        assertTrue(paciente.getId() != null);
        assertTrue(paciente2.getId() != null);
        assertTrue(endereco.getIdEndereco() != null);
        assertTrue(endereco.getIdEndereco() != null);
    }



}