/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.flowlayout;

import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class FlowLayoutDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FlowLayoutFrame flowLayoutFrame = new FlowLayoutFrame(); 
      flowLayoutFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
      flowLayoutFrame.setSize( 300, 75 );
      flowLayoutFrame.setVisible( true );
    }
    
}
