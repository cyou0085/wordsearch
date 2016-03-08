/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Method1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author carlosyoung
 */
public class method1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World");

        int count = 0;
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        int count4 = 0;
        int count5 = 0;
        int count6 = 0;
        int count7 = 0;
        int count8 = 0;
        int count9 = 0;
        int total = 0;
        String line;
        Scanner input = new Scanner(new File("/Users/carlosyoung/Documents/Towson/COSC600/Homework2/src/Majex4.txt"));

        while (input.hasNext()) {
            line = input.nextLine();
            for (int i = 0; i < line.length(); i++) {
                switch (line.charAt(i) - 48) {
                    case 0:
                        count++;
                        break;
                    case 1:
                        count1++;
                        break;
                    case 2:
                        count2++;
                        break;
                    case 3:
                        count3++;
                        break;
                    case 4:
                        count4++;
                        break;
                    case 5:
                        count5++;
                        break;
                    case 6:
                        count6++;
                        break;
                    case 7:
                        count7++;
                        break;
                    case 8:
                        count8++;
                        break;
                    case 9:
                        count9++;
                        break;
                    default:
                        break;
                }
            }

        }
        total = count + count1 + count2 + count3 + count4 + count5 + count6 + count7 + count8 + count9;
        if (count > total / 2) {
        }
        if (count1 > total / 2) {
            System.out.println("1 is the majority");
        }
        if (count2 > total / 2) {
            System.out.println("2 is the majority");
        }
        if (count3 > total / 2) {
            System.out.println("3 is the majority");
        }
        if (count4 > total / 2) {
            System.out.println("4 is the majority");
        }
        if (count5 > total / 2) {
            System.out.println("5 is the majority");
        }

        if (count6 > total / 2) {
            System.out.println("6 is the majority");
        }
        if (count7 > total / 2) {
            System.out.println("7 is the majority");
        }
        if (count8 > total / 2) {
            System.out.println("8 is the majority");
        }
        if (count9 > total / 2) {
            System.out.println("9 is the majority");
        }
    }
}
