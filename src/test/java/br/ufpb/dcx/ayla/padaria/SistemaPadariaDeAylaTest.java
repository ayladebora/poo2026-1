package br.ufpb.dcx.ayla.padaria;

import org.junit.jupiter.api.Test;

import java.util.Collection;

import static org.junit.jupiter.api.Assertions.*;

public class SistemaPadariaDeAylaTest {

    @Test
    public void testaConstrutorEObterTodosOsProdutos(){
        SistemaPadariaDeAyla sistema = new SistemaPadariaDeAyla();
        assertEquals(0, sistema.obterTodosOsProdutos().size());
        assertTrue(sistema.obterTodosOsProdutos().size()==0);
    }


    @Test
    public void testaCadastroDeProduto(){
        SistemaPadariaDeAyla sistema = new SistemaPadariaDeAyla();
        assertEquals(0, sistema.obterTodosOsProdutos().size());
        try {
            sistema.cadastrarProduto(new Produto("876", "queijo mussarela", true));
            Collection<Produto> produtosCadastrados = sistema.obterTodosOsProdutos();
            assertEquals(1, produtosCadastrados.size());
        } catch (ProdutoJaExisteException e){
            fail("não deveria lançar esta exceção");
        }

        try {
            sistema.cadastrarProduto(new Produto("876", "queijo mussarela", true));
            fail("deveria lançar esta exceção");
        } catch (ProdutoJaExisteException e){
           //OK
        }

    }

}
