import java.util.ArrayList;
import java.util.Scanner;

public class SistemaCadastroLivros {
    private ArrayList<Livro> listaLivros;
    private Scanner scanner;

    public SistemaCadastroLivros() {
        listaLivros = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public static void main(String[] args) {
        SistemaCadastroLivros sistema = new SistemaCadastroLivros();
        sistema.exibirMenu();
    }

    public void exibirMenu() {
        int opcao = 0;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1 - Incluir");
            System.out.println("2 - Alterar");
            System.out.println("3 - Consultar");
            System.out.println("4 - Excluir");
            System.out.println("5 - Listar");
            System.out.println("6 - Sair");

            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner

            switch (opcao) {
                case 1:
                    incluirLivro();
                    break;
                case 2:
                    alterarLivro();
                    break;
                case 3:
                    consultarLivro();
                    break;
                case 4:
                    excluirLivro();
                    break;
                case 5:
                    listarLivros();
                    break;
                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 6);
    }

    public void incluirLivro() {
        System.out.println("\n=== Incluir Livro ===");

        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();

        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();

        System.out.print("Digite o ano de publicação do livro: ");
        int anoPublicacao = scanner.nextInt();
        scanner.nextLine(); // Limpa o buffer do scanner

        System.out.print("Digite o ISBN do livro: ");
        String isbn = scanner.nextLine();

        System.out.print("Digite a editora do livro: ");
        String editora = scanner.nextLine();

        Livro livro = new Livro(titulo, autor, anoPublicacao, isbn, editora);
        listaLivros.add(livro);

        System.out.println("Livro cadastrado com sucesso!");
    }

    public void alterarLivro() {
        System.out.println("\n=== Alterar Livro ===");

        System.out.print("Digite o título do livro que deseja alterar: ");
        String titulo = scanner.nextLine();

        Livro livro = buscarLivro(titulo);

        if (livro != null) {
            System.out.print("Digite o novo título do livro: ");
            String novoTitulo = scanner.nextLine();
            livro.setTitulo(novoTitulo);

            System.out.print("Digite o novo autor do livro: ");
            String novoAutor = scanner.nextLine();
            livro.setAutor(novoAutor);

            System.out.print("Digite o novo ano de publicação do livro: ");
            int novoAnoPublicacao = scanner.nextInt();
            scanner.nextLine(); // Limpa o buffer do scanner
            livro.setAnoPublicacao(novoAnoPublicacao);

            System.out.print("Digite o novo ISBN do livro: ");
            String novoISBN = scanner.nextLine();
            livro.setISBN(novoISBN);

            System.out.print("Digite a nova editora do livro: ");
            String novaEditora = scanner.nextLine();
            livro.setEditora(novaEditora);

            System.out.println("Livro alterado com sucesso!");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void consultarLivro() {
        System.out.println("\n=== Consultar Livro ===");

        System.out.print("Digite o título do livro que deseja consultar: ");
        String titulo = scanner.nextLine();

        Livro livro = buscarLivro(titulo);

        if (livro != null) {
            System.out.println(livro);
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void excluirLivro() {
        System.out.println("\n=== Excluir Livro ===");

        System.out.print("Digite o título do livro que deseja excluir: ");
        String titulo = scanner.nextLine();

        Livro livro = buscarLivro(titulo);

        if (livro != null) {
            listaLivros.remove(livro);
            System.out.println("Livro excluído com sucesso!");
        } else {
            System.out.println("Livro não encontrado.");
        }
    }

    public void listarLivros() {
        System.out.println("\n=== Listagem de Livros ===");

        if (listaLivros.isEmpty()) {
            System.out.println("Não há livros cadastrados.");
        } else {
            for (Livro livro : listaLivros) {
                System.out.println(livro);
            }
        }
    }

    public Livro buscarLivro(String titulo) {
        for (Livro livro : listaLivros) {
            if (livro.getTitulo().equalsIgnoreCase(titulo)) {
                return livro;
            }
        }
        return null;
    }
}

class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;
    private String editora;

    public Livro(String titulo, String autor, int anoPublicacao, String isbn, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        this.isbn = isbn;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    public String getISBN() {
        return isbn;
    }

    public void setISBN(String isbn) {
        this.isbn = isbn;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                ", isbn='" + isbn + '\'' +
                ", editora='" + editora + '\'' +
                '}';
    }
}
