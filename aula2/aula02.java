package aula2;

public class aula02 {
    public static void main(String[] args) {
        // instanciando o objeto caneta
        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.marca = "Bic";
        c1.ponta = 0.5f;
        c1.carga = 50;
        c1.destampar();

        c1.rabiscar();
        c1.status();

    }

}
