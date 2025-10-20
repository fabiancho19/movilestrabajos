public class carros {
    private String marca;
    private String tipo;
    private String color;
    public carros(String marcacarro, String tipocarro, String colorcarro) {
        this.marca = marcacarro;
        this.tipo = tipocarro;
        this.color = colorcarro;
    }
    public void presentar() {
        System.out.println("Este nuevo " + marca + " , es de tipo: " + tipo + " y con su lindo y clasico color " + color + (" es de los mejores autos del mundo.") );
    }
    public static void main(String[] args) {
        carros carronuevo= new carros("lamborghini", "automatico", "negro mate");
        carronuevo.presentar();
    }
}
