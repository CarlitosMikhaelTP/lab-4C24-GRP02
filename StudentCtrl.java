public class Persona {
    // Variables de instancia
    private String nombre;
    private int edad;

    // Constructor
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método para obtener el nombre
    public String getNombre() {
        return nombre;
    }

    // Método para establecer el nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    // Método para obtener la edad
    public int getEdad() {
        return edad;
    }

    // Método para establecer la edad
    public void setEdad(int edad) {
        this.edad = edad;
    }

    // Método para imprimir información de la persona
    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }

    public static void main(String[] args) {
        // Crear una instancia de Persona
        Persona persona1 = new Persona("Juan", 30);

        // Mostrar la información de la persona
        persona1.mostrarInformacion();
    }
}
