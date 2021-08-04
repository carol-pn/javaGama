import java.util.Scanner;
public class Uri1114{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int x;

        x = teclado.nextInt();
        while (x!=2002){
            System.out.println("Senha Invalida"); 
            x = teclado.nextInt();           

        }

        System.out.println("Acesso Permitido");
    }
}