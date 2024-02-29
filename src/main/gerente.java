package main;
import java.util.Scanner;

public class gerente{

  Scanner input = new Scanner(System.in);

  private String nomeG;
  private String cpfG;
  private int senhaG;
  private String tipoG;
  
  private String nomePrinG = "Administrador";
  private String cpfPrinG = "123456";
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
  // Métodos para acessar as variáveis privadas
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

    cliente novoCliente = new cliente();

    System.out.println("Criar cliente!\n");

    System.out.print("Digite o CPF: ");
    novoCliente.setCpf(input.nextLine());
    System.out.print("Digite o nome: ");
    novoCliente.setNome(input.nextLine());
    System.out.print("Digite a senha: ");
    novoCliente.setSenha(input.nextInt()); 
    System.out.print("Digite o tipo (1-Comum / 2-Plus): ");
    tipo_conta = input.nextInt();

    if (tipo_conta == 1){
      novoCliente.setTipo("Comum");
    } else if (tipo_conta == 2){
      novoCliente.setTipo("Plus");
    } else {
      System.out.println("Tipo inválido!");
    }
    System.out.print("Digite o saldo inicial: ");
    novoCliente.setSaldo(input.nextDouble());
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