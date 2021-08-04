import java.util.Scanner;
public class Uri1064{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        double numero, media = 0.0;
        int qntPositivos=0;

        for (int i=1; i<=6; i++){            
            numero = teclado.nextDouble();
            if (numero>0){                
                qntPositivos++; 
                media += numero;
            }
        }

        media= media/qntPositivos;

        System.out.println(qntPositivos+" valores positivos");
        System.out.printf("%.1f\n", media);
    }
}