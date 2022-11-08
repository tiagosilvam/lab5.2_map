package sistema;

import bemContribuinte.Bem;
import contribuinte.Contribuinte;
import profissao.Caminhoneiro;
import profissao.Medico;
import profissao.Professor;
import profissao.Taxista;

import java.util.ArrayList;

public class MeuSistemaDeTributacao {

    private int codContribuinte;
    private ArrayList<Contribuinte> contribuintes;

    public MeuSistemaDeTributacao() {
        codContribuinte = 0;
        setContribuintes(new ArrayList<>());
    }

    public ArrayList<Contribuinte> getContribuintes() {
        return contribuintes;
    }

    public void setContribuintes(ArrayList<Contribuinte> contribuintes) {
        this.contribuintes = contribuintes;
    }

    public Caminhoneiro cadastrarCaminhoneiro(String nome, double toneladasAno) {
        Caminhoneiro caminhoneiro = new Caminhoneiro(++codContribuinte, nome, toneladasAno);
        contribuintes.add(caminhoneiro);
        return caminhoneiro;
    }

    public Taxista cadastrarTaxista(String nome, int passageirosAno) {
        Taxista taxista = new Taxista(++codContribuinte, nome, passageirosAno);
        contribuintes.add(taxista);
        return taxista;
    }

    public Professor cadastrarProfessor(String nome, double salarioAno) {
        Professor professor = new Professor(++codContribuinte, nome, salarioAno);
        contribuintes.add(professor);
        return professor;
    }

    public Medico cadastrarMedico(String nome, int pacientesAno) {
        Medico medico = new Medico(++codContribuinte, nome, pacientesAno);
        contribuintes.add(medico);
        return medico;
    }

    public boolean avaliarRiquza(Contribuinte contribuinte) {
        double riqueza = contribuinte.getBens().stream().mapToDouble(Bem::getPreco).sum();
        double riquezaContribuintes = getContribuintes().stream().filter(c -> c.getClass().getSimpleName().equals(contribuinte.getClass().getSimpleName()))
                .toList().stream().map(Contribuinte::getBens)
                .toList().stream().map(e -> e.stream().mapToDouble(Bem::getPreco).sum())
                .mapToDouble(valor -> valor).sum();
        int qntContribuintes = getContribuintes().stream().filter(c -> c.getClass().getSimpleName().equals(contribuinte.getClass().getSimpleName())).toList().size();
        double valorMedio = (riquezaContribuintes / qntContribuintes);
        return riqueza > (valorMedio + (valorMedio * 0.5));
    }
}
