package main;

import java.util.Scanner;

public class gerente{

  Scanner input = new Scanner(System.in);

  String nome;
  long cpf;
  int senha;
  String tipo = "Gerente";

  void criarCliente(){

    int tipo_conta;

    cliente novoCliente = new cliente();

    System.out.println("Criar cliente!\n");

    System.out.print("Digite o CPF: ");
    novoCliente.cpf = input.nextLong();
    System.out.print("Digite o nome: ");
    novoCliente.nome = input.next();
    System.out.print("Digite a senha: ");
    novoCliente.senha = input.nextInt();
    System.out.print("Digite o tipo (1-Comum / 2-Plus): ");
    tipo_conta = input.nextInt();

    if (tipo_conta == 1){
      novoCliente.tipo = "Comum";
    } else if (tipo_conta == 2){
      novoCliente.tipo = "Plus";
    } else {
      System.out.println("Tipo inválido!");
    }
    System.out.print("Digite o saldo inicial: ");
    novoCliente.saldo = input.nextInt();
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