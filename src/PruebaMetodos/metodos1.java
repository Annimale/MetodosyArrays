/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaMetodos;
import java.util.Arrays;
//
/**
 *Escribe una clase de nombre PruebaMetodos1 con los métodos
estáticos que se proponen a continuación. Incluir en el método main() de
la clase las sentencias necesarias para comprobar el correcto
funcionamiento de dichos métodos.
1. Escribe un método, de nombre mostrarArrayPantalla2, que reciba por
parámetro un array de enteros y muestre sus valores por pantalla
separados por comas.
2. Escribe un método, de nombre obtenerArrayComoString, que reciba
un array de enteros por parámetro y devuelva una cadena de
caracteres con su contenido.
3. Escribe un método, de nombre completarArray3, que reciba un array
de enteros por parámetro y lo rellene de forma que contenga tantos
números pares, a partir del cero, como permita su capacidad.
4. Escribe un método, de nombre obtenerSumaArray, que reciba por
parámetro un array de enteros y devuelva la suma de sus elementos.
5. Escribe un método, de nombre arrayPotencias2, que cree un array y lo
rellene con potencias de 2. Las potencias de 2 comenzarán en 2º y el
número total de ellas se recibirá por parámetro. El método devolverá el
array creado.
6. Escribe un método que reciba como parámetro un array de cadenas y
devuelva la cadena resultante de concatenar todas las contenidas en
el array.
7. Escribe un método, de nombre obtenerSumaLongCadArray, que
reciba por parámetro un array de cadenas y devuelva el número total
de caracteres de todas las cadenas del array.
8. Escribe un método, de nombre obtenerLongCadenas, que reciba por
parámetro un array de cadenas y devuelva un array de enteros con los
tamaños de las cadenas contenidas en el array.
9. Escribe un método, de nombre obtenerArrCad5Vocales, que reciba por
parámetro un array de cadenas y devuelva un array con las que
contengan las 5 vocales. Para la consideración de un carácter como
vocal no se tendrá en cuenta si está en mayúsculas o minúsculas.
10.Escribe un método, de nombre obtenerArrayOrdAlfab, que reciba por
parámetro un array de cadenas de caracteres y las ordene 
 * @author skril
 */
public class metodos1 {
    
    private static void MostrarArrayString(String[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print("| " + Array[i] + " |");

        }
    }
    
    private static void mostrarArrayPantalla2 (int Array[]){// METODO PARA VISUALIZAR LOS ELEMENTOS DE UN ARRAY/ VECTOR SEPARADOS POR UNA COMA
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i]);
            System.out.print(", ");
        }
        
    }
    //SI ES STATIC NO SE TIENE QUE CREAR UN OBJETO POR LO QUE PUEDES LLAMAR AL METODO SIN TENER UN OBJETO
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
            int aux= (int)(Math.random()*100);//Hacemos que aux valga cada vez un numero, ES NECESARIO CREAR UNA VARIABLE AUX porque sino cogerá los valores de i los cuales son cont (son cont para que me recorrá todas las posiciones del Array independientemente de si es par o impar
            if(aux%2==0){// Condición para que sea par
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
        int contvoc=0;
        String[] acumulaTor=new String[Array.length];
        
        
        for (int i = 0; i < Array.length; i++) {
            if ((Array[i].contains("a")|| Array[i].contains("A"))&& (Array[i].contains("e")|| Array[i].contains("E")) && (Array[i].contains("o")|| Array[i].contains("O")) && (Array[i].contains("i")|| Array[i].contains("I")) && (Array[i].contains("u")|| Array[i].contains("U")) ){
                acumulaTor[contvoc++]=Array[i];//Ponemos contvoc++ en el elemento de acumulaTor para que me aumente y asigne a la posicion de contvoc la palabra que contenga las 5  vocales, por eso Acueductoi sale en la posicion 0 y Murcielago en la posicion 1
            }
        }
        String[] finaL=new String[contvoc];
        for (int i = 0; i < contvoc; i++) {
            finaL[i]=acumulaTor[i];
        }
        return finaL;
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
        String[]ArrayC={"Manolo","Pepe","Juanito","Manolito","Murcielago","Acueductoi"};
        
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
        System.out.println("\n");
        MostrarArrayString(obtenerArrCad5Vocales(ArrayC));
        

    }
}

