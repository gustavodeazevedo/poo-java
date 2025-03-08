public class objetoCarro {
    public static void main(String[] args) {
        // instanciando o objeto carro
        // Instanciar é criar um objeto a partir de uma classe

        // Estados
        carro c1 = new carro();
        c1.cor = "Verde";
        c1.modelo = "Mustang";
        c1.ano = 2020;
        c1.kilometros = 100.50f;
        c1.ligado = true;

        // Chamando os métodos definidos na classe carro
        c1.informacaoCor();
        c1.informacaoModelo();
        c1.informacaoAno();
        c1.informacaoRevisao();
    }
}