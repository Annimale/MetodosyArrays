/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaMetodos;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author skril
 */
public class metodos1 {
    
    private static void mostrarArrayPantalla2 (int Array[]){// METODO PARA VISUALIZAR LOS ELEMENTOS DE UN ARRAY/ VECTOR SEPARADOS POR UNA COMA
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]);
            System.out.print(", ");
        }
        
    }
    
    private static String obtenerArrayComoString(int []Array){//METODO PARA CONVERTIR UN ARRAY INT A STRING
        // LO QUE HACE ES ACUMULAR EL VALOR DE LOS INTs del ARRAY EN UNA VARIABLE AUXILIAR DE TIPO STRING Y LUEGO DEVUELVE ESA CADENA
        String aux="";
        
        for (int i = 0; i < Array.length; i++) {
            aux+=Array[i]+ ", ";
        }
       return "["+aux+"]";
    }
    private static int [] completarArray3(int Array[]){//EJERRCICIO 3  RELLENAR ARRAY DE NUMEROS PARES EN FUNCION DE LA LONGITUD  DE SU ARRAY
        int cont=0;
        for (int i = 0; cont < Array.length; i++) {
            int aux= (int)(Math.random()*100);//Hacemos que aux valga cada vez un numero
            if(aux%2==0){
            Array[cont]=aux; //Le asignamos a cont el valor de aux y se lo metemos al array
            cont++;//Aumentamos en 1 la posicion de contador para que llegue hasta el length del array puesto en el for
        }    
        }
            return Array;
        }
    
    private static int obtenerSumaArray(int Array []){//SUMAR LOS VALORES DE UN ARRAY INT
        
        int aux=0;
        
        for (int i = 0; i < Array.length; i++) {
            aux=Array[i]+aux;
        }
        return aux;
    }
    
    private static double [] arrayPotencias2(int numeroTotal){
        double [] Arraye=new double [numeroTotal];//Le asignamos al Array que coja la longitud que nosotros queramos introduciendolo en el método
        
            
        for (int i = 1; i < Arraye.length; i++) {//Empezamos desde la segunda posición, en este caso 1.
            Arraye[i]=(Math.pow(2, i));//Como es 2^i lo ponemos asi
            
        }
        
        return Arraye;
    }
    
    private static void arrayCadenas(String Array[]){
        String aux="";
        
        for (int i = 0; i < Array.length; i++) {
            aux= Array[i]+", "+aux;
        }
        
        System.out.println(aux);
    }
    
    private static void obtenerSumaLongCadArray(String Array[]){
        int aux=0;
        for (int i = 0; i < Array.length; i++) {
            aux=Array[i].length()+aux;//en Array hay que indicar el elemento en este caso [i] y como queremos saber la longitude la cadena de ese elemento, ya que es un String, el metodo es con parentesis .length()
            //Si fuese sin parentesis sabriamos la longitud del array no del vector.
            
            
        }
        
        System.out.println(aux);
        
    }
        
    private static String []obtenerArrCad5Vocales (String Array[]){//EJERCICIO 9
        
        String[] acumulaTor=new String[200];
        for (int i = 0; i < Array.length; i++) {
            if (Array[i].contains("a")|| Array[i].contains("A")&& Array[i].contains("e")|| Array[i].contains("E") && Array[i].contains("o")|| Array[i].contains("O") && Array[i].contains("i")|| Array[i].contains("I") && Array[i].contains("u")|| Array[i].contains("U") ){
                acumulaTor[i]=Array[i];
            }
            
            
        }
        return acumulaTor;
    }
    
    private static void obtenerArrayOrdAlfab(String Array[]){
        
        Arrays.sort(Array, String.CASE_INSENSITIVE_ORDER);
        
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]+", ");
            
        }
        
        
    }
    
    
    
    public static void main(String[] args) {
        
        int[]Arraya={1,2,3,4,5,6,7};
        int[]Arrayo= new int[20];
        String[]ArrayC={"Manolo","Pepe","Juanito","Manolito"};
        
        mostrarArrayPantalla2(Arraya);
        System.out.println("\n");
        System.out.println(obtenerArrayComoString(Arraya));
        System.out.println("\n");
       // completarArray3(Arrayo);
        mostrarArrayPantalla2(completarArray3(Arrayo));
        System.out.println("\n");
        System.out.println(obtenerSumaArray(Arraya));
        System.out.println("\n");
        arrayCadenas(ArrayC);
        System.out.println("\n");
        obtenerSumaLongCadArray(ArrayC);
        System.out.println("\n");
        obtenerArrayOrdAlfab(ArrayC);

    }
}

