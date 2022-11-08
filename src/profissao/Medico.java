package profissao;

import contribuinte.Contribuinte;

public class Medico extends Contribuinte {

    private int pacientesAno;

    public Medico(int id, String nome, int pacientesAno) {
        super(id, nome);
        setPacientesAno(pacientesAno);
    }

    public int getPacientesAno() {
        return pacientesAno;
    }

    private void setPacientesAno(int pacientesAno) {
        this.pacientesAno = pacientesAno;
    }

    public double calcularImposto(double despesa) {
        double calculo = getPacientesAno() * 10 - despesa;
        if(calculo < 0) {
            return 0;
        }
        return getPacientesAno() * 10 - despesa;
    }
}