 // Figura 2.7: Addition.java
 // Programa de adição que exibe a soma de dois números.
 import java.util.Scanner; // programa utiliza a classe Scanner

 public class App {

public static void main( String[] args )
{
 // cria um Scanner para obter entrada da janela de comando

 Scanner input = new Scanner( System.in );

 int number1; // primeiro número a adicionar
 int number2; // segundo número a adicionar
 int sum; // soma de number1 e number2

 System.out.print( "Digite o primeiro numero: " ); // prompt
 number1 = input.nextInt(); // lê primeiro o número fornecido pelo usuário

 System.out.print( "Digite o segundo numero: " ); // prompt
 number2 = input.nextInt(); // lê o segundo número fornecido pelo usuário

 sum = number1 + number2; // soma os números, depois armazena o total em sum

 System.out.printf( "A soma é: %d\n", sum ); // exibe a soma
 } // fim do método main
 } // fim da classe Addition