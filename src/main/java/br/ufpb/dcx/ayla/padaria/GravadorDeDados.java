package br.ufpb.dcx.ayla.padaria;

import java.io.*;
import java.util.Collection;

public class GravadorDeDados {

    public static final String NOME_ARQUIVO_PRODUTOS = "produtos.txt";

    public void salvarProdutos(Collection<Produto> produtos) throws IOException {
        //TODO

        ObjectOutputStream gravador = null;
        try {
            gravador = new ObjectOutputStream(new FileOutputStream(NOME_ARQUIVO_PRODUTOS));
            gravador.writeObject(produtos);
        } finally {
            if (gravador!=null){
                gravador.close();
            }
        }
    }

    public Collection recuperarProdutos() throws IOException{
        ObjectInputStream leitor = null;
        try {
            leitor = new ObjectInputStream(new FileInputStream(NOME_ARQUIVO_PRODUTOS));
            Collection<Produto> produtosRecuperados = (Collection<Produto>) leitor.readObject();
            return produtosRecuperados;
        } catch(ClassNotFoundException e){
            throw new IOException("Classe desconhecida:" + e.getMessage());
        } finally {
            if (leitor!=null){
                leitor.close();
            }
        }

    }
}
