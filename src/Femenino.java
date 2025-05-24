// Clase que hereda de Persona y representa a un individuo femenino.
public class Femenino extends Persona{

    // Constructor que automáticamente define el género como "Femenino"
    public Femenino(String nombre, String apellido, int edad) {
        super(nombre, apellido, "Femenino", edad);
    }