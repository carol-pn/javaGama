import java.util.Scanner;
public class Uri1037{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        double a;

        a=teclado.nextDouble();

        /*
        switch(a){
            case (a>=0 && a<=25) :
                System.out.println("Intervalo [0,25]");
                break;
            case (a>25 && a<=50) :
                System.out.println("Intervalo (25,50]");
                break;
            case (a>50 && a<=75) :
                System.out.println("Intervalo (50,75]");
                break;
            case (a>75 && a<=100) :
                System.out.println("Intervalo (75,100]");
                break;
            default: 
                System.out.println("Fora de intervalo");

        }
        */

        
        if(a>=0 && a<=25){
            System.out.println("Intervalo [0,25]");
        }
        else if(a>25 && a<=50){
            System.out.println("Intervalo (25,50]");
        }
        else if(a>50 && a<=75){
            System.out.println("Intervalo (50,75]");
        }
        else if(a>75 && a<=100){
            System.out.println("Intervalo (75,100]");
        }
        else {
            System.out.println("Fora de intervalo");
        }
        
    }
}