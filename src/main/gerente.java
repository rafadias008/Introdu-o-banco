package main;
import java.util.Scanner;


public class gerente{

  Scanner input = new Scanner(System.in);

  private String nomeG, cpfG,tipoG;
  private int senhaG;
  
  //construtor adm principal
  public gerente(){
    this.cpfG = "0000";
    this.nomeG = "Administrador";
    this.senhaG = 1234;
    this.tipoG = "ADM";
  }

  //contrutor para novos gerentes
  public gerente(String nomeG, String cpfG, int senhaG, String tipoG){
    this.cpfG = cpfG;
    this.nomeG = nomeG;
    this.senhaG = senhaG;
    this.tipoG = tipoG;

  }

  // Métodos para receber os atributos privados dos gerentes
  public String getNomeG() {
    return nomeG;
  }
  public String getCpfG() {
    return cpfG;
  }
  public int getSenhaG() {
    return senhaG;
  }
  public String getTipoG() {
    return tipoG;
  }

  //metodos para acessar e alterar os atributos privados dos gerentes
  public void setCpfG(String cpfG){
    this.cpfG = cpfG;
  }
  public void setNomeG(String nomeG){
    this.nomeG = nomeG;
  }
  public void setSenhaG(int senhaG){
    this.senhaG = senhaG;
  }
  public void setTipoG(String tipoG){
    this.tipoG = tipoG;
  }
  
  //metodos da classe
  void criarGerente(){

  }
  void criarCliente(){

    cliente novoCliente = new cliente();

    System.out.println("Criar novo cliente!\n");

    System.out.print("Informe o nome: ");
    novoCliente.setNome(input.next());
    System.out.print("\nInforme o CPF: ");
    novoCliente.setCpf(input.next());
    System.out.print("\nInforme a senha: ");
    novoCliente.setSenha(input.nextInt());
    System.out.print("\nInforme o saldo inicial: ");
    novoCliente.setSaldo(input.nextDouble());

    System.out.println("\nCliente criado com sucesso!\n");

  }
  void excluirCliente(){
    System.out.println("Excluir cliente!");
  }
  void listarClientes(){

    cliente clientes = new cliente();

    System.out.println("Listar clientes!");

    System.out.println("Nome: " + clientes.getNome());
    System.out.println("CPF: " + clientes.getCpf());
    System.out.println("Saldo: " + clientes.getSaldo());
    
  }
  void transferencia(){
    System.out.println("Transferencia!");
  }

  
  

}