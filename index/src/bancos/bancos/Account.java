package bancos;

import java.util.Scanner;

public class Account {
    private String name;
    private int account, withdrawal;
    private double balance;
    private double limit;
    Scanner entrance = new Scanner(System.in);
    
    public Account(String name, int account, double balance_inicial){
        this.name=name;
        this.account=account;
        balance=balance_inicial;
        withdrawal=0;
    }
    public void extrato(){
        System.out.println("\nEXTRATO:");
        System.out.println("Nome: " + this.name);
        System.out.println("Número da conta: " + this.account);
        System.out.printf("Saldo atual: %.2f\n",this.balance);
        System.out.println("Saques realizados hoje: " + this.withdrawal + "\n");
    }
    // MODIFICAÇÃO, USANDO CONDICIONAL PARA TRATAR DE EXCESSÕES PARA O LIMITE DE SAQUE.
    public void sacar(double amount){
        if(balance >= amount && amount <= limit){
            balance -= amount;
            withdrawal++;
            System.out.println("Sacado: " + amount);
            System.out.println("Novo saldo: " + balance + "\n");
        }
        else if(amount > limit && amount <= balance){
            System.out.println("Digite um valor menor que o limite de saque");
        }
        else {
            System.out.println("Saldo insuficiente. Faça um depósito\n");
        }
    }
    
    public void depositar(double amount)
    {
        balance += amount;
        System.out.println("Depositado: " + amount);
        System.out.println("Novo saldo: " + balance + "\n");
    }
    
    public void iniciar(){
        int opcao;

        do{
            exibeMenu();
            opcao = entrance.nextInt();
            escolheOpcao(opcao);
        }while(opcao!=5);
    }
    
    public void exibeMenu(){
        
        System.out.println("\nEscolha a opção desejada: ");
        System.out.println("1 - Limite");
        System.out.println("2 - Consultar Extrato");
        System.out.println("3 - Sacar");
        System.out.println("4 - Depositar");
        System.out.println("5 - Sair\n");
        System.out.print("Opção: ");
        
    }
    
    public void escolheOpcao(int opcao){
        double amount;
        limit = balance / 3;
        
        switch( opcao ){
            case 1:
                    System.out.println("Limite:" + limit);
                    break;
            case 2:    
                    extrato();
                    break;
            case 3: 
                    if(withdrawal<3){
                        System.out.print("Quanto deseja sacar: ");
                        amount = entrance.nextDouble();
                        sacar(amount);
                    } else{
                        System.out.println("Limite de saques diários atingidos.\n");
                    }
                    break;
                    
            case 4:
                    System.out.print("Quanto deseja depositar: ");
                    amount = entrance.nextDouble();
                    depositar(amount);
                    break;
                    
            case 5: 
                    System.out.println("Sistema encerrado.");
                    break;
                    
            default:
                    System.out.println("Opção inválida");
        }
    }
}
