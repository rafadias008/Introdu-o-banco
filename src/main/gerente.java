package main;
import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class gerente{

  Scanner input = new Scanner(System.in);

  private String nomeG;
  private String cpfG;
  private int senhaG;
  private String tipoG;
  
  private String nomePrinG = "Administrador";
  private String cpfPrinG = "0000";
  private int senhaPrinG = 1234;
  private String tipoPrinG = "Gerente Administrador";

  // Métodos para acessar as variáveis privadas dos gerentes
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

  // Métodos para acessar as variaveis privadas de atributos do gerente admins
  public String getNomePrin() {
    return nomePrinG;
  }
  public String getCpfPrin() {
    return cpfPrinG;
  }
  public int getSenhaPrin() {
    return senhaPrinG;
  }
  public String getTipoPrin() {
    return tipoPrinG;
  }
  

  void criarGerente(){

    gerente novoGerente = new gerente();
    System.out.println("Criar Gerente!\n");

    System.out.print("Digite o CPF: ");
    novoGerente.cpfG = input.next();
    System.out.print("Digite o nome: ");
    novoGerente.nomeG = input.next();
    System.out.print("Digite a senha: ");
    novoGerente.senhaG = input.nextInt();
    novoGerente.tipoG = "Gerente";

    System.out.println("\nGerente criado com sucesso!");
  }
  void criarCliente(){

    int tipo_conta;

    cliente cliente = new cliente();

    System.out.println("Criar cliente!\n");

    System.out.print("Digite o CPF: ");
    cliente.setCpf(input.next());
    System.out.print("Digite o nome: ");
    cliente.setNome(input.next());
    System.out.print("Digite a senha: ");
    cliente.setSenha(input.nextInt()); 
    System.out.print("Digite o tipo (1-Comum / 2-Plus): ");
    tipo_conta = input.nextInt();

    if (tipo_conta == 1){
      cliente.setTipo("Comum");
    } else if (tipo_conta == 2){
      cliente.setTipo("Plus");
    } else {
      System.out.println("Tipo inválido!");
    }
    System.out.print("Digite o saldo inicial: ");
    cliente.setSaldo(input.nextDouble());

    System.out.println("\nCliente criado com sucesso!");

  }
  void excluirCliente(){
    System.out.println("Excluir cliente!");
  }
  void listarClientes(){
    System.out.println("Listar clientes!");
  }
  void transferencia(){
    System.out.println("Transferencia!");
  }

  
  

}