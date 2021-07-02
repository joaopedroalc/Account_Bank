package bancos;

import java.util.Scanner;
import java.util.Random;

public class Main {
    
    
    public static void main(String[] args){
        // Declarando as variáveis, Scanner e Random
        String name;
        double initial;
        Scanner entrance = new Scanner(System.in);
        Random number_account = new Random();
        int account = 1 + number_account.nextInt(9999);
    
        //Obtendo os dados iniciais do Cliente
        System.out.println("Cadastrando novo cliente.");
        System.out.print("Entre com seu nome: ");
        name = entrance.nextLine();
        
        System.out.print("Entre com o valor inicial depositado na conta: ");
        initial = entrance.nextDouble();
        
        //Criando a conta de um cliente
        Account myaccount = new Account(name, account, initial);
        myaccount.iniciar();
    }
    
}