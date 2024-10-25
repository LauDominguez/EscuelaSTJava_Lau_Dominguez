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
            System.out.println("-------- Por favor ingrese una opción del 1 al 6 para continuar -------");


            opcion = Leer.datoInt();

            switch (opcion){
                case 1:
                    //opcion 1 (Ingreso)
                    System.out.println("Ingrese el Nombre del Alumno");
                    nombre = Leer.dato();

                    System.out.println("Ingrese el Apellido del Alumno");
                    apellido = Leer.dato();

                    System.out.println("Ingrese la dirección del Alumno");
                    direccion = Leer.dato();



                    System.out.println("Ingrese la edad del Alumno");
                    edad = Leer.datoInt();

                    int cantdeNotas; // entre 3 y 7 notas
                    do{
                        System.out.println("Ingrese la cantidad de notas del alumno, mínimo 3, maximo 7");
                        cantdeNotas = Leer.datoInt();



                    }while(cantdeNotas < 3 || cantdeNotas> 7);
                    notas = new double[cantdeNotas];

                    for( int i=0; i < notas.length; i++){

                        do {
                            System.out.println("Ingrese nota nro" + (i+1));
                            notas[i] = Leer.datoDouble();
                        }while(notas[i] < 1 || notas[i] > 10);
                    }

                    System.out.println("Ingrese el Curso del Alumno");
                    curso = Leer.dato();

                    alumno = new Alumno(nombre,apellido,direccion,edad,notas,curso);

                    System.out.println("El alumno" + alumno.getNombre() + " " + alumno.getApellido() + " " + "se registro correctamente");
                    break;
                    
                case 2:
                    //opcion 2 (nota peor)
                    if (alumno ==null){
                        System.out.println("El alumno no está registrado");
                    }else{
                        System.out.println("La peor nota de " + alumno.getNombre() +" " + alumno.getApellido() + " es " + alumno.peorNota());
                    }

                    break;
                case 3:
                    //opcion 3 (nota mayor)
                    if (alumno ==null){
                        System.out.println("El alumno no está registrado");
                    }else{
                        System.out.println("La mejor nota de " + alumno.getNombre() +" " + alumno.getApellido() + " es " + alumno.mejorNota());
                    }

                    break;
                case 4:
                    //opcion 4 (promedio)
                    if (alumno ==null){
                        System.out.println("El alumno no está registrado");
                    }else{
                        System.out.println("El promedio de" + alumno.getNombre() +" " + alumno.getApellido() + " es " + alumno.promedioNota());
                    }
                    break;
                case 5:
                    //opcion 5 (situacion academica)
                    if (alumno ==null){
                        System.out.println("El alumno no está registrado");
                    }else{
                        System.out.println(alumno.evaluarSituacionAcademica());
                    }
                    break;
            }
        } while (opcion !=  6);
    }
}
