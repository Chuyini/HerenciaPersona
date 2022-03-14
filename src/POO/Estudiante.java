package POO;

public class Estudiante extends Persona{
    private int codigoDeEstudiante;
    private float notaFinal;
    Estudiante(int edad, String nombre, String apellido,float notaFinal,int codigoDeEstudiante)
    {
        super(nombre,edad,apellido);
        this.notaFinal=notaFinal;
        this.codigoDeEstudiante=codigoDeEstudiante;
    }
    public void mostrarDatos()
    {
        System.out.println("Nombre "+getNombre());
        System.out.println("Apellidos "+getApellido());
        System.out.println("Edad "+getEdad());
        System.out.println("Codigo de estudiante "+codigoDeEstudiante);
        System.out.println("Nota final "+notaFinal);
    }
}
