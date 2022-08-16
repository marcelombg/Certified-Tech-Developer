public class ServicoDownloadProxy implements Donwload {


    @Override
    public void donwloadUsuario(int id, String nome, String email, String tipoUsuario) {
        if (tipoUsuario.equalsIgnoreCase("Free")) {
            System.out.println("Não é possível realizar o download pois o usuário" + nome + " tem uma conta "
                    + tipoUsuario);
        } else {
            if (tipoUsuario.equalsIgnoreCase("Premium")) {
                System.out.println("Não é possível realizar o download pois o usuário" + nome + " tem uma conta "
                        + tipoUsuario);
            }
        }
    }
}
