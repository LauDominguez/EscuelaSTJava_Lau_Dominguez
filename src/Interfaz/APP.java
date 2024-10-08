package Interfaz;

import Entidad.Alumno;

public class APP {
    public static void main(String[] args){
        Alumno alumno1= new Alumno();
        double[] notas ={3,4,5,6,7};
        Alumno alumno2= new Alumno("Laura", "Dominguez", "Avda Colón 500", 38, notas, "4to Basico");

        System.out.println("Ingrese alumno");
        String nombre = Leer.dato();

        System.out.println("El promedio del alumno " + alumno1.getNombre() +" " + alumno1.getApellido() + " es: " +alumno1.promedioNota() );
        System.out.println("El promedio del alumno " + alumno2.getNombre() +" " + alumno2.getApellido() + " es: " +alumno2.promedioNota() );

    }
}
