package produto;

import java.util.*;

public class App {
    public static void main(String[] args) {
        int menuController = 3;
        Scanner menu = new Scanner(System.in);
        String marca = "", nome = "";
        Double preco = 0.0;

        GerenciadorDeProdutos produtos = new GerenciadorDeProdutos();

        System.out.println("Bem-Vindo ao Gerenciador de  Produtos");

       do {
            System.out.println("1 - Adicionar | 2 - Consultar | 3 - Remover | 4 - Atualizar | 0 - Encerrar");
            System.out.println("Selecione o processo que deseja realizar: ");
            menuController = menu.nextInt();

            switch (menuController) {
                case 1:
                    System.out.println("ADICIONAR PRODUTO");
                    System.out.println("Nome do Produto ");
                    nome = menu.next();
                    System.out.println("Marca do Produto: ");
                    marca = menu.next();
                    System.out.println("Preço do Produto: ");
                    preco = menu.nextDouble();
                    System.out.println(produtos.addProduto(new Produto(nome, marca, preco)));
                    break;
                case 2:
                    System.out.println("CONSULTAR PRODUTOS");
                    System.out.println("Nome do Produto ");
                    nome = menu.next();
                    System.out.println("Marca do Produto: ");
                    marca = menu.next();
                    Produto produto = produtos.consultaProduto(nome, marca);

                    System.out.println(produto);
                    break;
                case 3:
                    System.out.println("REMOVER PRODUTO");
                    System.out.println("Nome do Produto ");
                    nome = menu.next();
                    System.out.println("Marca do Produto: ");
                    marca = menu.next();

                    System.out.println(produtos.removeProduto(nome, marca));;
                    break;
                case 4: 
                    System.out.println("ATUALIZAR PRODUTO");
                    System.out.println("Nome do Produto ");
                    nome = menu.next();
                    System.out.println("Marca do Produto: ");
                    marca = menu.next();
                    System.out.println("Novo nome do Produto ");
                    String nomeNovo = menu.next();
                    System.out.println("Nova marca do Produto: ");
                    String marcaNovo = menu.next();
                    System.out.println("Novo preço do Produto: ");
                    Double precoNovo = menu.nextDouble();
                    
                    System.out.println(produtos.atualizaProduto(nome, marca, nomeNovo, marcaNovo, precoNovo));
                    break;
                case 0:
                    System.out.println("Encerrando aplicação");
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente...");
                    break;
            }
            
        } while (menuController != 0);
       
        menu.close();
    }   

}