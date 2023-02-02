/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PruebaMetodos;

/**
 *Sea la clase Alumno que se presenta a continuación:
public class Alumno {
int númeroPersonal:
String apellido1, apellido2, nombre:
int numAsignaturas:
double[ ] notasFinales:
double notaMediaFinal:
public Alumno(int numPer, String ap1, String ap2, String nom, int
num Asig) {
númeroPersonal = numPer:
apellido1 = ap1:
Programación - DAM U06 – Ejercicios4
5
apellido2 = ap2:
nombre = nom:
numAsignaturas = numAsig:
notasFinales = new double[numAsignaturas]:
}
public Alumno(int numPer, String ap1, String ap2, String nom, int
numAsig, double[ ] notasF, double nmf) {
númeroPersonal = numPer:
apellido1 = ap1:
apellido2 = ap2:
nombre = nom:
numAsignaturas = numAsig:
notasFinales = notasF:
notaMediaFInal = nmf:
}
public String toString( ) {
String resul:
resul = “NP: “ + númeroPersonal + “\n” +
“ Nombre: “ + nombre +
“ Apellido1: “ + apellido1 +
“ Apellido2: “ + apellido2 + “\n” +
“ Nota Media Final: “ + notaMediaFinal + “\n”:
return resul:
}
public double obtenerNotaMediaFinal( ) {
return notaMediaFinal:
}
}
 Añade a la clase un método, de nombre asignarNotas, que reciba
por parámetro una matriz de valores reales con las notas que el
alumno ha obtenido en dos evaluaciones realizadas. La primera
dimensión de la matriz corresponderá al número de evaluaciones y,
por tanto, sólo podrá contener 2 posiciones. La segunda dimensión
corresponde a las calificaciones obtenidas por el alumno en cada
una de las asignaturas. El método calculará la nota final para cada
una de las asignaturas teniendo en cuenta que la nota de la
primera evaluación tiene un peso del 60% y la de la segunda
evaluación el 40% restante. El método también determinará la nota
media final del alumno.
 Añade a la clase un método, de nombre pasaDeCurso, que indique
si el alumno podrá acceder al siguiente curso. Se considera que un
alumno puede pasar de curso si su nota media final es mayor o
igual de 5.0 y tiene menos de 3 asignaturas suspensas.
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




