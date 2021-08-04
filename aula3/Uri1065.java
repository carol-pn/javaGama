import java.util.Scanner;
public class Uri1065{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int qntPares=0;

        for (int i=1; i<=5; i++){
            numero = teclado.nextInt();
            if (numero%2==0){
                qntPares++; 
            }
        }

        System.out.println(qntPares+" valores pares");
    }
}