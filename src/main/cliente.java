package main;
import java.util.Scanner;

public class cliente{

  Scanner input = new Scanner(System.in);

  //atributos da classe
  private String nome, cpf;
  private int senha;
  private double saldo;

  //contrutor do cliente
  public cliente(){
    this.cpf = "12345678910";
    this.nome = "Rafael";
    this.senha = 1234;
    this.saldo =  1000;

  }
  
  public cliente(String nome, String cpf, int senha, double saldo){
    this.nome = nome;
    this.cpf = cpf;
    this.senha = senha;
    this.saldo = saldo;
  }

  //---------------------------------------------------------
  //---------------------------------------------------------
  // Métodos para receber os atributos privados da classe
  public String getNome() {
    return nome;
  }
  public String getCpf() {
    return cpf;
  }
  public int getSenha() {
    return senha;
  }
  public double getSaldo() {
    return saldo;
  }

  //-----------------------------------------------------------
  //-----------------------------------------------------------

  //metodos para acessar e alterar os atributos privado da classe
  public void setNome(String nome){
    this.nome = nome;
  }
  public void setCpf(String cpf){
    this.cpf = cpf;
  }
  public void setSenha(int senha){
    this.senha = senha;
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
