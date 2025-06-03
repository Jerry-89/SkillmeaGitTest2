import java.util.Random;
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
      /*  Scanner mujScanner = new Scanner(System.in);

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
        */

        // parne cislo vyhrava, neparne prehrava
/*
        Scanner mujScanner = new Scanner(System.in);
        System.out.println("Kockou hodis stlacenim Enter");
        mujScanner.nextLine();

        int hodeneCislo;
        Random rand = new Random();
        hodeneCislo = rand.nextInt(1,7);
        System.out.println("Vyhrava cislo " + hodeneCislo);

        if (hodeneCislo % 2 == 0) {
            System.out.println("Cislo je parne");
        }
        else if (hodeneCislo % 2 == 1) {
            System.out.println("Cislo je neparne");
        }

 */

        //po napisani cisla dna v tyzdni napise jeho nazov - trening na switch
       /* Scanner sc = new Scanner(System.in);
        int cisloDna;
        System.out.println("Zadaj cislo dna v tyzdni");
        cisloDna = sc.nextInt();

        switch (cisloDna) {
            case 1:
                System.out.println("Je pondelok");
                        break;
            case 2:
                    System.out.println("Je utorok");
                        break;
            case 3:
                    System.out.println("Je streda");
                        break;
            case 4:
                    System.out.println("Je štvrtok");
                        break;
            case 5:
                    System.out.println("Je piatok");
                        break;
            case 6:
                    System.out.println("Je sobota");
                        break;
            case 7:
                    System.out.println("Je nedeľa");
                        break;
            default:
                System.out.println("Neplatny den");

        }

        switch (cisloDna) {
            case 6:
            case 7:
                System.out.println("Je vikend");
                break;
            case 5:
            case 4:
            case 3:
            case 2:
            case 1:
                System.out.println("Je tyzden");
                break;

        }
*/
        //Pole
       /*int [] znamky = new int[5];
        znamky[0] = 3;
        znamky[1] = 4;
        znamky[2] = 5;
        znamky[3] = 1;
        znamky[4] = 1;

        int[] znamky2 = new int[] {3, 4, 5, 1, 1};

        System.out.println(znamky[2] + 1);
        */

       /* String[] mena = new String[] {"Jan", "Peter", "Jozef", "Eva"};
        mena[0]= "Peter";
        System.out.println(mena[0]);


        int [][] pole2D = new int [10][10];
        pole2D[0][0] = 464;
        pole2D[0][1] = -92;
        System.out.println(pole2D[0][2]);
        */

        //smycky - for

        String[] mena = new String[]{"Janka", "Miška", "Gabika", "Jozef"};
        for (int i = 0; i < 3; i++) {
            System.out.println(mena[i]);

        }


        //smycky foreach
/*
        for (String meno : mena) {
            System.out.println(meno);
        }

 */
        //while
        int premenna = 0;
        while (premenna <= 5) {
            System.out.println(premenna);
            premenna++;
        }



    }
}