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
public class Seminario {
    private String titulo;
    private Aluno[] alunos;
    private Professor professor;
    private Local local;
    
    public Seminario(String titulo) {
        this.titulo = titulo;
    }

    public Seminario() {
    }
    
    public void print(){
        System.out.println("-----Seminário-----");
        System.out.println("Titulo: " + this.titulo);
        System.out.println(this.professor != null ? "Professor palestrante:" + this.professor.getNome() : "Nenhum professor para esse seminário");
        
        if(this.local != null){
            System.out.println("Local: " + this.local.getRua() + " " + this.local.getBairro());
        }else{
            System.out.println("Não há local cadastrado");
        }

        if(this.alunos != null && this.alunos.length != 0){
        System.out.println("Alunos: ");
        for(Aluno aluno : alunos){
            System.out.println(aluno.getNome());
        }
        }else{
            System.out.println("Esse seminário não tem nenhum aluno");
        }
    }

    public Local getLocal() {
        return local;
    }

    public void setLocal(Local local) {
        this.local = local;
    }
    
    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }
    
    public Aluno[] getAlunos() {
        return alunos;
    }

    public void setAlunos(Aluno[] alunos) {
        this.alunos = alunos;
    }
    
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    
    
}
