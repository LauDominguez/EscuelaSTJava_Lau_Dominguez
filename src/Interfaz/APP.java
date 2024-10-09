package Interfaz;

import Entidad.Alumno;

public class APP {
    public static void main(String[] args){
        String nombre, apellido, direccion, curso;
        double notas[];
        int edad;

        Alumno alumno = null;

        int opcion;
        do{
            //haga algo
            System.out.println("--------Escuela ST. Java -------");
            System.out.println("-------- 1) Registrar Alumno-------");
            System.out.println("-------- 2) Calcular peor nota alumno -------");
            System.out.println("-------- 3) Calcular mejor nota alumno -------");
            System.out.println("-------- 4) Promedio Notas Alumno -------");
            System.out.println("-------- 5) Situacion Academica Alumno -------");
            System.out.println("-------- 6) Salir -------------------");
            System.out.println("-------------------------------------");
            System.out.println("-------- Por favor ingrese una opción para continuar -------");

            opcion = Leer.datoInt();

            switch (opcion){
                case 1:
                    //opcion 1 (Ingreso)
                    System.out.println("Opcion 1");
                    break;
                case 2:
                    //opcion 2 (nota peor)
                    System.out.println("Opcion 2");
                    break;
                case 3:
                    //opcion 3 (nota mayor)
                    System.out.println("Opcion 3");
                    break;
                case 4:
                    //opcion 4 (promedio)
                    System.out.println("Opcion 4");
                    break;
                case 5:
                    //opcion 5 (situacion academica)
                    System.out.println("Opcion 5");
                    break;
            }
        } while (opcion <=  6);
    }
}
