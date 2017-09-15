/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.exercicio;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author aluno
 */
public class Exercicio extends JFrame {
   
    private BorderLayout layout;

    private JPanel painelNorte;
    private JPanel painelSul;
    private JPanel painelCentro;
    private JPanel painelOeste;
    private JPanel painelLeste;

    private BorderLayout borderLayout;
    private FlowLayout flowLayout;
    private GridLayout gridLayout;
    private GridBagLayout gridBagLayout;

    private JLabel lblBorder1;
    private JLabel lblBorder2;
    private JLabel lblBorder3;

    private JButton btnFlow1;
    private JButton btnFlow2;
    private JButton btnFlow3;

    private JTextField txtGrid1;
    private JTextField txtGrid2;
    private JTextField txtGrid3;

    private JRadioButton rbBox1;
    private JRadioButton rbBox2;
    private JRadioButton rbBox3;

    private JCheckBox cbGridBag1;
    private JCheckBox cbGridBag2;
    private JCheckBox cbGridBag3;

    public Exercicio() {
        layout = new BorderLayout();

        painelCentro = new JPanel();
        painelNorte = new JPanel();
        painelSul = new JPanel();
        painelLeste = new JPanel();
        painelOeste = new JPanel();

        flowLayout = new FlowLayout();
        gridLayout = new GridLayout(3, 1, 0, 0);
        borderLayout = new BorderLayout();
        gridBagLayout = new GridBagLayout();

        painelCentro.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painelSul.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painelLeste.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painelNorte.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        painelOeste.setBorder(BorderFactory.createLineBorder(Color.BLACK));

        lblBorder1 = new JLabel("Primeiro");
        lblBorder2 = new JLabel("Segundo");
        lblBorder3 = new JLabel("Terceiro");
        lblBorder1.setBounds(5, 3, 50, 50);
        lblBorder2.setBounds(5, 7, 70, 80);
        lblBorder3.setBounds(5, 11, 100, 105);

        btnFlow1 = new JButton("Primeiro");
        btnFlow2 = new JButton("Segundo");
        btnFlow3 = new JButton("Terceiro");

        txtGrid1 = new JTextField("Primeiro");
        txtGrid2 = new JTextField("Segundo");
        txtGrid3 = new JTextField("Terceiro");

        rbBox1 = new JRadioButton("Primeiro");
        rbBox2 = new JRadioButton("Segundo");
        rbBox3 = new JRadioButton("Terceiro");

        cbGridBag1 = new JCheckBox("Primeiro");
        cbGridBag2 = new JCheckBox("Segundo");
        cbGridBag3 = new JCheckBox("Terceiro");

        painelCentro.setLayout(null);
        painelSul.setLayout(gridLayout);
        painelLeste.setLayout(borderLayout);
        painelNorte.setLayout(flowLayout);
        painelOeste.setLayout(gridBagLayout);

        painelCentro.add(lblBorder1);
        painelCentro.add(lblBorder2);
        painelCentro.add(lblBorder3);

        painelLeste.add(txtGrid1, BorderLayout.NORTH);
        painelLeste.add(txtGrid2, BorderLayout.SOUTH);
        painelLeste.add(txtGrid3, BorderLayout.CENTER);

        painelNorte.add(rbBox1);
        painelNorte.add(rbBox2);
        painelNorte.add(rbBox3);

        painelOeste.add(cbGridBag1);
        painelOeste.add(cbGridBag2);
        painelOeste.add(cbGridBag3);

        painelSul.add(btnFlow1);
        painelSul.add(btnFlow2);
        painelSul.add(btnFlow3);

        this.setLayout(layout);
        this.add(painelCentro, BorderLayout.CENTER);
        this.add(painelLeste, BorderLayout.WEST);
        this.add(painelNorte, BorderLayout.NORTH);
        this.add(painelOeste, BorderLayout.EAST);
        this.add(painelSul, BorderLayout.SOUTH);

        this.setSize(500, 520);
        this.setVisible(true);
        
         setLocationRelativeTo(null);
         setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
         

    }
}
