import contribuinte.Contribuinte;
import profissao.Caminhoneiro;
import profissao.Medico;
import profissao.Professor;
import profissao.Taxista;
import sistema.MeuSistemaDeTributacao;

public class Main {
    public static void main(String[] args) {

        MeuSistemaDeTributacao sistema = new MeuSistemaDeTributacao();

        Taxista contribuinte1 = sistema.cadastrarTaxista("Mateus", 250);
        Caminhoneiro contribuinte2 = sistema.cadastrarCaminhoneiro("Roberto", 11.5);
        Professor contribuinte3 = sistema.cadastrarProfessor("Tiago", 1212);
        Medico contribuinte4 = sistema.cadastrarMedico("Sabrina", 125);
        Professor contribuinte5 = sistema.cadastrarProfessor("Alice", 2424);
        Taxista contribuinte6 = sistema.cadastrarTaxista("Pedro", 180);
        Caminhoneiro contribuinte7 = sistema.cadastrarCaminhoneiro("Rodolfo", 15);
        Medico contribuinte8 = sistema.cadastrarMedico("Gabriela", 365);
        Professor contribuinte9 = sistema.cadastrarProfessor("José", 3000);
        Taxista contribuinte10 = sistema.cadastrarTaxista("Lucas", 200);
        Caminhoneiro contribuinte11 = sistema.cadastrarCaminhoneiro("Davi", 25);
        Medico contribuinte12 = sistema.cadastrarMedico("Vanessa", 700);

        // Adicionando bens
        contribuinte1.addBem("Carro", 100000);
        contribuinte3.addBem("Casa", 50000);
        contribuinte4.addBem("Casa", 250000);
        contribuinte4.addBem("Carro", 100000);
        contribuinte5.addBem("Carro", 35000);
        contribuinte6.addBem("Carro", 65000);
        contribuinte7.addBem("Casa", 90000);
        contribuinte8.addBem("Casa", 120000);
        contribuinte9.addBem("Casa", 75000);
        contribuinte10.addBem("Carro", 25000);
        contribuinte11.addBem("Carro", 150000);
        contribuinte12.addBem("Casa", 750000);

        // Por profissao
        System.out.println("==================== Professor ===================");
        sistema.getContribuintes().stream().filter(contribuinte -> contribuinte.getClass().getSimpleName().equals("Professor")).forEach(System.out::println);
        System.out.println("=================== Caminhoneiro ==================");
        sistema.getContribuintes().stream().filter(contribuinte -> contribuinte.getClass().getSimpleName().equals("Caminhoneiro")).forEach(System.out::println);
        System.out.println("====================== Médico =====================");
        sistema.getContribuintes().stream().filter(contribuinte -> contribuinte.getClass().getSimpleName().equals("Medico")).forEach(System.out::println);
        System.out.println("====================== Taxista ====================");
        sistema.getContribuintes().stream().filter(contribuinte -> contribuinte.getClass().getSimpleName().equals("Taxista")).forEach(System.out::println);

        // Calculo
        System.out.println("===================== Impostos ====================");
        System.out.println(contribuinte1);
        System.out.printf("Impostos: R$ %.2f\n", contribuinte1.calcularImposto(5000));
        System.out.println(contribuinte6);
        System.out.printf("Impostos: R$ %.2f\n", contribuinte6.calcularImposto(5000));
        System.out.println(contribuinte9);
        System.out.printf("Impostos: R$ %.2f\n", contribuinte9.calcularImposto(200));

        // Sinais de riqueza
        System.out.println("================ Sinais de riqueza ================");
        System.out.println(contribuinte1);
        System.out.println("Sinal de riqueza: " + (sistema.avaliarRiquza(contribuinte1) ? "Excessivo" : "Não excessivo"));
        System.out.println(contribuinte2);
        System.out.println("Sinal de riqueza: " + (sistema.avaliarRiquza(contribuinte2) ? "Excessivo" : "Não excessivo"));
        System.out.println(contribuinte4);
        System.out.println("Sinal de riqueza: " + (sistema.avaliarRiquza(contribuinte2) ? "Excessivo" : "Não excessivo"));
    }
}