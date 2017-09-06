/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.gridlayout;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author aluno
 */
public class ExemploGridLayout extends JFrame {

    private JButton botaoUm;
    private JButton botaoDois;
    private JButton botaoTres;
    private JButton botaoQuatro;
    private JButton botaoCinco;
    private JButton botaoSeis;
    private GridLayout layout;
    private GridLayout layout1;

    public ExemploGridLayout() {
        botaoUm = new JButton("Um");
        botaoDois = new JButton("Dois");
        botaoTres = new JButton("Três");
        botaoQuatro = new JButton("Quatro");
        botaoCinco = new JButton("Cinco");
        botaoSeis = new JButton("Seis");
        layout = new GridLayout(2,2,5,5);
        layout1 = new GridLayout();

        this.setLayout(layout);

        add(botaoUm);
        add(botaoDois);
        add(botaoTres);
        add(botaoQuatro);
        add(botaoCinco);
        add(botaoSeis);
        this.setSize(500, 500);
        this.setVisible(true);
        

    }

}
