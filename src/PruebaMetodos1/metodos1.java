/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaMetodos1;

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
    private static int [] completarArray3(int Array[]){
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
        
    
    
    
    public static void main(String[] args) {
        
        int[]Arraya={1,2,3,4,5,6,7};
        int[]Arrayo= new int[20];
        
        mostrarArrayPantalla2(Arraya);
        System.out.println("\n");
        System.out.println(obtenerArrayComoString(Arraya));
        System.out.println("\n");
       // completarArray3(Arrayo);
        mostrarArrayPantalla2(completarArray3(Arrayo));
        

    }
}

