import java.util.Scanner; // <- toto si pridal
public class Main {
    public static void main(String[] args) {


                //komentar
                int aktRok = 2025;

                Scanner mujScanner = new Scanner(System.in);

                System.out.println("Zadaj svoj rok narodenia: ");
                int rokNar = mujScanner.nextInt();

                int vek = aktRok - rokNar;
                System.out.println("Tvoj vek je " + vek);
        }
    }