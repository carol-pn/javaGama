import java.util.Scanner;

public class Exercicio2{
    public static void main(String args[]){
        
        Scanner teclado = new Scanner(System.in);
        int lado, base, base2, altura, area;
               
        System.out.println("Exercicio 2a - area de um quadrado dado seu lado");

        System.out.println("Digite o lado do quadrado:");
        lado = teclado.nextInt();
        area = lado*lado;

        System.out.println("A area do quadrado e "+area);
        
        System.out.println("\nExercicio 2c - area de um triangulo dado sua base e sua altura");

        System.out.println("Digite a base do triangulo:");
        base = teclado.nextInt();
        System.out.println("Digite a altura do triangulo:");
        altura = teclado.nextInt();
        area = (base*altura)/2;    

        System.out.println("A area do triangulo e "+area);

        System.out.println("\nExercicio 2e - area de um trapezio dado suas bases e sua altura");

        System.out.println("Digite a base maior do trapezio:");
        base = teclado.nextInt();
        System.out.println("Digite a base menor do trapezio:");
        base2 = teclado.nextInt();
        System.out.println("Digite a altura do trapezio:");
        altura = teclado.nextInt();
        area = ((base+base2)*altura)/2;   
             
        System.out.println("A area do trapezio e "+area);

    }
}