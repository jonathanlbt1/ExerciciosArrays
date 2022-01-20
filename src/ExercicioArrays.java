import java.util.Random;

public class ExercicioArrays {

    public static void main(String[] args) {
        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for(int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }
        System.out.print("Numeros aleatórios\n");
        for ( int numero :
             numerosAleatorios ) {
            System.out.print(numero + " ");
        }

        System.out.print("\nSucessor dos numeros aleatórios\n");
        for ( int numero :
                numerosAleatorios ) {
            System.out.print(numero + 1 + " ");
        }
    }
}
