package main;

import main.gerente;
import main.cliente;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int acesso;

    do{
      System.out.print("Seja bem-vindo ao Banco do Brasil!\n\n");
      System.out.println("Digite 1 para acessar o sistema como cliente");
      System.out.println("Digite 2 para acessar o sistema como gerente");
      System.out.println("Digite 3 para sair do sistema\n");
      System.out.print("Digite a opção desejada: ");

      acesso = input.nextInt();

      if (acesso == 1){

        cliente cliente = new cliente();

        System.out.print("\nDigite o CPF: ");
        long cpf = input.nextLong();
        System.out.print("Digite a senha: ");
        int senha = input.nextInt();

        if (cliente.cpf == cpf && cliente.senha == senha){
          int operacao;
          
          System.out.println("Bem-vindo, " + cliente.nome);
          do {
            
            System.out.println("Selecione a operação: ");
            System.out.print("1- Saque\n2- Deposito\n3- Transferencia\n4- Extrato\n5- Sair\n");
            operacao = input.nextInt();

            if (operacao == 1){
              cliente.saque();
            }else if (operacao == 2){
              cliente.deposito();
            }else if (operacao == 3){
              cliente.transferencia();
            } else if (operacao == 4){
              cliente.extrato();
            }else if(operacao == 5){
              System.out.println("Saindo...");
              break;
            }else {
                System.out.println("Operação inválida!");
            }
            }while(operacao != 5);
          }else {
            System.out.println("\nCPF ou senha incorretos\n");
          }

      }else if (acesso == 2){
        gerente gerente = new gerente();

        System.out.print("Digite o CPF: ");
        long cpf = input.nextLong();
        System.out.print("Digite a senha: ");
        int senha = input.nextInt();

        if(gerente.cpf == cpf && gerente.senha == senha){
          int operacao;
          
          System.out.println("Bem-vindo");
          do {
              
              System.out.print("1- Criar Gerente\n2- Criar Cliente\n3- Excluir Cliente\n4- Listar Clientes\n5- Transferencia\n6- Sair\n");
              System.out.print("\nSelecione a operação: ");
              operacao = input.nextInt();

              if (operacao == 1){
                gerente.criarGerente();
              } else if (operacao == 2){
                gerente.criarCliente();
              } else if (operacao == 3){
                gerente.excluirCliente();
              } else if (operacao == 4){
                gerente.listarClientes();
              } else if (operacao == 5){
                gerente.transferencia();
              }else if(operacao == 6){
                System.out.println("Saindo...");
                break;
              } else {
                System.out.println("Operação inválida!");
              }
            }while(operacao != 6);  
          }else{
            System.out.println("CPF ou senha incorretos");
          }

      }else if(acesso == 3){
        System.out.println("Saindo do sistema...");
        break;
      }else {
        System.out.println("Opção invalida!");
      }
    }while(acesso != 3);
    
  }
}