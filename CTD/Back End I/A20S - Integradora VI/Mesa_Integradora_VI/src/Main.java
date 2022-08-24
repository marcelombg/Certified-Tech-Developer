import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        System.out.println("Desafio 1");

        Funcionario funcionario1 = new Funcionario("11.111.111-1111-11", "Empresa 1", "Nome 1", "Sobrenome 1", "(11) 1111-1111", "111.111.111-11", 1000.0);
        Funcionario funcionario2 = new Funcionario("22.222.222-2222-22", "Empresa 2", "Nome 2", "Sobrenome 2", "(22) 2222-2222", "222.222.222-22", 2000.0);
        Funcionario funcionario3 = new Funcionario("33.333.333-3333-33", "Empresa 3", "Nome 3", "Sobrenome 3", "(33) 3333-3333", "333.333.333-33", 3000.0);
        Funcionario funcionario4 = new Funcionario("44.444.444-4444-44", "Empresa 4", "Nome 4", "Sobrenome 4", "(44) 4444-4444", "444.444.444-44", 4000.0);

        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(funcionario1);
        funcionarios.add(funcionario2);
        funcionarios.add(funcionario3);
        funcionarios.add(funcionario4);

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("OutputFuncionarios.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(funcionarios);

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        List<Funcionario> funcionariosList = null;

        try {
            FileInputStream fileInputStream = new FileInputStream("OutputFuncionarios.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            funcionariosList = (List<Funcionario>) objectInputStream.readObject();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

        for (Funcionario funcionarioFor: funcionariosList) {
            System.out.println("NOME: "+funcionarioFor.getNome()+"; SOBRENOME: "+funcionarioFor.getSobrenome()+"; TELEFONE: "+funcionarioFor.getTelefone()+"; CPF: "+funcionarioFor.getCPF()+"; SALÁRIO: "+funcionarioFor.getSalario()+"; EMPRESA: "+funcionarioFor.getRazaoSocial()+"; CNPJ: "+funcionarioFor.getCNPJ());
        }

        System.out.println("\nDesafio 2");

        FileWriter fileWriter = new FileWriter("empregados.txt");
        PrintWriter escreverArquivo = new PrintWriter(fileWriter);

        for (Funcionario funcionario: funcionarios) {
            escreverArquivo.printf("%s;%s;%s;%s;%s%n", funcionario.getNome(), funcionario.getSobrenome(), funcionario.getCPF(), funcionario.getTelefone(), funcionario.getSalario());
        }

        fileWriter.close();

        System.out.println("Arquivo empregados.txt gerado com sucesso!");

    }
}
