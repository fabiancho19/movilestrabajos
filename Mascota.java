public class Mascota { // Nombre de clase debe ser el mismo del archivo     // Atributo privado
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
    public static class tipoanimalmascota extends Mascota {
        private String animal;

    public tipoanimalmascota(String nombre, String tipo, String color, String animal){
        super(nombre, tipo, color);
        this.animal = animal;
    }
    public void definiranimal(){
        System.out.println("y soy un " + animal);
    }
}
    // Método main para ejecutar el programa
    public static void main(String[] args) {
        Mascota mascotahija = new Mascota("Kairos", "Doberman", "Beige"); //llamo al constructor 
        mascotahija.saludar();
        //CREANDO el segundo objeto mi mascota
        Mascota Mimascota = new Mascota("toby", "criollo", "beige");
        Mimascota.saludar();
        tipoanimalmascota mascotaconraza = new tipoanimalmascota ("max", "labrador", "marron", "perro");
        mascotaconraza.saludar();
        mascotaconraza.definiranimal();
    }
}
