public class Mascota { // Nombre de clase debe ser el mismo del archivo
    // Atributo privado
    private String nombre;
    private String tipo;
    private String color;
    // Constructor
    public Mascota(String nombremascota, String tipomascota, String colormascota) {
        this.nombre = nombremascota;
        this.tipo = tipomascota;
        this.color = colormascota;
    }

    // Método saludar que es el primer metodo
    public void saludar() {
        System.out.println("Hola, soy " + nombre + ", soy de tipo: " + tipo + " y mi color es: " + color + ("!") );
    }

    // Método main para ejecutar el programa
    public static void main(String[] args) {
        Mascota mascotahija = new Mascota("Kairos", "Criollo", "Beige");
        mascotahija.saludar();

    }
}
