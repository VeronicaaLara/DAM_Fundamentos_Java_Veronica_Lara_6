package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Pedir dos números y decir si uno es múltiplo del otro

        Scanner sc =new Scanner(System.in);
        int numero1;
        int numero2;

        System.out.println("Introduce el primer número");
        numero1 = sc.nextInt();
        System.out.println("Introduce el segundo número");
        numero2 =sc.nextInt();

        if (numero1 % numero2 ==0){
            System.out.println("Son múltiplos");
        }else{
            System.out.println("No son múltiplos");
        }

        sc.close();


    }
}
