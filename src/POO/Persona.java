package POO;

public class Persona {
    private String nombre;
    private int edad;
    private String apellido;

     public Persona(String nombre, int edad, String apellido)
    {
        this.apellido=apellido;
        this.edad=edad;
        this.nombre=nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getApellido()
    {
        return apellido;

    }

    public int getEdad()
    {
        return edad;
    }

}
