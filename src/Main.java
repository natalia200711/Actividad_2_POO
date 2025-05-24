import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();

        System.out.println("----- REGISTRO DE PERSONAS -----");

        // Captura de 5 personas desde teclado
        for (int i = 1; i <= 5; i++) {
            System.out.println("\nIngrese los datos de la persona " + i + ":");
            System.out.print("Nombre: ");
            String nombre = scanner.nextLine();
            System.out.print("Apellido: ");
            String apellido = scanner.nextLine();
            System.out.print("Género (Masculino/Femenino): ");
            String genero = scanner.nextLine().trim();
            System.out.print("Edad: ");
            int edad = Integer.parseInt(scanner.nextLine());

            if (genero.equalsIgnoreCase("Masculino")) {
                personas.add(new Masculino(nombre, apellido, edad));
            } else if (genero.equalsIgnoreCase("Femenino")) {
                personas.add(new Femenino(nombre, apellido, edad));
            } else {
                System.out.println("Género inválido. Persona no registrada.");
            }
        }