import java.util.Scanner;
public class Uri1019{
    public static void main (String args[]){
        Scanner teclado = new Scanner(System.in);
        int x, r, h, m, s;

        x = teclado.nextInt();
        h = x/3600;
        r=x%3600;
        m= r/60;
        s=r%60;

        System.out.printf("%d:%d:%d\n",h,m,s);
    }
}