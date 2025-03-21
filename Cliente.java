public class Cliente {
    // Atributos privados
    private String nombre;
    private String dpi;
    private String direccion;

    // Constructor
    public Cliente(String nombre, String dpi, String direccion) {
        this.nombre = nombre;
        this.dpi = dpi;
        this.direccion = direccion;
    }

    //Metodo para mostrar datos del cliente
    public void mostrarDatos() {
        System.out.println("Nombre: " + nombre);
        System.out.println("DPI: " + dpi);
        System.out.println("Direccion: " + direccion);
    }
}