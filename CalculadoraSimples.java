import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class CalculadoraSimples{

    public static void main(String[] args) {
        
        //declaração de variaveis 
        int n1, n2, total, op;

         //criação de instancia do objeto de entrada
         Scanner entrada = new Scanner(System.in);
         do{

            System.out.println("\n\t\t\t --Calculadora Simples-- \n");

            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Sair");

            System.out.print("Opção: ");

            op = entrada.nextInt();

            if(op == 1){
                System.out.println("\n\t\t\t -- Soma-- \n");

                //Entrada 
                System.out.print("informe N1:")
                n1 = entrada.nextInt();
                 System.out.print("informe N2:")
                n2 = entrada.nextInt();

                //Processamento
                total = n1+n2;

                //saida 
                System.out.printf("%d + %d = %d", n1, n2, total);

            }else if(op ==2){
                System.out.println("\n\t\t\t -- Subtração-- \n");
            }else if(op == 3){
                System.out.println("Opção" + "incorreta!");
            }
         }while(op!=3);
    }
}