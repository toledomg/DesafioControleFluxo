import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);

        System.out.println("Digite um numero inteiro");
        int paramUm = terminal.nextInt();

        System.out.println("Digite outro numero inteiro");
        int paramDois = terminal.nextInt();


        try {
            contar(paramUm, paramDois);

            int inicio = paramUm;
            int fim = paramDois;
            int repeticao = paramDois - inicio;

            for (int i =1; i <= repeticao; i++) {
                System.out.println("Imprimindo o numero " + i);
            }
            

        } catch (ParametrosInvalidosException e) {
            // TODO: handle exception
            System.out.println("O segundo parâmetro deve ser maior que o primeiro");

        }
    }

    static void contar(int paramUm, int paramDois) throws ParametrosInvalidosException{
        if(paramUm > paramDois) {
            
            throw new ParametrosInvalidosException();
        } else {

            int contagem = paramDois - paramUm;
            // System.out.println("O valor e: " + contagem);
        }
        
    }


    
}
