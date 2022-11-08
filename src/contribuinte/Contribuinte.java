package contribuinte;

import bemContribuinte.Bem;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class Contribuinte {

    private int id;
    private String nome;
    private ArrayList<Bem> bens;

    public Contribuinte(int id, String nome) {
        setId(id);
        setNome(nome);
        setBens(new ArrayList<>());
    }

    public int getId() {
        return id;
    }

    private void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Bem> getBens() {
        return bens;
    }

    private void setBens(ArrayList<Bem> bens) {
        this.bens = bens;
    }

    public void addBem(String tipo, double preco) {
        Bem bem = new Bem(tipo, preco);
        bens.add(bem);
    }

    @Override
    public String toString() {
        return "-----> Contribuinte  ↓" + System.lineSeparator() +
                "#ID do Contribuinte: " + getId() + System.lineSeparator() +
                "Nome: " + getNome() + System.lineSeparator() +
                "Profissão: " + this.getClass().getSimpleName() + System.lineSeparator() +
                "Bens ↓" + System.lineSeparator() +
                (getBens().isEmpty() ? "Nenhum bem." : getBens().stream().map(Bem::toString).collect(Collectors.joining(System.lineSeparator())));
    }
}
