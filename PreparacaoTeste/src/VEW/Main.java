/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VEW;

import Controller.AlunoController;
import Model.Aluno;
import Model.AlunoModel;
import java.awt.Window;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Celso Mongane
 */
public class Main {


    public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
             AlunoModel aluno = new AlunoModel();
            AlunoController a = new AlunoController();
            
            int resp;
            Menu();
           resp = teclado.nextInt();
        OUTER:
        
            switch (resp) {
                case 1:
                    aluno.AddDadosAluno();
                    break;
                case 2:
                    aluno.ImprimirAlunos();
                    break;
                case 3:
                    a.DeleteAluno();
                    break;
                case 4:
                    a.AtualizarAluno();
                    break;
                case 0:
                    break ;                             UTER;
                default:
                    break;
            }
          
    }
    
    
    public static void Menu(){
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
        System.out.println("Selecione uma alternativa\n"
                + "[1] - Adicionar Dados\n"
                + "[2] - Listar Dados \n"
                + "[3] - Remover Dados \n"
                + "[4] - Atwalizar Dados\n"
                + "[0] - sair");
          System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
                System.out.print("Resposta: ");
    
    }
    
}
