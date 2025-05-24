// Clase persona (abstracta para que nadie cree directamente una Persona)
public abstract class Persona {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

// Constructor: permite crear el objeto con sus datos desde el inicio
public Persona(String nombre, String apellido, String genero, int edad) {
    this.nombre = nombre;
    this.apellido = apellido;
    this.genero = genero;
    this.edad = edad;
}

    // Métodos públicos (getters) para acceder a los atributos privados
    public String getNombre() {
        return nombre;
    }

    public String getGenero() {
        return genero;
    }

    public int getEdad() {
        return edad;
    }

    public abstract String descripcionGenero();
}
