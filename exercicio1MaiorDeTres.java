package lista4Revisao;

import javax.swing.*;
import java.util.Scanner;

public class exercicio1MaiorDeTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro");
        int n1 = sc.nextInt();
        System.out.println("digite o proximo numero");
        int n2 = sc.nextInt();
        System.out.println("digite o proximo numero");
        int n3 = sc.nextInt();
        if (n1>n2 && n1>n3) {
            System.out.println("o maior numero é: " + n1);
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "o maior numero é"+n1,
                    "maior de tres",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else if (n2>n1&&n2>n3) {
            System.out.println("o maior numero é: " + n2);

            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "o maior numero é: "+n2,
                    "maior de tres",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else {
            System.out.println("o maior numero é: "+ n3);
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "o maior numero é: "+n3,
                    "maior de tres",
                    JOptionPane.QUESTION_MESSAGE);

        }
        sc.close();
    }
}
