package testes;

import java.util.Scanner;

public class Exercico4 {

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        int i = 1, n;

        int soma = 0 , quantidade = 0;
        double media;
        while (i <= 6) {
            System.out.println("Digite o valor " + i + ":");
            n = console.nextInt();
            if (n > 0) {
                soma = soma + n;
                quantidade = quantidade + 1;

            } else {
                System.out.println("Numero negativo");
            }
            i = i + 1;
        }
        media = soma / quantidade;
        System.out.println("Sua soma é:" + soma + "a quantidae é:" + quantidade + "e a media: " + media + ".");
    }

}
