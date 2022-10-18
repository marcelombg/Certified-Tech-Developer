package entities;

import java.time.LocalDate;

public class ImpressoraCannon extends Impressora {

    public ImpressoraCannon(String modelo, String tipoConexao, LocalDate dataFabricao, Integer folhasDisponiveis, Double percTinta) {
        super(modelo, tipoConexao, dataFabricao, folhasDisponiveis, percTinta);
    }

    @Override
    public void imprimir() {
        if(temPapel() && !precisaTinta()) {
            setFolhasDisponiveis(getFolhasDisponiveis()-1);
            setPercTinta(getPercTinta() - 0.01);
            System.out.println("Imprimindo uma folha da impressora Epson.");
        } else if (temPapel() && precisaTinta()) {
            System.out.println("Acabou a tinta.");
        } else if (!temPapel() && precisaTinta()) {
            System.out.println("Acabou a tinta e o papel.");
        } else {
            System.out.println("Acabou papel.");
        }
    }

    @Override
    public boolean precisaTinta() {
        return super.precisaTinta();
    }
}
