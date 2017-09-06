/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.borderlayout;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


/**
 *
 * @author aluno
 */
public class ExemploBorderLayout extends JFrame {

    private JButton botaoSul;// = new JButton("Botão ao Sul");
    private JButton botaoNorte;
    private JButton botaoOeste;
    private JButton botaoLeste;
    private JButton botaoCentro;

    private BorderLayout layout;
    
    public ExemploBorderLayout(){
        botaoSul = new JButton("Botão ao Sul");
        botaoNorte = new JButton("Botão ao Norte");
        botaoLeste = new JButton("Botão ao Leste");
        botaoOeste = new JButton("Botão ao Oeste");
        botaoCentro = new JButton("Botão ao Centro");
        layout = new BorderLayout();
        
      
        this.setLayout(layout);
        add(botaoSul, BorderLayout.SOUTH);
        add(botaoCentro, BorderLayout.CENTER);
        add(botaoLeste, BorderLayout.EAST);
        add(botaoOeste, BorderLayout.WEST);
          
    }
    
}
