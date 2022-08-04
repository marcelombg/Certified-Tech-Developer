public class Main {

    public static void main(String[] args) {

        CheckEmail checkEmail = new CheckEmail();
        checkEmail.verificar(new Email("email@mail.com", "tecnica@dh.com", "Reclamação"));
        checkEmail.verificar(new Email("email@mail.com", "asdfgh@dh.com", "Gerencia"));
        checkEmail.verificar(new Email("email@mail.com", "juan@gmail.com", "Comercial"));
        checkEmail.verificar(new Email("email@mail.com", "tecnica@colmeia.com", "Reclamação"));
    }
}
