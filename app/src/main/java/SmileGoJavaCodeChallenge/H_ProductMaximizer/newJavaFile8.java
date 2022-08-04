/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SmileGoJavaCodeChallenge.H_ProductMaximizer;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Arrays;
import org.apache.commons.lang3.ArrayUtils;

/**
 *
 * @author Filipe
 */
public class newJavaFile8 {

    public static void main(String args[]) {

        int numeros[] = new int[] { 1, 75, 3, 6, 7, 70 };
        int numerosb[] = new int[] { 5, 4, 3, 6, 7, 8 };

        int y = numerosb.length;
        int x = numeros.length;

        Arrays.sort(numeros);
        int num1, num2;

        int sum1 = numeros[0] * numeros[1];

        int sum2 = numeros[x - 1] * numeros[x - 2];

        if (sum1 > sum2) {
            num1 = numeros[0];
            num2 = numeros[1];
        } else {
            num1 = numeros[x - 2];
            num2 = numeros[x - 1];
        }
        System.out.println("Número um: " + num1 + "\nNúmeros dois: " + num2 + "\nMaior produto: " + num1 * num2);

        Arrays.sort(numerosb);
        int num3, num4;

        int sum3 = numerosb[0] * numerosb[1];

        int sum4 = numerosb[y - 1] * numerosb[y - 2];

        if (sum3 > sum4) {
            num3 = numerosb[0];
            num4 = numerosb[1];
        } else {
            num3 = numerosb[y - 2];
            num4 = numerosb[y - 1];
        }
        System.out.println("Maior número da sequencia 1: " + num2 + "\nMaior número da sequencia 2: " + num4
                + "\nProduto: " + num2 * num4);

    }
}
