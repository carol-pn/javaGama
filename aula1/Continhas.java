public class Continhas{
    public static void main(String args []){
        int a, b, c;

        a=23;
        b=4;
        //println = PRINT DANDO ENTER
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        c=a+b;
        System.out.println("Valor da soma = " + c);

        c=a-b;
        System.out.println("Valor da subt = " + c);
                
        c=a*b;
        System.out.println("Valor da mult = " + c);

        c=a/b;
        System.out.println("Valor da divisao = " + c);
        
        c=a%b;
        System.out.println("Valor do resto = " + c);

        float x,y,z;

        x=23.0f;
        y=3.0f;
        z=x/y;
        System.out.println("Valor da divisao quebrada = " + z);   
        /*
        print formatado PRINTF %5.2f -> 5 digitos sendo 2 depois do ponto XXX.XX, 
        %.2f -> limitando depois do . pra duas casas  
        %n OU \N -> pular a linha
        */
        System.out.printf("Valor com 2 casas decimais = %.2f%n", z);
        
        System.out.printf("Valor com 3 casas decimais = %.3f\n", z);

    }
}