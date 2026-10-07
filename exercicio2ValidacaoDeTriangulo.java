package lista4Revisao;

import javax.swing.*;
import java.util.Scanner;

public class exercicio2ValidacaoDeTriangulo {
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
        } else {
            System.out.println("os numeros nao formam um triangulo");
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "os numeros nao formam um triangulo",
                    "verificação de triangulo",
                    JOptionPane.QUESTION_MESSAGE);
            sc.close();
        }
    }
}













