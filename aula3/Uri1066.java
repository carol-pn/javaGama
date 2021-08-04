import java.util.Scanner;
public class Uri1066{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int numero;
        int qntPares=0;
        int qntImpares=0;
        int qntPositivos=0;
        int qntNegativos=0;

        for (int i=1; i<=5; i++){
            numero = teclado.nextInt();
            if (numero%2==0){
                qntPares++; 
            }
            if (numero%2==1 || numero%2==-1){
                qntImpares++; 
            }
            if (numero<0){
                qntNegativos++; 
            }
            if (numero>0){
                qntPositivos++; 
            }
        }

        System.out.println(qntPares+" valor(es) par(es)");        
        System.out.println(qntImpares+" valor(es) impar(es)");        
        System.out.println(qntPositivos+" valor(es) positivo(s)");        
        System.out.println(qntNegativos+" valor(es) negativo(s)");
    }
}