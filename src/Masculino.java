// Clase que hereda de Persona y representa a un individuo masculino
public class Masculino {

    // Constructor que automáticamente define el género como "Masculino"
    public Masculino(String nombre, String apellido, int edad) {
        super(nombre, apellido, "Masculino", edad);
    }

    // Implementación específica del método abstracto
    @Override
    public String descripcionGenero() {
        return "Masculino";
    }
}