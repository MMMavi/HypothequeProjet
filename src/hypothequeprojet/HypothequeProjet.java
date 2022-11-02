/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hypothequeprojet;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class HypothequeProjet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("entrer montant a emprunter");
        int montant = sc.nextInt();
        System.out.println("entrer taux");
        double taux = sc.nextDouble();
        System.out.println("entrer nombre d'annees");
        int ann = sc.nextInt();
        double tim = taux / 100 / 12;

        double map = (tim * montant) / (1 - (1 / Math.pow((1 + tim), (12 * ann))));

        System.out.println("Montant a payer = " + map);

    }

}
