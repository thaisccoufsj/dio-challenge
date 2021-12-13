import java.io.IOException;
import java.util.Scanner;

public class TempoDoDobby {
    /*
    * N = Minutos para ir embora
    * Dobby precisa fabricar 2 presentes
    * Descobrir se conseguirá ainda hoje
    * Entarda :
    *   N (minutos)
    *   A (minutos para fabricar) B (minutos para fabricar)
    * */
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int N = leitor.nextInt();
        int A = leitor.nextInt();
        int B = leitor.nextInt();

        if (N < (A + B))
            System.out.println("Deixa para amanha!");
        else
            System.out.println("Farei hoje!");
    }
}
