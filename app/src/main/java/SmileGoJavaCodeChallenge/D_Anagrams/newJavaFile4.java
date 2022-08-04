/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package SmileGoJavaCodeChallenge.D_Anagrams;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.omg.CORBA.StringHolder;

/**
 *
 * @author Filipe
 */
public class newJavaFile4 {

    private static boolean isAnagrama(String s1, String s2) {
        int r = 0;

        for (int i = 0; i < s1.length(); i++) {
            r = r ^ s1.charAt(i);
        }

        for (int i = 0; i < s2.length(); i++) {
            r = r ^ s2.charAt(i);
        }
        return (r == 0);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Digite uma palavra: ");

        String s1 = leitor.nextLine();

        System.out.println("Digite uma palavra: ");
        String s2 = leitor.nextLine();
        List<String> lista = new ArrayList<String>();

        if (isAnagrama(s1, s2)) {
            System.out.print(true);
            lista.add(s1);
            lista.add(s2);

        } else {
            System.out.print(false);
        }

    }
}
