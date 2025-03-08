public class aula02 {
    public static void main(String[] args) {
        // instanciando o objeto caneta
        // Instanciar é criar um objeto a partir de uma classe

        // definindo os estados
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
