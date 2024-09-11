package org.example;


import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Datentypen datentypen = new Datentypen();

        /*
        Scanner scanner = new Scanner(System.in);

        System.out.println("wie ist dein Name?    "  );
        String name = scanner.nextLine();
        System.out.println("wie ist deine Vorname?    "  );
        String lastName = scanner.nextLine();
        System.out.println("wie Alt bist du? ");
        int alt = scanner.nextInt();
        scanner.nextLine();
        System.out.println("was isst du gerne?");
        String essen = scanner.nextLine();

        System.out.println("hi!  " + name + " " + lastName);
        System.out.println("du bist " + alt + " Jahre alt");
        System.out.println("du isst gerne " + essen);
         */
        /*
        String name = JOptionPane.showInputDialog("Enter your name ");
        JOptionPane.showMessageDialog(null, "hi! " + name);*/

        System.out.println("Farenheit" + "  |  " + "Celsius");
        System.out.println("____________________");

        for (int f = 0; f <= 300; f+= 20) {
            System.out.println(f);

            double c = (5.0 / 9.0) * (f - 32);
            c = Math.round(c * 1000.0) / 1000.0;

            System.out.println(f + "    |    " + c);


        }

    }
}


