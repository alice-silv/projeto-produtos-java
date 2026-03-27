// ORIGINAL 
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "produtos")
public class Produtos {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String nome;

    private String descricao;

    @Column(nullable = false)
    private BigDecimal preco;

    @Column(name = "codigo_barras")
    private String codigoBarras;
}


//O QUE EU MUDEI:

// Importei Scanner para conseguir ler dados digitados pelo usuário
import java.util.Scanner;

public class CadastroPessoa {

    public static void main(String[] args) {

        // Criação do objeto Scanner para entrada de dados
        Scanner scanner = new Scanner(System.in);

        // Mensagem inicial do sistema
        System.out.println("=== Cadastro de Pessoa ===");

        // Solicita o nome
        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        // Solicita a idade
        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        // Validação simples da idade
        if (idade < 0) {
            System.out.println("Idade inválida!");
        } else {
            // Exibe as informações cadastradas
            System.out.println("\nDados cadastrados:");
            System.out.println("Nome: " + nome);
            System.out.println("Idade: " + idade);
        }

        scanner.close();
    

