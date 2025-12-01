import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int choix = 0;

        do {
            do {
                System.out.println("1 : Exercice 1 ");
                System.out.println("2 : Exercice 2 ");
                System.out.println("0 : Quitter le programme");
                System.out.print("Votre choix : ");
                choix = input.nextInt();

            } while (choix < 0 || choix > 2);

            switch (choix) {


                case 1:

                    int[] tabExo1 = new int[5];
                    Random rand = new Random();
                    int somme = 0;
                    boolean a = false;

                    for (int i = 0; i < tabExo1.length; i++) {
                        tabExo1[i] = rand.nextInt(6) + 1;
                        System.out.print(tabExo1[i] + " ");
                        somme += tabExo1[i];

                        if (tabExo1[i] == 1) {
                            a = true;
                        }
                    }

                    System.out.println("\nSomme : " + somme);

                    if (!a && somme >= 18) {
                        System.out.println("Partie gagnée !");
                    }

                    if (a || somme < 18) {
                        System.out.println("Partie perdue !");
                    }

                    break;




                case 2:
                   // a ne pas effacer//
                    int[] scoresPossibles = {0, 15, 30, 40};


                    String[] partie = {"B","A","B","A","A","B","B","B"};

                    int scoreA = 0;
                    int scoreB = 0;

                    System.out.println();

                    for (int i = 0; i < partie.length; i++) {


                        if (partie[i].equals("A")) {
                            scoreA++;
                        }

                        if (partie[i].equals("B")) {
                            scoreB++;
                        }

                        System.out.print("Échange " + (i+1) + " : ");


                        if (scoreA < 3 && scoreB < 3) {
                            System.out.println(scoresPossibles[scoreA] + " / " + scoresPossibles[scoreB]);
                        }


                        if (scoreA >= 3 && scoreB >= 3 && scoreA == scoreB) {
                            System.out.println("40 / 40 ");
                        }


                        if (scoreA == scoreB + 1 && scoreA >= 4) {
                            System.out.println("Avantage A");
                        }


                        if (scoreB == scoreA + 1 && scoreB >= 4) {
                            System.out.println("Avantage B");
                        }


                        if (scoreA >= 4 && scoreA >= scoreB + 2) {
                            System.out.println("Jeu pour A !");
                            break;
                        }


                        if (scoreB >= 4 && scoreB >= scoreA + 2) {
                            System.out.println("Jeu pour B !");
                            break;
                        }


                        if (scoreA == 4 && scoreB < 3) {
                            System.out.println("Jeu pour A !");
                            break;
                        }

                        if (scoreB == 4 && scoreA < 3) {
                            System.out.println("Jeu pour B !");
                            break;
                        }
                    }

                    break;




                case 0:
                    System.out.println("FIN DU PROGRAMME");
                    break;
            }

        } while (choix != 0);

        input.close();
    }
}
