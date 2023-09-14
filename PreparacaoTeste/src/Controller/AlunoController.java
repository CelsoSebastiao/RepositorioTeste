/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Aluno;
import Model.AlunoModel;
import java.sql.PreparedStatement;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Celso Mongane
 */
public class AlunoController {
    PreparedStatement ps;
    Scanner teclado = new Scanner(System.in);

    public void AddDados(Aluno a){
        AlunoModel al = new AlunoModel();
        
        String sql = "insert into tbaluno(nome, apelido, morada,estado,nota1,nota2, media) value(?,?,?,?,?,?,?)";
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, a.getNome());
            ps.setString(2,a.getApelido());
            ps.setString(3, a.getMorada());
            ps.setBoolean(4, a.isStatus());
            ps.setDouble(5,a.getNota1());
            ps.setDouble(6, a.getNota2());
            ps.setDouble(7,al.MediaAluno(a.getNota1(),a.getNota2()));
            ps.execute();
            ps.close();
            JOptionPane.showMessageDialog(null, "Dados Adicionados com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showConfirmDialog(null, "AddDadosAluno "+e);
        }
    }
    public ArrayList<Aluno> ListarDados(){
        ArrayList<Aluno> dados = new ArrayList<>();
        ResultSet rs;
        String sql = "select*from tbaluno";
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){
                
                Aluno aluno = new Aluno();
                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setApelido(rs.getString("apelido"));
                aluno.setMorada(rs.getString("morada"));
                aluno.setStatus(rs.getBoolean("estado"));
                aluno.setNota1(rs.getDouble("nota1"));
                aluno.setNota2(rs.getDouble("nota2"));
                aluno.setMedia(rs.getDouble("media"));
                dados.add(aluno);
                
            }
            
            ps.execute();
            ps.close();
            
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ListardadosAluno " +e);
        }
        return dados;
    }
    public void DeleteAluno(){
        System.out.println("=-=-=-=-=-=-=-=-=Removendo Estudante=-=-=-=-=-=-=-=-=-=-");
        System.out.print("Digite O ID do estudante : ");
        int id = teclado.nextInt();
        String sql = "update tbaluno set estado =? where id = ?";
        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setBoolean(1, false);
            ps.setInt(2, id);
            ps.execute();
            ps.close();
            System.out.println("Removido Com sucesso");
              JOptionPane.showMessageDialog(null, "Apagado Com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "deletarAluno "+e);
        }
       }
    public void AtualizarAluno(){
        
        
}
   
}
