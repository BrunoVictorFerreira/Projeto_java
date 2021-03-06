/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Heranca.classes;

/**
 *
 * @author bruno.graciano
 */
public class Pessoa {
    protected String nome;
    protected String cpf;
    protected Endereco endereco;
    static {
        System.out.println("Bloc de inicialização estático de pessoa");
    }
    {
        System.out.println("bloco de inicialização de pessoa 1");
    }
    {
        System.out.println("bloco de inicialização de pessoa  2");
    }
    public Pessoa(String nome){
        System.out.println("Dentro do construct de pessoa");
        this.nome = nome;
    }
    
    public Pessoa(String nome, String cpf){
        this(nome);
        this.cpf = cpf;
    }
    
    public void imprime(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Cpf: " + this.cpf);
        System.out.println("Endereco: " + this.endereco.getRua());
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    
}
