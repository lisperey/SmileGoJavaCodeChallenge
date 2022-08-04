/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SmileGoJavaCodeChallenge.J_PrimeFactorization;

import java.io.*;
import java.lang.Math;
import java.util.Scanner;
import java.lang.reflect.Array;
import java.util.*;

/**
 *
 * @author Filipe
 */
public class newJavaFile10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite um número: ");

        int n = leitor.nextInt();

        int i = 1;

        List<Integer> fatorial = new ArrayList<Integer>();

        while (n >= i) {
            if (n % i == 0) {

                fatorial.add(i);

            }

            i++;
        }

        System.out.println(fatorial);

    }
}
