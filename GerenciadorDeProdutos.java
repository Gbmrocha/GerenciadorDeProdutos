package produto;

import java.util.*;

public class GerenciadorDeProdutos {
    
    private List <Produto> produtos = new ArrayList <Produto>();
    
    public String addProduto(Produto p){
        produtos.add(p);
        return "Produto adicionado";
    }
    
    public Produto consultaProduto(String nome, String marca){
        Produto atual;
        for(int i = 0; i < produtos.size(); i++){
            atual = produtos.get(i);
            if(atual.getNome().equals(nome) && atual.getMarca().equals(marca)){
                return atual;
            }
        }
        return null;
    }
       
    public String removeProduto(String nome, String marca){
        Produto saindo = consultaProduto(nome, marca);
        if(saindo == null){
            return "Produto não encontrado";
        } else {
            produtos.remove(saindo);
            return "Produto removido com sucesso";
        }
    }
    
    public String atualizaProduto(String nome, String marca, String nNome, String nMarca, Double nPreco){
        Produto att = consultaProduto(nome, marca);
        if(att == null){
            return "Produto não encontrado";
        } else {
            int index = produtos.indexOf(att);
            produtos.get(index).setNome(nNome);
            produtos.get(index).setMarca(nMarca);
            produtos.get(index).setPreco(nPreco);
            return "Produto atualizado com sucesso";
        }
    }

}