package main;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int acesso;

    do{
      System.out.print("\nSeja bem-vindo ao Banco do Brasil!\n\n");
      System.out.println("1- Acesso como Cliente!");
      System.out.println("2- Acesso como Gerente!");
      System.out.println("3- Acesso como Administrador!");
      System.out.println("4- sair do sistema!\n");
      System.out.print("Digite a opção desejada: ");

      acesso = input.nextInt();

      if (acesso == 1){

        cliente cliente = new cliente();

        System.out.print("\nDigite o CPF: ");
        String cpf = input.next();
        System.out.print("Digite a senha: ");
        int senha = input.nextInt();

        if (cliente.getCpf().equals(cpf) && cliente.getSenha() == senha){
          int operacao;
          
          System.out.println("Bem-vindo, " + cliente.getNome());
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
        String cpf = input.next();
        System.out.print("Digite a senha: ");
        int senha = input.nextInt();

        if(gerente.getCpfG() == cpf && gerente.getSenhaG() == senha){
          int operacao;
          
          System.out.println("Bem-vindo , " + gerente.getNomeG());
          do {
              
              System.out.print("1- Criar Cliente\n2- Excluir Cliente\n3- Listar Clientes\n4- Transferencia\n5- Sair\n");
              System.out.print("\nSelecione a operação: ");
              operacao = input.nextInt();

              if (operacao == 1){
                gerente.criarCliente();
              } else if (operacao == 2){
                gerente.excluirCliente();
              } else if (operacao == 3){
                gerente.listarClientes();
              } else if (operacao == 4){
                gerente.transferencia();
              }else if(operacao == 5){
                System.out.println("Saindo...");
                break;
              } else {
                System.out.println("Operação inválida!");
              }
            }while(operacao != 5);  

          }else if (gerente.getCpfG()==null){
            System.out.println("Cpf inexistente");
            
          }else{
            System.out.println("CPF ou senha incorretos");
          }
      }else if (acesso == 3){
        gerente gerente = new gerente();

        System.out.print("Digite o CPF: ");
        String cpf = input.next();
        System.out.print("Digite a senha: ");
        int senha = input.nextInt();

        if(gerente.getCpfPrin().equals(cpf) && gerente.getSenhaPrin() == senha){
          int operacao;
          
          System.out.println("Bem-vindo , " + gerente.getNomePrin());
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

      }else if(acesso == 4){
        System.out.println("Saindo do sistema...");
        break;
      }else {
        System.out.println("Opção invalida!");
      }
    }while(acesso != 4);
    
  }
}