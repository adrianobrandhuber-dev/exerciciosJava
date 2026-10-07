package lista4Revisao;

import javax.swing.*;
import java.util.Scanner;

public class exercicio4CategoriasNadador {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("digite a idade do nadador: ");
        int idade = sc.nextInt();
        if (idade<=7 && idade >5){
            System.out.println("nadador infantil:");
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "nadador infantil",
                    "classificação de nadador",
                    JOptionPane.QUESTION_MESSAGE);
        }
        else if (idade>=8 && idade <=17) {
            System.out.println("nadador juvenil");
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "nadador juvenil",
                    "classificação de nadador",
                    JOptionPane.QUESTION_MESSAGE);
        }
            else {
            System.out.println("nadador senior");
            javax.swing.JFrame frame = new javax.swing.JFrame();
            frame.setAlwaysOnTop(true);
            javax.swing.JOptionPane.showMessageDialog(frame,
                    "nadador senior",
                    "classificação de nadador",
                    JOptionPane.QUESTION_MESSAGE);
            sc.close();
            frame.dispose();
        }

        }

    }

