/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscandoelnivel;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class BuscandoElNivel {

    public static void cantidadBytes(int ultNivel, int sigNivel, int arr[]) {
        int bytes = 0;
        if (ultNivel < sigNivel) {
            for (int i = ultNivel + 1; i < sigNivel; i++) {
                bytes = bytes + arr[i];
            }

        } else {
            for (int i = ultNivel; i >= sigNivel; i--) {
                bytes = bytes - arr[i];
            }
        }
        System.out.println(bytes);;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int consultas = 0, niveles = 0;
        int arr[];
        
        niveles=sc.nextInt();

        while (niveles > 0) {

            arr = new int[niveles];

            for (int i = 0; i < arr.length; i++) {
                arr[i] = sc.nextInt();
            }

            consultas = sc.nextInt();

            while (consultas-- != 0) {
                cantidadBytes(sc.nextInt() - 1, sc.nextInt() - 1, arr);

            }
            System.out.println("---");
            niveles = sc.nextInt();

        }

    }

}
