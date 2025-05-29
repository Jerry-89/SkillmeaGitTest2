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

/*
        int vek;
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Zadaj svoj vek");
        vek = mujScanner.nextInt();

        if (vek >= 18 ) {
            System.out.println("Si dospely");
            if (vek >= 65) {
                System.out.println("Dochodca");
            }
        }

        else if (vek >= 0 && vek < 18) {
            System.out.println("Uzivatel je nezletily");
        }

        else {
            System.out.println("Nesmie byt zaporne");
        }
*/

        // Zadanie ulohy: VYpocet BMI: Hmotnost (kg)/vyska na druhu (cm), pod 18,5 podvaha, medzi 18,5-25 optimalna vaha, 25-nekonecno nadvaha
        Scanner mujScanner = new Scanner(System.in);

        float vyska;
        int hmotnost;
        float bmi;

        System.out.print("Zadaj výšku (m)");
        vyska = mujScanner.nextFloat();
        System.out.print("Zadaj hmotnost ");
        hmotnost = mujScanner.nextInt();

        bmi = hmotnost / (vyska * vyska);

        if (bmi < 18.5f && bmi > 0) {
            System.out.println("Uzivatel ma podvahu");
        } else if (bmi >= 18.5f && bmi < 25) {
            System.out.println("Uzivatel ma optimalnu vahu");
        } else if (bmi >= 25) {
            System.out.println("Uzivatel ma nadvahu");
        } else {
            System.out.println("Tvoje bmi je " + bmi);
        }
    }
}