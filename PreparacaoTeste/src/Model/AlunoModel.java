/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.AlunoController;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Celso Mongane
 */
public class AlunoModel {
    Scanner teclado = new Scanner(System.in);
   
    ArrayList<Aluno> dados = new ArrayList<>();



    public void AddDadosAluno(){
            Aluno aluno = new Aluno();
            AlunoController a = new AlunoController();
        System.out.println("-=-=-=-=-=-=-=-=-=-Adicionando Aluno-=-=-=-=-=-=-=-=-");
        
        System.out.print("Nome: ");
        aluno.setNome( teclado.next());
        System.out.print("Apelido: ");
        aluno.setApelido(teclado.next());
        System.out.print("Morada: ");
        aluno.setMorada(teclado.next());
        System.out.print("Nota1: ");
        aluno.setNota1(teclado.nextDouble());
        System.out.print("Nota2: ");
        aluno.setNota2(teclado.nextDouble());
        System.out.println(aluno.getNota2());
      
        aluno.setStatus(true);
        System.out.println("Adicionado com sucesso!");
        a.AddDados(aluno);
        }
    
    public void ImprimirAlunos(){
        AlunoController aluno = new AlunoController();
        ArrayList<Aluno> ListarDados = aluno.ListarDados();
        for(Aluno v: ListarDados){
            if(v.isStatus() == true)
            System.out.println("Id: "+v.getId()+"\n"
                    + "Nome: " +v.getNome()+"\n"
                    + "Apelido: "+v.getApelido()+"\n"
                            + "Morada: "+v.getMorada()+"\n"
                                    + "Nota1: "+v.getNota1()+"\n"
                                            + "Nota2: "+v.getNota2()+"\n"
                                                    + "Media: "+v.getMedia()+"\n"
                                                            + "Status: "+v.isStatus());
            System.out.println("  ");
      
                                                            
        }
        
    }
    public double MediaAluno(double nota1,double nota2){
        Aluno aluno = new Aluno();
        double media = (nota1+nota2)/2;
        return media;
    }
}
