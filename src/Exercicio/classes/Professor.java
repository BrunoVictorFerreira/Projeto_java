/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio.classes;

/**
 *
 * @author bruno.graciano
 */
public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminario;

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor() {
    }
    
    public void print(){
        System.out.println("-----Professor-----");
        System.out.println("Nome professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        if(this.seminario != null && this.seminario.length != 0){
        System.out.print("Seminários: ");
        for(Seminario sem : seminario){
            System.out.println(sem.getTitulo() + " ");
        }
        }else{
            System.out.println("Esse professor não está em nenhum seminário");
        }
    }

    public Seminario[] getSeminario() {
        return seminario;
    }

    public void setSeminario(Seminario[] seminario) {
        this.seminario = seminario;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
