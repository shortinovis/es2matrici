import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);
        int[][] matr;
        int righe, colonne;
        int[][] matr2;
        int righe2, colonne2;
        int[][] matr3;
        int righe3, colonne3;
        int[][] matr4;
        int righe4, colonne4;
        int[][] matr5;
        int righe5, colonne5;
        int ind1, ind2;
        int rig1, rig2;

        System.out.println("damminumero di righe");
        righe = t.nextInt();
        System.out.println("dammi numerodi colonne");
        colonne = t.nextInt();
        if (colonne == righe)
            System.out.println("devi darmi due valori diversi");
        else {
            matr = new int[righe][colonne];
            for (int i = 0; i < colonne; i++) {
                for (int p = 0; p < righe; p++) {
                    System.out.println("dammi valore da inseire");
                    matr[i][p] = t.nextInt();
                }
            }
            // stampa
            for (int i = 0; i < matr.length; i++) {
                for (int p = 0; p < matr[i].length; p++) {
                    System.out.print(matr[p][i] + " ");
                }
                System.out.println();
            }
            // primo es
            System.out.println("quale colonna vuoi invertire?");
            ind1 = t.nextInt();
            System.out.println("con quale colonna vuoi invertirla");
            ind2 = t.nextInt();
            InversioneColonne(matr, ind1, ind2);

            // stampa
            for (int i = 0; i < matr.length; i++) {
                for (int p = 0; p < matr[i].length; p++) {
                    System.out.print(matr[p][i] + " ");
                }
                System.out.println();
            }

            // secondo es
            System.out.println("quale riga vuoi invertire?");
            rig1 = t.nextInt();
            System.out.println("con quale riga vuoi invertirla");
            rig2 = t.nextInt();
            InversioneRighe(matr, rig1, rig2);

            // stampa
            for (int i = 0; i < matr.length; i++) {
                for (int p = 0; p < matr[i].length; p++) {
                    System.out.print(matr[p][i] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("damminumero di righe");
        righe2 = t.nextInt();
        System.out.println("dammi numerodi colonne");
        colonne2 = t.nextInt();
        if (colonne2 != righe2)
            System.out.println("devi darmi due valori uguali");
        else {
            matr2 = new int[righe2][colonne2];
            for (int i = 0; i < colonne2; i++) {
                for (int p = 0; p < righe2; p++) {
                    System.out.println("dammi valore da inseire");
                    matr2[i][p] = t.nextInt();
                }
            }

            // stampa
            for (int i = 0; i < matr2.length; i++) {
                for (int p = 0; p < matr2[i].length; p++) {
                    System.out.print(matr2[p][i] + " ");
                }
                System.out.println();
            }

            // terzo es
            if (Simmetria(matr2))
                System.out.println("la matrice è simmetrica rispetto alla diagonale");
            else
                System.out.println("la matrice non è simmetrica rispetto alla diagonale");

            // stampa
            for (int i = 0; i < matr2.length; i++) {
                for (int p = 0; p < matr2[i].length; p++) {
                    System.out.print(matr2[p][i] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("damminumero di righe");
        righe3 = t.nextInt();
        System.out.println("dammi numerodi colonne");
        colonne3 = t.nextInt();
        if (colonne3 != righe3)
            System.out.println("devi darmi due valori uguali");
        else {
            matr3 = new int[righe3][colonne3];
            for (int i = 0; i < colonne3; i++) {
                for (int p = 0; p < righe3; p++) {
                    System.out.println("dammi valore da inseire");
                    matr3[i][p] = t.nextInt();
                }
            }

            // stampa
            for (int i = 0; i < matr3.length; i++) {
                for (int p = 0; p < matr3[i].length; p++) {
                    System.out.print(matr3[p][i] + " ");
                }
                System.out.println();
            }

            // quarto es
            modifica(matr3);

            // stampa
            for (int i = 0; i < matr3.length; i++) {
                for (int p = 0; p < matr3[i].length; p++) {
                    System.out.print(matr3[p][i] + " ");
                }
                System.out.println();
            }
        }
        System.out.println("damminumero di righe");
        righe4 = t.nextInt();
        System.out.println("dammi numerodi colonne");
        colonne4 = t.nextInt();
        if (colonne4 == righe4)
            System.out.println("devi darmi due valori diversi");
        else {
            matr4 = new int[righe4][colonne4];
            for (int i = 0; i < colonne4; i++) {
                for (int p = 0; p < righe4; p++) {
                    System.out.println("dammi valore da inseire");
                    matr4[i][p] = t.nextInt();
                }
            }
            // stampa
            for (int i = 0; i < matr4.length; i++) {
                for (int p = 0; p < matr4[i].length; p++) {
                    System.out.print(matr4[p][i] + " ");
                }
                System.out.println();
            }

            // quinto es
            int[] somma = new int[matr4.length];
            Somma(matr4, somma);
            for (int i = 0; i < somma.length; i++) {
                System.out.println("la somma della riga" + i + " è " + somma[i]);
            }
            // sesto es
            int[] somma2 = new int[matr4[0].length];
            Somma2(matr4, somma2);
            for (int i = 0; i < somma2.length; i++) {
                System.out.println("la somma della colonna" + i + " è " + somma2[i]);
            }
        }
        System.out.println("damminumero di righe");
        righe5 = t.nextInt();
        System.out.println("dammi numerodi colonne");
        colonne5 = t.nextInt();
        if (colonne5 != righe5)
            System.out.println("devi darmi due valori uguali");
        else {
            matr5 = new int[righe5][colonne5];
            for (int i = 0; i < colonne5; i++) {
                for (int p = 0; p < righe5; p++) {
                    System.out.println("dammi valore da inseire");
                    matr5[i][p] = t.nextInt();
                }
            }
            // stampa
            for (int i = 0; i < matr5.length; i++) {
                for (int p = 0; p < matr5[i].length; p++) {
                    System.out.print(matr5[p][i] + " ");
                }
                System.out.println();
            }

            // settimo es
                Sostituzione(matr5);

            // stampa
            for (int i = 0; i < matr5.length; i++) {
                for (int p = 0; p < matr5[i].length; p++) {
                    System.out.print(matr5[p][i] + " ");
                }
                System.out.println();
            }

            //ottavo es
                Sostituzione2(matr5);

            // stampa
            for (int i = 0; i < matr5.length; i++) {
                for (int p = 0; p < matr5[i].length; p++) {
                    System.out.print(matr5[p][i] + " ");
                }
                System.out.println();
            }

            // nono es
                if(UgualiSottoDiagonale(matr5))
                    System.out.println("tutti i valori sotto la diagonale principale sono uguali");
                else
                    System.out.println("tutti i valori sotto la diagonale principale non sono uguali");

        }
    }


    private static void InversioneColonne(int[][] matr, int ind1, int ind2) {
        int appoggio = 0;
        for (int i = 0; i < matr.length; i++) {
            appoggio = matr[i][ind1];
            matr[i][ind1] = matr[i][ind2];
            matr[i][ind2] = appoggio;
        }
    }

    private static void InversioneRighe(int[][] matr, int rig1, int rig2) {
        int appoggio = 0;
        for (int i = 0; i < matr[0].length; i++) {
            appoggio = matr[rig1][i];
            matr[rig1][i] = matr[rig2][i];
            matr[rig2][i] = appoggio;
        }
    }

    private static boolean Simmetria(int[][] matr) {
        boolean uguali = true;
        for (int i = 0; i < matr.length; i++) {
            for (int p = 0; i<matr[i].length; p++){
                if(matr[i][p]!=matr[p][i]) {
                    uguali = false;
                    break;
                }
            }
        }
        return uguali;
    }
    private static void modifica(int[][] matr) {
        int appoggio = 0;
        for (int i = 0; i < matr[0].length; i++) {
            for (int p = 0; p < matr.length; p++) {
                appoggio = matr[i][p];
                matr[i][p] = matr[i][p];
                matr[p][i] = appoggio;
            }
        }
    }
    private static int[] Somma(int[][] matr, int [] somma) {
        for (int i = 0; i < matr.length; i++) {
            for (int p = 0; p < matr[i].length; p++) {
                somma[i]=matr[i][p];
            }
        }
        return somma;
    }
    private static int[] Somma2(int[][] matr, int [] somma) {
        for (int i = 0; i < matr[0].length; i++) {
            for (int p = 0; p < matr.length; p++) {
                somma[i]=matr[p][i];
            }
        }
        return somma;
    }
    private static void Sostituzione(int[][] matr) {

        for (int i = 0; i < matr.length; i++) {
            for (int p = 0; i<matr[i].length; p++){
                if(i<=p)
                    matr[i][p]=1;
                else
                    matr[i][p]=0;
                }
            }
        }
    private static void Sostituzione2(int[][] matr) {

        for (int i = 0; i < matr.length; i++) {
            for (int p = 0; i<matr[i].length; p++){
                if(i>=p)
                    matr[i][p]=1;
                else
                    matr[i][p]=0;
            }
        }
    }
    private static boolean UgualiSottoDiagonale(int[][] matr) {
        boolean uguali = true;
        for (int i = 0; i < matr[0].length; i++) {
            for (int p = i; p < matr.length; p++) {
                if (i != p){
                    if (matr[p][i] != matr[1][0]) {
                        uguali = false;
                        break;
                    }
            }
        }
        if (!uguali)
            break;
    }
        return uguali;
    }
    }