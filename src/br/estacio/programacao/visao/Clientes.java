/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.estacio.programacao.visao;

/**
 *
 * @author aluno
 */
public class Clientes {
    private String nome;
    private String email;
    private String senha;
    private String sexo;
    private String time;
    private String[] leitura = new String[3];

    public String[] getLeitura() {
        return leitura;
    }

    public void setLeitura(String[] leitura) {
        this.leitura = leitura;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "\nE-mail: " + this.email
                + "\nSenha: " + this.senha + "\nSexo: " + this.sexo
                + "\nTime: " + this.time + "\nLeituras: "
                + this.leitura[0] + " " + this.leitura[1]
                + " " + this.leitura[2];

    }
}
