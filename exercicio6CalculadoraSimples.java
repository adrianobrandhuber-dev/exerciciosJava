package lista4Revisao;

import javax.swing.*;
import java.util.Scanner;

public class exercicio6CalculadoraSimples {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Digite um numero inteiro: ");
        int a = sc.nextInt();
        System.out.println("digite outro numero inteiro");
        int b = sc.nextInt();
        System.out.println("digite a operação");
        String c = sc.next();
        if (c.equals("*")) {
            System.out.println("o resultado é: " + (a * b));

            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "o resultado é: " + (a*b),
                    "calculadora simples",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else if (c.equals("/")) {
            System.out.println("o resultado é: " + (a / b));
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "o resultado é: " + (a / b),
                    "calculadora simples",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else if (c.equals("+")) {
            System.out.println("o resultado é: " + (a + b));
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "o resultado é: " + (a + b),
                    "calculadora simples",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else if(c.equals("-")) {
            System.out.println("o resultado é: " + (a - b));
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "o resultado é: " + (a - b),
                    "calculadora simples",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else {
            System.out.println("operador invalido");
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "operador invalido",
                    "calculadora simples",
                    JOptionPane.QUESTION_MESSAGE);
            sc.close();
            frame.dispose();
        }



        }
    }

