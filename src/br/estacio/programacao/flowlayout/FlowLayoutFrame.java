/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.flowlayout;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
class FlowLayoutFrame extends JFrame{

    private JButton botao;
    private FlowLayout layout;
    private Container container;

    public FlowLayoutFrame() {
        super("FlowLayout Teste em Aula");
        layout = new FlowLayout();
        container =  getContentPane();
        setLayout(layout);
        botao = new JButton("Esquerda");
        add(botao);
        botao.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent event) {
                layout.setAlignment(FlowLayout.LEFT);
                layout.layoutContainer(container);
            }

        }
        );
    }

    
}
