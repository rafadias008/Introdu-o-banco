package main;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class cliente{

  Scanner input = new Scanner(System.in);

  //atributos da classe
  private String nome;
  private String cpf;
  private int senha;
  private String tipo;
  private double saldo;

  //contrutor do cliente
  public cliente(){
    this.cpf = "12345678910";
    this.nome = "Rafael";
    this.senha = 1234;
    this.saldo =  1000;
    this.tipo = "Comum";

  }

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
    
    System.out.println("Saque!\n");

    System.out.print("Digite o valor para saque: ");
    double valor = input.nextDouble();
    setSaldo(getSaldo() - valor);
    System.out.println("\nValor debitado!\nSaldo atual: " + getSaldo() + "\n") ;

  }
  public void deposito() {
    System.out.println("Deposito!\n");

    System.out.print("Digite o valor para deposito: ");
    double valor = input.nextDouble();
    setSaldo(getSaldo() + valor);
    System.out.println("\nValor depositado!\nSaldo atual: " + getSaldo() + "\n");
    
  }
  public void transferencia() {
    System.out.println("Transferencia!"); 

  } 
  public void extrato() {
    System.out.println("Extrato!"); 
  }

  

}
