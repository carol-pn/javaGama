import java.util.Scanner;
public class Uri1038{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int item, qnt;
        double valor, total;

        item = teclado.nextInt();
        qnt = teclado.nextInt();
        //valor = 0;

        if(item == 1){
            valor = 4.0;         
        }
        else if(item == 2){
            valor = 4.5;   
        }
        else if(item == 3){
            valor = 5.0;
        }
        else if(item == 4){
            valor = 2.0;
        }
        else /*if(item == 5)*/{
            valor = 1.5;
        }

        
        total = valor*qnt;
        System.out.printf("Total: R$ %.2f\n",total); 

    }
}