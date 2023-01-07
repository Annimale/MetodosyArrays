/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaMetodos;

import java.util.Arrays;

/**
 *
 * @author skril
 */
public class APIManejoArrays1Ej19 {

    public static void main(String[] args) {

        int[] arrInt1 = new int[30];// A)

        for (int i = 0; i < arrInt1.length; i++) {
            if (i <= 10) {
                arrInt1[i] = 0;
            }
            if (i >= 10) {//Si i es mayor o igual que 10 le asigno 1 hasta que sea 20 por la otra condición
                arrInt1[i] = 1;
            }
            if (i >= 20) {//SI i es MAYOR o IGUAL que 20 le asigno 0 hasta que se acabe el .length del array
                arrInt1[i] = 0;
            }
            System.out.print("| " + arrInt1[i] + " |");
        }
        System.out.println("\n***************************************************");

        char[] arrChar = new char[6];// b)

        for (int i = 0; i < arrChar.length; i++) {
            if (i < 3) {
                arrChar[i] = 'a';
            }
            if (i >= 3) {
                arrChar[i] = 'b';
            }
            System.out.print("| " + arrChar[i] + " |");
        }
        System.out.println("\n***************************************************");

        int[] arrInt2 = new int[10];// C)
        int aux = 9;
        for (int i = 0; i < arrInt2.length; i++) {
            arrInt2[i] = aux--;
            System.out.print("| " + arrInt2[i] + " |");

        }
        System.out.println("\n***************************************************");

        Arrays.sort(arrInt2); //Ordenamos el array para que tenga orden ascendente
        for (int i = 0; i < arrInt2.length; i++) {
            System.out.print("| " + arrInt2[i] + " |");

        }

        System.out.println("\n***********************  EJERCICIO 20 ***********");
        //EJERCICIO 20 A)

        String[] arrStr = {"impresora", "peto", "mar", "orilla", "Orihuela"};
        String[] acumuladorString = new String[arrStr.length]; //Hemos creado otro Array para poder ignorar las mayusculas y asi acumular los String ordenados aqui y luego simplemente pasarlos a lowercase y luego ordenarlos

        for (int i = 0; i < arrStr.length; i++) {

            System.out.print(arrStr[i] + " ");
        }
        //ORDENAMOS EL ARRAY EJERCICIO B)
        System.out.println("\n***************************************************");
        Arrays.sort(arrStr);
        for (int i = 0; i < arrStr.length; i++) {
            acumuladorString[i] = arrStr[i];//Aqui lo que hacemos es asignarle a acumuladorString[i] los valores ordenados de arrStr[i]
            System.out.print(arrStr[i] + " ");
        }
        //ORDENAMOS EL ARRAY SIN TENER EN CUENTA LAS MAYUSCULAS C) Lo que hemos tenido que hacer ha sido meter las variables de arrStr en otro array para poder pasarlo todo a minusculas y luego ordenarlo sin tener que alterar el original
        System.out.println("\n***************************************************");
        for (int i = 0; i < acumuladorString.length; i++) {
            acumuladorString[i] = acumuladorString[i].toLowerCase();// Aqui nos daba error porque tenia primero que asignarle a la [i] =acumuladorString[i].toLowerCase() , no se puede poner simplmente el acumuladorString[i].toLowerCase() hay que asignarselo
            Arrays.sort(acumuladorString);
            System.out.print(acumuladorString[i] + " ");
        }
        System.out.println("\n***************************************************");
        //EJERCICIO D)
        for (int i = 0; i < arrStr.length; i++) {
            for (int j = i + 1; j < arrStr.length; j++) {
                if (arrStr[i].length() < arrStr[j].length()) {
                    String temp = arrStr[i];
                    arrStr[i] = arrStr[j];
                    arrStr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("| " + arrStr[i] + " |");
        }
        //EJERCICIO E)
        System.out.println("\n***************************************************");

        int numVocI = 0, numVocJ = 0;
        for (int i = 0; i < arrStr.length; i++) {
            for (int k = 0; k < arrStr[i].length(); k++) {
                if ((arrStr[i].charAt(k) == 'a') || (arrStr[i].charAt(k) == 'A') || (arrStr[i].charAt(k) == 'e') || (arrStr[i].charAt(k) == 'E') || (arrStr[i].charAt(k) == 'i') || (arrStr[i].charAt(k) == 'I') || (arrStr[i].charAt(k) == 'o') || (arrStr[i].charAt(k) == 'O') || (arrStr[i].charAt(k) == 'u') || (arrStr[i].charAt(k) == 'U')) {
                    numVocI++;
                }
            }
            for (int j = i + 1; j < arrStr.length; j++) {
                for (int k = 0; k < arrStr[j].length(); k++) {
                    if ((arrStr[j].charAt(k) == 'a') || (arrStr[j].charAt(k) == 'A') || (arrStr[j].charAt(k) == 'e') || (arrStr[j].charAt(k) == 'E') || (arrStr[j].charAt(k) == 'i') || (arrStr[j].charAt(k) == 'I') || (arrStr[j].charAt(k) == 'o') || (arrStr[j].charAt(k) == 'O') || (arrStr[j].charAt(k) == 'u') || (arrStr[j].charAt(k) == 'U')) {
                        numVocJ++;
                    }

                }
                if (numVocI < numVocJ) {
                    String temp2 = arrStr[i];
                    arrStr[i] = arrStr[j];
                    arrStr[j] = temp2;
                }
                numVocJ = 0;
            }
            numVocI = 0;
        }
        for (int i = 0; i < arrStr.length; i++) {
            System.out.println("| " + arrStr[i] + " |");
        }

    }
}
