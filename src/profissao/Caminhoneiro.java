package profissao;

import bemContribuinte.Bem;
import contribuinte.Contribuinte;

import java.util.stream.Collectors;

public class Caminhoneiro extends Contribuinte {

    private double toneladasAno;

    public Caminhoneiro(int id, String nome, double toneladasAno) {
        super(id, nome);
        setToneladasAno(toneladasAno);
    }

    public double getToneladasAno() {
        return toneladasAno;
    }

    private void setToneladasAno(double toneladasAno) {
        this.toneladasAno = toneladasAno;
    }

    public double calcularImposto(double kmRodados) {
        if(getToneladasAno() <= 10) {
            return 500;
        }
        return 500 + (getToneladasAno() - 10) * 100 + kmRodados * 0.01;
    }

}