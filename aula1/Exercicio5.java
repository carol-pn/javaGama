import java.util.Scanner;

public class Exercicio5{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        int velocidade, tempo, litros;

        System.out.println("Digite o tempo de viagem: ");
        tempo = teclado.nextInt();

        System.out.println("Digite a velocidade media: ");
        velocidade = teclado.nextInt();

        litros= (velocidade*tempo)/12;
        
        System.out.println("A quantidade de litros utilizados foi: "+litros);

    }
}