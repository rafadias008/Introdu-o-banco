package main;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class cliente{

  //atributos da classe
  private String nome;
  private String cpf;
  private int senha;
  private String tipo;
  private double saldo;

  //---------------------------------------------------------
  //---------------------------------------------------------
  // Métodos para acessar as variáveis privadas
  public String getNome() {
    return nome;
  }
  public String getCpf() {
    return cpf;
  }
  public int getSenha() {
    return senha;
  }
  public String getTipo() {
    return tipo;
  }
  public double getSaldo() {
    return saldo;
  }
  

  //-----------------------------------------------------------
  //-----------------------------------------------------------

  //metodo de contrutor do cliente
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public void setSenha(int senha){
    this.senha = senha;
  }
  public void setTipo(String tipo){
    this.tipo = tipo;
  }
  public void setSaldo(double saldo){
    this.saldo = saldo;
  }

  //----------------------------------------------------------------
  //----------------------------------------------------------------
  //metodos da classe 
  public void saque() {
    System.out.println("Saque!");
  }
  public void deposito() {
    System.out.println("Deposito!");
  }
  public void transferencia() {
    System.out.println("Transferencia!"); 
  } 
  public void extrato() {
    System.out.println("Extrato!"); 
  }

  

}
