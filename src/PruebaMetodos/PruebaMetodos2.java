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
public class PruebaMetodos2 {

    
    private static void MostrarMatrizStringDeAsteriscos(String[][] Matriz){
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j <Matriz[i].length ; j++) {
                //System.out.println(Matriz[i][j]);
            }
            
        }
    }
    
    
    
    
    private static void rellenarMatrizSecuencia2D(int Matriz[][]) {

        int valor = 0;
        int valory = 0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][0] = valory;//Lo que hacemos es fijar la columna 0 y que me vaya aumentando de 1 en 1 cuando salte de fila
                Matriz[i][1] = valor;//Como el valor+=5 está dentro de este mismo bucle le asigna a la primera posicion de cada columna 5 10 15 20
                Matriz[i][2] = valor;// y cuando salta a la siguiente fila parte desde 1 y va 6 11 16 21
                Matriz[i][3] = valor;//y asi sucesivamente
                Matriz[i][4] = valor;                    //TIENE QUE HABER ALGUNA MANERA DE HACERLO ASI Matriz[i][j]=valory[i] valor[j]
                System.out.print("| " + Matriz[i][j] + " |");
                valor += 5;
            }

            valory++;//Aqui aumentamos para que la primera columna vaya de uno en uno
            valor = valory;//Aqui asignamos que valor vuelva a partir desde el valor de valory
            System.out.println();
        }
    }

    private static void mostrarMatrizID(int Matriz[][]) {
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                System.out.print("| " + Matriz[i][j] + " |");//Las i= las filas y las j=son las columnas, y el ejercicio pide que la primera dimensión corresponda a las i(filas) y la segunda a las j(columnas)
            }
            System.out.println();//Me daba OUT OF BOUNDS porque estaba inviertiendo el orden System.out.print("| "+Matriz[j][i]+" |"); entonces estaba asignando que la J sean las filas y las I las columnas cuando primero me tiene que imprimir las filas I y luego las columnas J 
            //Cuando el orden de los bucles es primero I y luego J. ESTO LO HACE PORQUE LAS I siempre son FILAS y las J siempre son columnas gracias al orden de los bucles
        }//NO ME PUEDE IMPRIMIR NADA PORQUE A PESAR DE YO QUERER IMPRIMIR 6 FILAS EN J EN REALIDAD TIENE SOLO 4 POR EL ORDEN DE LOS BUCLES ENTONCES DA OUT OF BOUNDS
    }

    private static String matrizIntComoString(int Matriz[][]) {//EJERCICIO 13 PASRA MATRIZ INT A STRING
        String aux = "";

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                aux = Matriz[i][j] + ", " + aux;//A una variable String auxiliar le asigno el valor INT de la Matriz

            }
            System.out.println();
        }
        return "[ " + aux + " ]";
    }

    private static String[][] rellenarMatrizAsteriscos(int Filas) {
        //String ast="*"; NO PIDE PAN 
        int columnas = (2 * Filas) - 1;
        int espacios = Filas - 1;
        int num = 1;

        String Matriz[][] = new String[Filas][columnas];

        for (int i = 0; i < Filas; i++) {
            for (int j = espacios; j > 0; j--) {
                Matriz[i][j] = " ";//Aqui pinto los espacios vacios
                System.out.print(Matriz[i][j]);
            }
            for (int k = 0; k < num; k++) {
                Matriz[i][k] = "*";//AQUI PINTAMOS LOS ASTERISCOS
                System.out.print(Matriz[i][k]);
            }
            num += 2;
//for (int j = (Filas-i-1); j < (Filas+i); j++) {
            //if(j==(Filas-i-1) )
            //else
            //  System.out.print("0");
            espacios--;
            System.out.println();
        }
        //System.out.println();

        return Matriz;
    }

    private static int obtenerSumaElementosMatriz(int Matriz[][]) {
        int aux = 0;
        int valor = 0;
        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < Matriz[i].length; j++) {
                Matriz[i][j] = valor++;
                aux = Matriz[i][j] + aux;

            }

        }
        return aux;
    }

    private static int[][] obtenerDiagonales(int Matriz[][]) {//EJERCICIO 16

        int filas = Matriz.length;
        int colu = Matriz[0].length;//Ponemos Matriz[0] para que empieza a contar solo en la primera y asi poder calcular CUANTAS COLUMNAS HAY

        int[][] MatrizDevo = new int[filas][colu];
        int valor = 1;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colu; j++) {
                Matriz[i][j] = valor++;
                //MatrizDevo[i][j]=valorDevo++;
                // System.out.print("| "+Matriz[i][j]+" |");
            }

            //System.out.println();
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colu; j++) {
                if ((j == i) || (j == (colu - i -1))) {
                    MatrizDevo[i][j] = Matriz[i][j];
                }
            }

        }

        return MatrizDevo;

    }
    
    private static int [][] obtenerLaterales (int Matriz[][]){//EJERCICIO 17
         int filas = Matriz.length;
        int colu = Matriz[0].length;//Ponemos Matriz[0] para que empieza a contar solo en la primera y asi poder calcular CUANTAS COLUMNAS HAY

        int[][] MatrizDevo = new int[filas][colu];
        int valor = 1;

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colu; j++) {
                Matriz[i][j] = valor++;
                //MatrizDevo[i][j]=valorDevo++;
                // System.out.print("| "+Matriz[i][j]+" |");
            }

            //System.out.println();
        }

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < colu; j++) {
                if ((i==0)&&(j==0) || 
                    (i==0) && (j==colu-1) ||
                    (i==filas-1) && (j==0) ||
                    (i==filas-1) && (j==colu-1)) {
                    MatrizDevo[i][j] = Matriz[i][j];
                }
            }

        }

        return MatrizDevo;

    }

    private static void ejercicio18() {

        int[][] Matriz = new int[5][5];
        int columnas = Matriz[0].length;

        for (int i = 0; i < Matriz.length; i++) {
            for (int j = 0; j < columnas; j++) {
                Matriz[i][j] = j + 1;//ESTA MANERA ES MAS ÓPTIMA
                //Matriz[i][0] = 1;
                //Matriz[i][1] = 2;
                //Matriz[i][2] = 3;
                //Matriz[i][3] = 4;
                //Matriz[i][4] = 5;
                System.out.print("| " + Matriz[i][j] + " |");

            }
            columnas--;
            System.out.println();
        }

    }

    public static void main(String[] args) {

        int[][] Matriza = new int[5][5];
        int[][] Matrize = new int[6][4];
        int[][] Matrizo = new int[3][2];

        rellenarMatrizSecuencia2D(Matriza);
        System.out.println("***************************");
        mostrarMatrizID(Matrize);
        System.out.println("***************************");
        System.out.println(matrizIntComoString(Matrize));
        System.out.println("------------------------");
        MostrarMatrizStringDeAsteriscos(rellenarMatrizAsteriscos(6));
        System.out.println("------------------------");
        System.out.println(obtenerSumaElementosMatriz(Matrizo));
        System.out.println("------------------------");
        mostrarMatrizID(obtenerDiagonales(Matriza));
        System.out.println("------------------------");
        mostrarMatrizID(obtenerLaterales(Matriza));
        System.out.println("------------------------");
        ejercicio18();

    }
}
