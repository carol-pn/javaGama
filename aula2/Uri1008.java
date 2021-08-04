import java.util.Scanner;
public class Uri1008{
    public static void main (String args[]){        
        Scanner teclado = new Scanner(System.in);
        int a,b;
        float x, salario;

        //entrada
        a=teclado.nextInt();
        b=teclado.nextInt();
        x=teclado.nextFloat();

        salario = b*x;

        System.out.println("NUMBER = "+a);
        System.out.printf("SALARY = U$ %.2f",salario);
    }
}