package AtividadeJavaLista;

import java.util.Scanner;

public class JavaDiaENoite {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Quantas horas ? ");
        double h = sc.nextDouble();
        if (h < 12 ) {
            System.out.println(" bom dia ");
        } else if (h > 12 && h < 18) {
            System.out.println("boa tarde");
        } else if (h > 18 && h < 24) {
            System.out.println("boa noite ");
        } else if (h > 24){
            System.out.println("horario invalida");
    }

                sc.close();
    }
}
