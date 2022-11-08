package profissao;

import contribuinte.Contribuinte;

public class Taxista extends Contribuinte {

    private int passageirosAno;

    public Taxista(int id, String nome, int passageirosAno) {
        super(id, nome);
        setPassageirosAno(passageirosAno);
    }

    public int getPassageirosAno() {
        return passageirosAno;
    }

    private void setPassageirosAno(int passageirosAno) {
        this.passageirosAno = passageirosAno;
    }

    public double calcularImposto(double kmRodados) {
        return (getPassageirosAno() * 0.05) + (kmRodados * 0.01);
    }
}