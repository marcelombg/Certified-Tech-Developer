//Grupo 05
//Ana Paula Gessi
//Carlos de Lima Junior
//Ederson Oliveira
//Marcelo Garofalo
//Marcos Pires

package test;

import org.junit.jupiter.api.BeforeAll;
import paciente.dao.ConfiguracaoJDBC;
import paciente.dao.impl.EnderecoDaoImpl;
import paciente.dao.impl.PacienteDaoImpl;
import paciente.model.Endereco;
import paciente.model.Paciente;
import org.junit.jupiter.api.Test;
import paciente.service.Service;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertTrue;



class PacienteServiceTest {

    private Service service =
            new Service(new EnderecoDaoImpl(new ConfiguracaoJDBC()), new PacienteDaoImpl(new ConfiguracaoJDBC()));

    @Test
    public void salvarPaciente(){
        Paciente paciente3 = new Paciente("Paciente3", "Sobrenome3", 789, "33/33/3333");
        Endereco endereco3 = new Endereco("Rua teste3", 123, "Cidade teste3", "Bairro teste3");

        Paciente paciente4 = new Paciente("Paciente4", "Sobrenome4", 123, "44/44/4444");
        Endereco endereco4 = new Endereco( "Rua teste4", 456, "Cidade teste4", "Bairro teste4");

        service.salvarPaciente(paciente3);
        service.salvarEndereco(endereco3);

        service.salvarPaciente(paciente4);
        service.salvarEndereco(endereco4);

        assertTrue(paciente3.getId() != null);
        assertTrue(endereco3.getIdEndereco() != null);
        assertTrue(paciente4.getId() != null);
        assertTrue(endereco4.getIdEndereco() != null);
    }
}