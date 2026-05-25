package br.ufpb.dcx.ayla.padaria;

import java.io.Serializable;
import java.util.Objects;

public class Produto implements Serializable {

    private String nome;
    private String codigo;
    private boolean ehPerecivel;

    public Produto(String codigo, String nome, boolean ehPerecivel){
        this.codigo = codigo;
        this.nome = nome;
        this.ehPerecivel = ehPerecivel;
    }

    public Produto(){
        this("sem código", "sem nome", true);
    }

    public boolean ehPerecivel(){
        return this.ehPerecivel;
    }

    public void setPerecivel(boolean ehPerecivel){
        this.ehPerecivel = ehPerecivel;
    }

    public void setNome(String novoNome){
        this.nome = novoNome;
    }

    public String getNome(){
        return this.nome;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Produto produto = (Produto) o;
        return Objects.equals(codigo, produto.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    @Override
    public String toString() {
        return "Produto " +
                " de nome='" + nome + '\'' +
                ", codigo='" + codigo + '\'' +
                ", ehPerecivel=" + ehPerecivel;
    }
}
