/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.banco;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author aluno
 */
public class TesteConexao {
    public static void main(String[] args){
        final String URL = "jdbc:postgresql://localhost:5432/progii_bd";
        final String USUARIO = "postgres";
        final String SENHA = "estacio@123";
        Connection conexao;
        try {
            conexao = DriverManager.getConnection(URL, USUARIO, SENHA);
            System.out.println("Conectou!!!!!!!!!!");
        } catch (SQLException ex) {
            Logger.getLogger(TesteConexao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
