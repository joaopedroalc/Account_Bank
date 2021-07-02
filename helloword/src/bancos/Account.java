package bancos;

import java.util.Scanner;

public class Account {
    private String name;
    private int account, booty;
    private double balance;
    Scanner entrance = new Scanner(System.in);
    
    public Account(String name, int account, double balance_inicial){
        this.name=name;
        this.account=account;
        balance=balance_inicial;
        booty=0;
    }
    
    public void extrato(){
        System.out.println("\nEXTRATO:");
        System.out.println("Nome: " + this.name);
        System.out.println("Número da conta: " + this.account);
        System.out.printf("Saldo atual: %.2f\n",this.balance);
        System.out.println("Saques realizados hoje: " + this.booty + "\n");
        
    }
    
    public void sacar(double amount){
        if(balance >= amount){
            balance -= amount;
            booty++;
            System.out.println("Sacado: " + amount);
            System.out.println("Novo saldo: " + balance + "\n");
        } else {
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
        }while(opcao!=4);
    }
    
    public void exibeMenu(){
        
        System.out.println("\nEscolha a opção desejada: ");
        System.out.println("1 - Consultar Extrato");
        System.out.println("2 - Sacar");
        System.out.println("3 - Depositar");
        System.out.println("4 - Sair\n");
        System.out.print("Opção: ");
        
    }
    
    public void escolheOpcao(int opcao){
        double amount;
        
        switch( opcao ){
            case 1:    
                    extrato();
                    break;
            case 2: 
                    if(booty<3){
                        System.out.print("Quanto deseja sacar: ");
                        amount = entrance.nextDouble();
                        sacar(amount);
                    } else{
                        System.out.println("Limite de saques diários atingidos.\n");
                    }
                    break;
                    
            case 3:
                    System.out.print("Quanto deseja depositar: ");
                    amount = entrance.nextDouble();
                    depositar(amount);
                    break;
                    
            case 4: 
                    System.out.println("Sistema encerrado.");
                    break;
                    
            default:
                    System.out.println("Opção inválida");
        }
    }
}
