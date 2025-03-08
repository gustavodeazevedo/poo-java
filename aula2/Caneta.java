public class Caneta {
    // atributos
    String cor;
    String marca;
    float ponta;
    int carga;
    boolean tampada;

    // métodos
    void status() {
        System.out.println("A cor é:" + this.cor);
        System.out.println("A marca é:" + this.marca);
        System.out.println("A ponta é:" + this.ponta);
        System.out.println("A carga é:" + this.carga);
        System.out.println("A tampada é:" + this.tampada);
    }

    void rabiscar() {
        if (this.tampada == true) {
            System.out.println("Não posso rabiscar.");
        } else {
            System.out.println("Posso rabiscar");
        }

    }

    void tampar() {
        this.tampada = true;
    }

    void destampar() {
        this.tampada = false;
    }

}
