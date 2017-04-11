
package pkg1004algoritmoeprogramacao;

import java.util.Scanner;


public class Exercicio2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Digite X:");
        int a = console.nextInt();
        for(int i = 1; i <= a; i = i+2){
            System.out.println("O valor impar é: " + i);
        }
    }
    
}
