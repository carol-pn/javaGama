import java.util.Scanner;
public class Uri1060{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        double numero;
        int qntPositivos=0;

        for (int i=1; i<=6; i++){
            numero = teclado.nextDouble();
            if (numero>0){
                qntPositivos++; 
            }
        }

        System.out.println(qntPositivos+" valores positivos");
    }
}