public class Produto {

    String nome;
    double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        if (preco < 0) {
            System.out.println("Preço inválido!");
            this.preco = 0;
        } else {
            this.preco = preco;
        }
    }

    public void exibirProduto() {
        System.out.println("Produto: " + nome);
        System.out.println("Preço: " + preco);
    }
}
