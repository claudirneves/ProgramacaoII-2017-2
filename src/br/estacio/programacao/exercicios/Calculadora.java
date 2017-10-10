/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.exercicios;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
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
    public int operacao;
    public double primeiroNumero;
    public double segundoNumero;
    public double resultado;
    public boolean verifica;
    public boolean zerar;
    public String segundo = "";
    
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
        btnPonto = new JButton(",");
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
        
        txtValores.setPreferredSize(new Dimension(210, 37));
        
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
        btnTres.addActionListener(this);
        btnQuatro.addActionListener(this);
        btnCinco.addActionListener(this);
        btnSeis.addActionListener(this);
        btnSete.addActionListener(this);
        btnOito.addActionListener(this);
        btnNove.addActionListener(this);
        btnZero.addActionListener(this);
        btnSoma.addActionListener(this);
        btnSubtrai.addActionListener(this);
        btnMultiplica.addActionListener(this);
        btnDivide.addActionListener(this);
        btnPonto.addActionListener(this);
        btnIgual.addActionListener(this);
        txtValores.setFont(new Font("arial",Font.BOLD,18));
        txtValores.setEnabled(false);
        
        
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if (e.getSource() == btnUm) {
            if (zerar) {
                txtValores.setText("");
                if (verifica) {
                    segundo = segundo + "1";
                    txtValores.setText(txtValores.getText() + "1");
                } else {
                    txtValores.setText(txtValores.getText() + "1");
                }
                zerar = false;
            } else {
                if (verifica) {
                    segundo = segundo + "1";
                    txtValores.setText(txtValores.getText() + "1");
                } else {
                    txtValores.setText(txtValores.getText() + "1");
                }
            }
        } else if (e.getSource() == btnDois) {
            if (zerar) {
                txtValores.setText("");
                if (verifica) {
                    segundo = segundo + "2";
                    txtValores.setText(txtValores.getText() + "2");
                } else {
                    txtValores.setText(txtValores.getText() + "2");
                }
                zerar = false;
            } else {
                if (verifica) {
                    segundo = segundo + "2";
                    txtValores.setText(txtValores.getText() + "2");
                    
                } else {
                    txtValores.setText(txtValores.getText() + "2");
                }
            }
        } else if (e.getSource() == btnTres) {
            if (zerar) {
                txtValores.setText("");
                if (verifica) {
                    segundo = segundo + "3";
                    txtValores.setText(txtValores.getText() + "3");
                } else {
                    txtValores.setText(txtValores.getText() + "3");
                }
                zerar = false;
            } else {
                if (verifica) {
                    segundo = segundo + "3";
                    txtValores.setText(txtValores.getText() + "3");
                } else {
                    txtValores.setText(txtValores.getText() + "3");
                }
            }
        } else if (e.getSource() == btnQuatro) {
            if (zerar) {
                txtValores.setText("");
                if (verifica) {
                    segundo = segundo + "4";
                    txtValores.setText(txtValores.getText() + "4");
                } else {
                    txtValores.setText(txtValores.getText() + "4");
                }
                zerar = false;
            } else {
                if (verifica) {
                    segundo = segundo + "4";
                    txtValores.setText(txtValores.getText() + "4");
                } else {
                    txtValores.setText(txtValores.getText() + "4");
                }
            }
        } else if (e.getSource() == btnCinco) {
            if (zerar) {
                txtValores.setText("");
                if (verifica) {
                    segundo = segundo + "5";
                    txtValores.setText(txtValores.getText() + "5");
                } else {
                    txtValores.setText(txtValores.getText() + "5");
                }
                zerar = false;
            } else {
                if (verifica) {
                    segundo = segundo + "5";
                    txtValores.setText(txtValores.getText() + "5");
                } else {
                    txtValores.setText(txtValores.getText() + "5");
                }
            }
        } else if (e.getSource() == btnSeis) {
            if (zerar) {
                txtValores.setText("");
                if (verifica) {
                    segundo = segundo + "6";
                    txtValores.setText(txtValores.getText() + "6");
                } else {
                    txtValores.setText(txtValores.getText() + "6");
                }
                zerar = false;
            } else {
                if (verifica) {
                    segundo = segundo + "6";
                    txtValores.setText(txtValores.getText() + "6");
                } else {
                    txtValores.setText(txtValores.getText() + "6");
                }
            }
        } else if (e.getSource() == btnSete) {
            if (zerar) {
                txtValores.setText("");
                if (verifica) {
                    segundo = segundo + "7";
                    txtValores.setText(txtValores.getText() + "7");
                } else {
                    txtValores.setText(txtValores.getText() + "7");
                }
                zerar = false;
            } else {
                if (verifica) {
                    segundo = segundo + "7";
                    txtValores.setText(txtValores.getText() + "7");
                } else {
                    txtValores.setText(txtValores.getText() + "7");
                }
            }
        } else if (e.getSource() == btnOito) {
            if (zerar) {
                txtValores.setText("");
                if (verifica) {
                    segundo = segundo + "8";
                    txtValores.setText(txtValores.getText() + "8");
                } else {
                    txtValores.setText(txtValores.getText() + "8");
                }
                zerar = false;
            } else {
                if (verifica) {
                    segundo = segundo + "8";
                    txtValores.setText(txtValores.getText() + "8");
                } else {
                    txtValores.setText(txtValores.getText() + "8");
                }
            }
        } else if (e.getSource() == btnNove) {
            if (zerar) {
                txtValores.setText("");
                if (verifica) {
                    segundo = segundo + "9";
                    txtValores.setText(txtValores.getText() + "9");
                } else {
                    txtValores.setText(txtValores.getText() + "9");
                }
                zerar = false;
            } else {
                if (verifica) {
                    segundo = segundo + "9";
                    txtValores.setText(txtValores.getText() + "9");
                } else {
                    txtValores.setText(txtValores.getText() + "9");
                }
            }
        } else if (e.getSource() == btnZero) {
            if (zerar) {
                txtValores.setText("");
                if (verifica) {
                    segundo = segundo + "0";
                    txtValores.setText(txtValores.getText() + "0");
                } else {
                    txtValores.setText(txtValores.getText() + "0");
                }
                zerar = false;
            } else {
                if (verifica) {
                    segundo = segundo + "0";
                    txtValores.setText(txtValores.getText() + "0");
                } else {
                    txtValores.setText(txtValores.getText() + "0");
                }
            }
        } else if (e.getSource() == btnSoma) {
            verifica = true;
            primeiroNumero = Double.parseDouble(txtValores.getText());
            operacao = 1;
            txtValores.setText(txtValores.getText() + " + ");
        } else if (e.getSource() == btnSubtrai) {
            verifica = true;
            primeiroNumero = Double.parseDouble(txtValores.getText());
            operacao = 2;
            txtValores.setText(txtValores.getText() + " - ");
        } else if (e.getSource() == btnMultiplica) {
            verifica = true;
            primeiroNumero = Double.parseDouble(txtValores.getText());
            operacao = 3;
            txtValores.setText(txtValores.getText() + " * ");
        } else if (e.getSource() == btnDivide) {
            verifica = true;
            primeiroNumero = Double.parseDouble(txtValores.getText());
            operacao = 4;
            txtValores.setText(txtValores.getText() + " / ");
        } else if (e.getSource() == btnPonto) {
            txtValores.setText(txtValores.getText() + ",");
        } else {
            zerar = true;
            segundoNumero = Double.parseDouble(segundo);
            segundo = "";
            verifica = false;
            switch (operacao) {
                case 1:
                    Soma(primeiroNumero, segundoNumero);
                    break;
                case 2:
                    Subtrai(primeiroNumero, segundoNumero);
                    break;
                case 3:
                    Multiplica(primeiroNumero, segundoNumero);
                    break;
                case 4:
                    Divide(primeiroNumero, segundoNumero);
                    break;
            }
            
        }
        
    }
    
    public double Soma(double n1, double n2) {
        String result;
        resultado = n1 + n2;
        result = String.valueOf(resultado);
        txtValores.setText(result);
        return resultado;
        
    }

    public double Multiplica(double n1, double n2) {
        String result;
        resultado = n1 * n2;
        result = String.valueOf(resultado);
        txtValores.setText(result);
        return resultado;        
    }

    public double Subtrai(double n1, double n2) {
        String result;
        resultado = n1 - n2;
        result = String.valueOf(resultado);
        txtValores.setText(result);
        return resultado;        
    }

    public double Divide(double n1, double n2) {
        String result;
        if (n2 != 0) {
            resultado = n1 / n2;
            result = String.valueOf(resultado);
            txtValores.setText(result);
        } else {
            txtValores.setText("Impossível dividir por zero");
        }
        return resultado;        
    }
     
    
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.setSize(220, 185);
        calculadora.setVisible(true);
    }
    
}
