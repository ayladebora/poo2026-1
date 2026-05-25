package br.ufpb.dcx.ayla.padaria;

import java.io.IOException;
import java.util.Collection;


public interface SistemaPadaria {



    void cadastrarProduto(Produto produto) throws ProdutoJaExisteException;
    int contarTiposDeProduto();
    Produto pesquisarProdutoPeloCodigo(String codigo) throws ProdutoNaoCadastradoException;
    Collection<Produto> pesquisarProdutosComCodigoComecandoCom(String prefixoNome);
    Collection<Produto> obterTodosOsProdutos();
    void salvarDados() throws IOException;
    void recuperarDados() throws IOException;


}
