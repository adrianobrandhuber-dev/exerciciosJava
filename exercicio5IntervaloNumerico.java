package lista4Revisao;

import javax.swing.*;
import java.util.Scanner;

public class exercicio5IntervaloNumerico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro: " );
        int a = sc.nextInt();
        if (a>=100&&a<=200) {
            System.out.println("o numero esta entre o intervalo de 100 a 200");
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "o numero esta entre o intervalo de 100 a 200",
                    "intervalo numerico",
                    JOptionPane.QUESTION_MESSAGE);
        } else if (a<100) {
            System.out.println("o numero é menor que o intervalo");
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "o numero é menor que o intervalo",
                    "intervalo numerico",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else{
            System.out.println("o numero é maior que o intervalo");
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "o numero é maior que o intervalo",
                    "intervalo numerico",
                    JOptionPane.QUESTION_MESSAGE);
            sc.close();
            frame.dispose();

        }
        {


        }
    }
}
