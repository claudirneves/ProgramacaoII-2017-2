/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.exercicios;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Claudir
 */
public class Calculadora extends JFrame implements ActionListener {

    /**
     * @param args the command line arguments
     */
    private JButton btnUm;
    private JButton btnDois;
    private JButton btnTres;
    private JButton btnQuatro;
    private JButton btnCinco;
    private JButton btnSeis;
    private JButton btnSete;
    private JButton btnOito;
    private JButton btnNove;
    private JButton btnZero;
    private JButton btnPonto;
    private JButton btnIgual;
    private JButton btnSoma;
    private JButton btnDivide;
    private JButton btnSubtrai;
    private JButton btnMultiplica;
    private GridLayout botoesLayout;
    private FlowLayout textoLayout;
    private JTextField txtValores;
    private JPanel painelTexto;
    private JPanel painelBotoes;
    private BorderLayout layout;

    public Calculadora() {
        super("Calculadora");
        btnUm = new JButton("1");
        btnDois = new JButton("2");
        btnTres = new JButton("3");
        btnQuatro = new JButton("4");
        btnCinco = new JButton("5");
        btnSeis = new JButton("6");
        btnSete = new JButton("7");
        btnOito = new JButton("8");
        btnNove = new JButton("9");
        btnZero = new JButton("0");
        btnPonto = new JButton(".");
        btnSoma = new JButton("+");
        btnDivide = new JButton("/");
        btnSubtrai = new JButton("-");
        btnMultiplica = new JButton("*");
        btnIgual = new JButton("=");
        txtValores = new JTextField();
        painelTexto = new JPanel();
        painelBotoes = new JPanel();
        botoesLayout = new GridLayout(4, 4, 2, 2);
        textoLayout = new FlowLayout(FlowLayout.CENTER, 5, 5);
        layout = new BorderLayout();

        txtValores.setPreferredSize(new Dimension(200, 25));
        // btnUm.setText("DIGITE AQU);
        painelTexto.setBounds(5, 5, 50, 180);

        painelTexto.setLayout(textoLayout);
        painelBotoes.setLayout(botoesLayout);

        painelTexto.add(txtValores);
        painelBotoes.add(btnUm);
        painelBotoes.add(btnDois);
        painelBotoes.add(btnTres);
        painelBotoes.add(btnDivide);
        painelBotoes.add(btnQuatro);
        painelBotoes.add(btnCinco);
        painelBotoes.add(btnSeis);
        painelBotoes.add(btnMultiplica);
        painelBotoes.add(btnSete);
        painelBotoes.add(btnOito);
        painelBotoes.add(btnNove);
        painelBotoes.add(btnSubtrai);
        painelBotoes.add(btnZero);
        painelBotoes.add(btnPonto);
        painelBotoes.add(btnIgual);
        painelBotoes.add(btnSoma);

        this.setLayout(layout);
        this.add(painelTexto, BorderLayout.NORTH);
        this.add(painelBotoes, BorderLayout.SOUTH);
        this.setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        btnUm.addActionListener(this);
        btnDois.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnUm){
          txtValores.setText("1");  
        }else if(e.getSource()==btnDois){
            txtValores.setText("2");
        }
        
       }

    

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setSize(220, 185);
        calculadora.setVisible(true);
    }

}
