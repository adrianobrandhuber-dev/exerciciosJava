package _1_exemplos;

import java.util.Scanner;

public class exemploSc{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String y;
        System.out.print("entrada de dados: ");
        y = sc.nextLine();
        System.out.print("saida de dados: "+ y);
        sc.close();

    }
}
