import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

/*
        int aktRok = 2025;

        Scanner mujScanner = new Scanner(System.in);

        System.out.println("Zadaj svoj rok narodenia: ");
        int rokNar = mujScanner.nextInt();

        int vek = aktRok - rokNar;
        if ((rokNar <= aktRok) && (vek < 100)){
            System.out.println("Tvoj vek je " + vek);
        } else
            System.out.println("Nespravny vek");/*
|| Alt+124
 */


     /*   Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoj email: ");
        String email = mujScanner.nextLine();
        System.out.println(email.toLowerCase());

int cisloPor = 1;

System.out.println(cisloPor > 0 && cisloPor <= 4);
 */


        int vek;
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoj vek");
        vek = mujScanner.nextInt();

        if(vek >= 18) {
            System.out.println("Si dospely");
        }
        else if(vek >= 0 && vek < 18) {
                System.out.println("Uzivatel je nezletily");
            }
        else {
            System.out.println("Nesmie byt zaporne");
            }



        }
    }