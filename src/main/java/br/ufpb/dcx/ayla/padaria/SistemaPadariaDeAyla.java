package br.ufpb.dcx.ayla.padaria;

import java.util.Collection;
import java.util.LinkedList;

public class SistemaPadariaDeAyla implements SistemaPadaria{

    private Collection<Produto> produtos;

    public SistemaPadariaDeAyla(){
        this.produtos = new LinkedList<>();
    }

    public void cadastrarProduto(Produto produto) throws ProdutoJaExisteException {
        if (this.produtos.contains(produto)){
            throw new ProdutoJaExisteException("já existe este produto:"+ produto.toString());
        } else {
            this.produtos.add(produto);
        }
    }

    public int contarTiposDeProduto() {
        //TODO
        return 0;
    }
    public Produto pesquisarProdutoPeloCodigo(String codigo) throws ProdutoNaoCadastradoException{
        //TODO
        return null;
    }
    public Collection<Produto> pesquisarProdutosComCodigoComecandoCom(String prefixoNome){
        //TODO
        return null;
    }
    public Collection<Produto> obterTodosOsProdutos(){
        return this.produtos;
    }


}
