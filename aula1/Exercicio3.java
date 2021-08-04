import java.util.Scanner;

public class Exercicio3{
    public static void main(String args[]){ 
        Scanner teclado = new Scanner(System.in);
        double salario, kw, valorA, valorB, valorC;

        System.out.println("Exercicio 3");
        System.out.println("Digite o valor do salario minimo:");
        salario = teclado.nextDouble();
        System.out.println("Digite a qnt de kw gasta:");
        kw = teclado.nextDouble();

        valorA=(salario/700);        
        valorB= valorA*kw;
        valorC =valorB*0.9;

        System.out.printf("a) valor por kw: %.2f\n",valorA);
        System.out.printf("b) valor em reais a ser pago: %.2f\n",valorB);
        System.out.printf("c) novo valor a ser pago por essa residencia com desconto de 10%%: %.2f\n",valorC);
        

    }
}