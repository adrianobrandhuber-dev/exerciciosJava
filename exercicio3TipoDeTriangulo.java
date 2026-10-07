package lista4Revisao;

import javax.swing.*;
import java.awt.*;
import java.util.Scanner;

public class exercicio3TipoDeTriangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite um numero inteiro");
        int a = sc.nextInt();
        System.out.println("digite um outro numero");
        int b = sc.nextInt();
        System.out.println("digite um outro numero");
        int c = sc.nextInt();
        if (a < b + c && b < a + c && c < a + b) {
            System.out.println("os tres numero formam um triangulo");
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "os numeros formam um triangulo",
                    "verificação de triangulo",
                    JOptionPane.QUESTION_MESSAGE);
            if (a==b&&b==c) {
                System.out.println("o triangulo é equilatero");
                System.out.println("os tres numero formam um triangulo equilatero");

                javax.swing.JOptionPane.showMessageDialog(frame,
                        "os numeros formam um triangulo equilatero",
                        "verificação de triangulo",
                        JOptionPane.QUESTION_MESSAGE);
            }
            else if (a==b||a==c||b==c){
            System.out.println("o triangulo é isosceles");
                System.out.println("os tres numero formam um triangulo isosceles");

                javax.swing.JOptionPane.showMessageDialog(frame,
                        "os numeros formam um triangulo isosceles",
                        "verificação de triangulo",
                        JOptionPane.QUESTION_MESSAGE);
                }
            else {
                System.out.println("triangulo tipo escaleno");
                System.out.println("os tres numero formam um triangulo escaleno");

                javax.swing.JOptionPane.showMessageDialog(frame,
                        "os numeros formam um triangulo escaleno",
                        "verificação de triangulo",
                        JOptionPane.QUESTION_MESSAGE);
                frame.dispose();


            }
        } else {
            System.out.println("os numeros nao formam um triangulo");
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "os numeros nao formam um triangulo",
                    "verificação de triangulo",
                    JOptionPane.QUESTION_MESSAGE);
            sc.close();
            frame.dispose();

        }
    }
}


