public class carro {
    // Atributos
    String cor;
    String modelo;
    int ano;
    float kilometros;
    boolean ligado;

    // Métodos
    void andar() {
        if (ligado == true) {
            System.out.println("Carro começa a andar");
        } else {
            System.out.println("Carro não começa a andar");
        }
    }

    void informacaoCor() {
        System.out.println("A cor do carro é: " + this.cor);
    }

    void informacaoModelo() {
        System.out.println("O modelo do carro é: " + this.modelo);
    }

    void informacaoAno() {
        if (ano >= 2020) {
            System.out.println("O carro está novo!");
        }
    }

    void informacaoRevisao() {
        if (kilometros >= 200.50f) {
            System.out.println("O carro preciso de revisão!");

        } else {
            System.out.println("O carro não precisa de revisão!");
        }
    }

}