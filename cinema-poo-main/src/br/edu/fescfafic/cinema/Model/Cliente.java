package br.edu.fescfafic.cinema.Model;

public class Cliente{
    public String nome;
    public boolean estudante;
    public Cliente(String nome, boolean estudante) {
        this.nome = nome;
        this.estudante = estudante;
    }
    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", estudante=" + estudante +
                '}';
    }
}
