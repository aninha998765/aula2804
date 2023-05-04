import java.util.Scanner;

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
            }else if(op ==2){
                System.out.println("\n\t\t\t -- Subtração-- \n");
            }else if(op == 3){
                System.out.println("Opção" + "incorreta!");
            }
         }while(op!=3);
    }
}