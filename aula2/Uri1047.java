import java.util.Scanner;
public class Uri1047{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);

        int hInicio,mInicio,hFinal,mFinal, duracao, duracaoH, duracaoM;

        hInicio=teclado.nextInt();
        mInicio=teclado.nextInt();
        hFinal=teclado.nextInt();
        mFinal=teclado.nextInt();    

        duracao = (hFinal*60+mFinal)-(hInicio*60+mInicio);

        if(duracao<=0){
            duracao += 1440;
        }

        duracaoH = duracao/60;
        duracaoM = duracao%60;
              

        System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)\n",duracaoH, duracaoM);
    }
}