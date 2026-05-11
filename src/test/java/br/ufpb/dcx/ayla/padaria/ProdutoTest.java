package br.ufpb.dcx.ayla.padaria;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


public class ProdutoTest {
    @Test
    public void testeConstrutor(){
        Produto p1 = new Produto();
        assertTrue(p1.ehPerecivel());
        assertEquals("sem código", p1.getCodigo());
        assertEquals("sem nome", p1.getNome());
    }

    @Test
    public void testeConstrutorComParametros(){
        Produto p2 = new Produto("X123", "biscoito olho de sogra", true);
        assertTrue(p2.getNome().equals("biscoito olho de sogra"));
        assertEquals(true, p2.ehPerecivel());
        assertEquals("X123", p2.getCodigo());
    }

    @Test
    public void testaEquals(){

    }

}
