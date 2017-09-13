/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.exercicio;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.BoxLayout;
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

    private BorderLayout borderLayoit;
    private FlowLayout flowLayout;
    private GridLayout gridLayout;
    private BoxLayout boxLayout;
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
        painelCentro = new JPanel();
        painelNorte = new JPanel();
        painelSul = new JPanel();
        painelLeste = new JPanel();
        painelOeste = new JPanel();

        flowLayout = new FlowLayout();
        gridLayout = new GridLayout();
        borderLayoit = new BorderLayout();
        boxLayout = new BoxLayout(this, WIDTH);
        gridBagLayout = new GridBagLayout();

        lblBorder1 = new JLabel("Primeiro");
        lblBorder2 = new JLabel("Segundo");
        lblBorder3 = new JLabel("Terceiro");

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
        
    }
}
