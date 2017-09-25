/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.exercicios;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Claudir
 */
public class Calculadora extends JFrame {

    /**
     * @param args the command line arguments
     */
    private JButton um;
    private JButton dois;
    private JButton tres;
    private JButton quatro;
    private JButton cinco;
    private JButton seis;
    private JButton sete;
    private JButton oito;
    private JButton nove;
    private JButton zero;
    private JButton ponto;
    private JButton igual;
    private JButton soma;
    private JButton divide;
    private JButton subtrai;
    private JButton multiplica;
    private GridLayout botoesLayout;
    private FlowLayout textoLayout;
    private JTextField valores;
    private JPanel painelTexto;
    private JPanel painelBotoes;
    private BorderLayout layout;

    public Calculadora() {
        super("Calculadora");
        um = new JButton("1");
        dois = new JButton("2");
        tres = new JButton("3");
        quatro = new JButton("4");
        cinco = new JButton("5");
        seis = new JButton("6");
        sete = new JButton("7");
        oito = new JButton("8");
        nove = new JButton("9");
        zero = new JButton("0");
        ponto = new JButton(".");
        soma = new JButton("+");
        divide = new JButton("/");
        subtrai = new JButton("-");
        multiplica = new JButton("*");
        igual = new JButton("=");
        valores = new JTextField();
        painelTexto = new JPanel();
        painelBotoes = new JPanel();
        botoesLayout = new GridLayout(4, 4, 2, 2);
        textoLayout = new FlowLayout();
        layout = new BorderLayout();
        valores.setSize(10,100);
        painelTexto.setBounds(5, 5,50,100);

        painelTexto.setLayout(textoLayout);
        painelBotoes.setLayout(botoesLayout);

        painelTexto.add(valores);
        painelBotoes.add(um);
        painelBotoes.add(dois);
        painelBotoes.add(tres);
        painelBotoes.add(divide);
        painelBotoes.add(quatro);
        painelBotoes.add(cinco);
        painelBotoes.add(seis);
        painelBotoes.add(multiplica);
        painelBotoes.add(sete);
        painelBotoes.add(oito);
        painelBotoes.add(nove);
        painelBotoes.add(subtrai);
        painelBotoes.add(zero);
        painelBotoes.add(ponto);
        painelBotoes.add(igual);
        painelBotoes.add(soma);

        this.setLayout(layout);
        this.add(painelTexto, BorderLayout.NORTH);
        this.add(painelBotoes, BorderLayout.SOUTH);

        setLocationRelativeTo(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setSize(220, 300);
        calculadora.setVisible(true);
    }

}
