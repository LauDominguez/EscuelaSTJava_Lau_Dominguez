package Entidad;

public class Alumno {

    //Declaración de atributos
    private String nombre;
    private  String apellido;
    private String direccion;
    private int edad;
    private double[] notas;
    private String curso;

    public Alumno(String nombre, String apellido, String  direccion, int edad, double[] notas, String curso ){
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.edad = edad;
        this.notas = notas;
        this.curso = curso;

    }

    public Alumno(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public double peorNota() {
        double min = this.notas[0];

        for(int i=1; i < this.notas.length; i++){
            if(notas[i]< min){
                min = notas[i];
            }
        }

        return min;
    }

    public double mejorNota(){
        double max = 0;

        for(int i=0; i < this.notas.length; i++){
            if(notas[i]>max){
                max = notas[i];
            }
        }
        return max;
    }

  public double promedioNota(){
        double sumaNota = 0;

        for (double nota : this.notas){
            sumaNota = sumaNota + nota;
        }
        return sumaNota / this.getNotas().length;
    }


       public String evaluarSituacionAcademica(){
        if(this.promedioNota()>=4){
            return  "La situacion academica de " +this.getNombre() +" " +this.getApellido() + "es aprobado :)";
        }
        else {
            return  "La situacion academica de " +this.getNombre() +" " +this.getApellido() + "es desaprobado :(";
        }

    }
}
