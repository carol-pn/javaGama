import java.util.Scanner;
public class Uri1018{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int n, resto, cem, cinq, vint, dez, cinc, dois, um;

        n = teclado.nextInt(); 
        
        cem = n/100;
        resto = n%100;
        cinq = resto/50;
        resto = resto%50;
        vint = resto/20;
        resto = resto%20;;
        dez = resto/10;
        resto = resto%10;
        cinc = resto/5;
        resto = resto%5;
        dois = resto/2;
        resto = resto%2;
        //resto = n-(cem*100)-(cinq*50)-(vint*20)-(dez*10)-(cinc*5)-(dois*2);
        um = resto/1;

        System.out.println(n);
        System.out.printf("%d nota(s) de R$ 100,00\n",cem);
        System.out.printf("%d nota(s) de R$ 50,00\n",cinq);
        System.out.printf("%d nota(s) de R$ 20,00\n",vint);
        System.out.printf("%d nota(s) de R$ 10,00\n",dez);
        System.out.printf("%d nota(s) de R$ 5,00\n",cinc);
        System.out.printf("%d nota(s) de R$ 2,00\n",dois);
        System.out.printf("%d nota(s) de R$ 1,00\n",um);


    }
}