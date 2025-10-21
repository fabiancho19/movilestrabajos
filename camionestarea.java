public class camionestarea {
    private String marca;
    private String modelo;
    private String color;
    private String tipocombu;
    private String estado;
    private int añofabricacion;
    private double capacarga;
    private int numeroeje;
    private double km;
    private double precio;
    // constructor
    public camionestarea(String marca, String modelo, String color, String tipocombu, String estado, double capacarga, double km, double precio, int añofabricacion, int numeroeje){
        this.marca = marca;
        this.modelo = modelo;
        this.estado = estado;
        this.color = color;
        this.tipocombu = tipocombu;
        this.añofabricacion = añofabricacion;
        this.capacarga = capacarga;
        this.numeroeje = numeroeje;
        this.km = km;
        this.precio = precio;
}
    public void infocamion(){
    System.out.println("este nuevo vehiculo de " + marca + " su modelo es:" + modelo + " " + estado + " con su lindo color " + color + " usa " + tipocombu + " fabricado en el año" + añofabricacion + " cuenta con un asombrosa capacidad de (toneladas)" + capacarga + " y sus "+ numeroeje + " numeros de ejes y con tan solo " + km + " te lo podras llevar por tan solo USD$" + precio);
    }
    public static void main(String[] args) {
    camionestarea[] mostrarcatalogo = {
        new camionestarea("Volvo", "FH16", "blanco", "Diesel", "nuevo", 500, 6, 0, 2024, 95000),
        new camionestarea("Volvo", "FMX", "rojo", "Diesel", "nuevo", 450, 4, 200, 2023, 91000),
        new camionestarea("Volvo", "FE", "azul", "Diesel", "nuevo", 300, 2, 1500, 2022, 86000),
        new camionestarea("Volvo", "FL", "gris", "Diesel", "nuevo", 250, 2, 1000, 2023, 82000),
        new camionestarea("Volvo", "VNR", "negro", "Diesel", "nuevo", 400, 5, 300, 2024, 97000),
        new camionestarea("Volvo", "VNL", "blanco", "Diesel", "nuevo", 550, 6, 100, 2024, 102000),
        new camionestarea("Volvo", "FM", "verde", "Diesel", "nuevo", 420, 4, 800, 2023, 89000),
        new camionestarea("Volvo", "VM", "amarillo", "Diesel", "nuevo", 350, 3, 1200, 2022, 83000),
        new camionestarea("Volvo", "VT", "plateado", "Diesel", "nuevo", 600, 6, 0, 2024, 105000),
        new camionestarea("Volvo", "F12", "azul oscuro", "Diesel", "nuevo", 480, 5, 500, 2023, 94000)
        };
        for (camionestarea camion : mostrarcatalogo) {
            camion.infocamion();
        }
    //depreciacion
    System.out.println("========DEPRECIACION========");
    System.out.println("NO LA CALCULAMOS POR EL MOMENTO");
    //mantenimiento
    System.out.println("========MANTENIMIENTO========");
    System.out.println("====guia de mantenimiento====");
    System.out.println("1. despues de 100.000 km revisar ");
    System.out.println("2. despues de 300.000 km revisar ");
    System.out.println("3. despues de 500.000 km revisar ");
    System.out.println("4. despues de 700.000 km revisar ");
    System.out.println("5. despues de 900.000 km revisar ");
    System.out.println("6. despues de 1'000.000 km comprar uno nuevo");
    //descuentos
    System.out.println("========DESCUENTOS========");
    System.out.println("Si el modelo es usado y anterior al 2005 tendras el 40%");
    System.out.println("Si el modelo es usado y esta entre (2006-2015) tendras el 20%");
    System.out.println("Si el modelo es usado y esta entre (2016-2020) tendras el 10%");
    //
    }
}
