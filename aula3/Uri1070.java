import java.util.Scanner;
public class Uri1070{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int x;

        x = teclado.nextInt();

        for (int i=1; i<=6; i++){            
            if (x % 2==1){
                System.out.println(x);
                x+=2;
            }
            else{
                System.out.println(x+1);
                x+=2;
            }
        }        
    }
}