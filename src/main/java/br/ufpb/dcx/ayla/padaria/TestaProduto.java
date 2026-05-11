package br.ufpb.dcx.ayla.padaria;

public class TestaProduto {
    public static void main(String [] args){
        Produto p1  = new Produto();
        System.out.println(p1.toString());

        Produto p2 = new Produto("001", "Pão francês", true);
        System.out.println(p2.getNome());
    }
}
