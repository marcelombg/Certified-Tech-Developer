public class Main {

    public static void main(String[] args) {

        Funcionario efetivo = new Efetivo("Joao", "Snow", "01A", 3000,
                1000, 500);

        Funcionario contratado = new Contratado("Ana", "Dragon", "02B", 60,
                50);
    
        efetivo.pagamentoSalario();
        contratado.pagamentoSalario();
        
    }

}
