package profissao;

import contribuinte.Contribuinte;

public class Professor extends Contribuinte {

    private double salarioAno;

    public Professor(int id, String nome, double salarioAno) {
        super(id, nome);
        setSalarioAno(salarioAno);
    }

    public double getSalarioAno() {
        return salarioAno;
    }

    private void setSalarioAno(double salarioAno) {
        this.salarioAno = salarioAno;
    }

    public double calcularImposto(double despesas) {

        double qntSalarios = getSalarioAno() / 1212;
        double imposto;

        if (qntSalarios < 1) {
            imposto = getSalarioAno() * 0.05;
        } else if (qntSalarios < 5) {
            imposto = getSalarioAno() * 0.10;
        } else {
            imposto = getSalarioAno() * 0.20;
        }

        if(despesas * 0.5 < imposto) {
            return imposto - despesas * 0.5;
        }
        return 0;
    }
}