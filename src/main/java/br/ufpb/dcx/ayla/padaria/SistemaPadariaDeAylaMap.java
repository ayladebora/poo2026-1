package br.ufpb.dcx.ayla.padaria;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class SistemaPadariaDeAylaMap implements  SistemaPadaria {

    private Map<String , Produto> produtosMap;

    public SistemaPadariaDeAylaMap(){
        this.produtosMap = new HashMap<>();
    }

    public void cadastrarProduto(Produto produto) throws ProdutoJaExisteException {
//  TODO
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
        return null;
        //TODO
    }


}
