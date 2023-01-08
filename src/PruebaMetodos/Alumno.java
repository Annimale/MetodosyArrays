/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaMetodos;

/**
 *
 * @author skril
 */
public class Alumno {

    int numeroPersonal;
    String apellido1, apellido2, nombre;
    int numAsignaturas;
    double[] notasFinales;
    double notaMediaFinal;

    public  Alumno(int numPer, String ap1, String ap2, String nom, int numAsig) {
        numeroPersonal = numPer;
        apellido1 = ap1;
        apellido2 = ap2;
        nombre = nom;
        numAsignaturas = numAsig;
        notasFinales = new double[numAsignaturas];
    }

    public Alumno(int numPer, String ap1, String ap2, String nom, int numAsig, double[] notasF, double nmf) {
        numeroPersonal = numPer;
        apellido1 = ap1;
        apellido2 = ap2;
        nombre = nom;
        numAsignaturas = numAsig;
        notasFinales = notasF;
        notaMediaFinal = nmf;
    }

    public String toString() {
        String resul;
        resul = " NP: " + numeroPersonal + "\n"
                + " Nombre: " + nombre
                + "  Apellido1: " + apellido1
                + "  Apellido2: " + apellido2 + " \n"
                + "  Nota Media Final: " + notaMediaFinal + " \n";
        return resul;
    }

    public double obtenerNotaMediaFinal() {
        return notaMediaFinal;
    }

    public void asignarNotas(int[][] notas) {
        //LA PRIMERA DIMESION CORRESPONDE A LAS EVALUACIONES

        double notaFinal = 0;

        int total = 0;

        for (int i = 0; i < notas[0].length; i++) {
            for (int j = 0; j < notas.length; j++) {
                if (j == 0) {
                    notaFinal += notas[j][i] * 0.60;
                } else {
                    notaFinal += notas[j][i] * 0.40;
                }
                notasFinales[i] = notaFinal;
            }
            
            notaFinal = 0;
            System.out.print("| " +notasFinales[i] + " |");
        }

        for (int i = 0; i < notasFinales.length; i++) {

            notaMediaFinal += notasFinales[i];

        }
        
        notaMediaFinal = notaMediaFinal / notasFinales.length;
        System.out.println("Esta es la nota media final del Alumno:  "+notaMediaFinal);
    }
    
    public void pasaDeCurso(){
        int susP=0;
        for (int i = 0; i < notasFinales.length; i++) {
            if (notasFinales[i]<5) {
                susP++;
            }
            
        }
        if (susP>=3 && notaMediaFinal<5) {
            System.out.println("No pasa de cuerso");
        }else{
            System.out.println("Pasa de curso");
        }
    }
    public  static void main(String[] args) {
        
        
        Alumno Pepe=new Alumno(2,"Loles","Juana","Marrana",5);
        int[][] notasAlu={{5,6,8,2,6},{4,8,9,4,7}};
        Pepe.asignarNotas(notasAlu);
        Pepe.pasaDeCurso();
    }
}




