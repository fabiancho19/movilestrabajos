public class TechHub { 
    // Atributos
    public String nombre;
    private String tipo;
    private String color;
    private String ubicacion;
    private String propietario;
    private int anioFundacion;
    private String horario;
    private int empleados;
    private String sitioWeb;
    private String telefonoContacto;

    // Constructor 
    public TechHub(String nombre, String tipo, String color, String ubicacion, String propietario,
                   int anioFundacion, String horario, int empleados, String sitioWeb, String telefonoContacto) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.ubicacion = ubicacion;
        this.propietario = propietario;
        this.anioFundacion = anioFundacion;
        this.horario = horario;
        this.empleados = empleados;
        this.sitioWeb = sitioWeb;
        this.telefonoContacto = telefonoContacto;
    }

    // Primer método
    public void tecnologia() {
        System.out.println("Bienvenidos a " + nombre + ", donde la " + tipo + " se convierte en nuestra pasión.");
        System.out.println("Color institucional: " + color);
        System.out.println("Ubicación: " + ubicacion);
        System.out.println("Propietario: " + propietario);
        System.out.println("Fundado en: " + anioFundacion);
        System.out.println("Horario de atención: " + horario);
        System.out.println("Empleados: " + empleados);
        System.out.println("Sitio web: " + sitioWeb);
        System.out.println("Teléfono: " + telefonoContacto);
    }

    public static class CatalogoProducto extends TechHub {
        private String producto;
        private double precio;
        private String marca;
        private String garantia;

        public CatalogoProducto(String nombre, String tipo, String color, String ubicacion, String propietario,
                                int anioFundacion, String horario, int empleados, String sitioWeb, String telefonoContacto,
                                String producto, double precio, String marca, String garantia) {
            super(nombre, tipo, color, ubicacion, propietario, anioFundacion, horario, empleados, sitioWeb, telefonoContacto);
            this.producto = producto;
            this.precio = precio;
            this.marca = marca;
            this.garantia = garantia;
        }

        public void mostrarProducto() {
            System.out.println("Producto disponible: " + producto + " - Marca: " + marca);
            System.out.println("Precio: $" + String.format("%,.0f", precio) + " COP - Garantía: " + garantia);
        }
    }

    public static class ProductoEspecial extends TechHub {
        private String estado;
        private double precio;
        private String marca;
        private boolean oferta;

        public ProductoEspecial(String nombre, String tipo, String color, String ubicacion, String propietario,
                                int anioFundacion, String horario, int empleados, String sitioWeb, String telefonoContacto,
                                String estado, double precio, String marca, boolean oferta) {
            super(nombre, tipo, color, ubicacion, propietario, anioFundacion, horario, empleados, sitioWeb, telefonoContacto);
            this.estado = estado;
            this.precio = precio;
            this.marca = marca;
            this.oferta = oferta;
        }

        // POLIMORFISMO
        @Override
        public void tecnologia() {
            System.out.println("Explora " + nombre + ": producto en estado " + estado + " por $" + String.format("%,.0f", precio) + " COP.");
            if (oferta) {
                System.out.println("Este producto está en oferta por tiempo limitado!");
            }
        }
    }

    // Método main 
    public static void main(String[] args) {
        // Instancia del negocio principal
        TechHub miNegocio = new TechHub(
            "TechHub", "tecnología móvil", "azul",
            "Bogotá, Colombia", "Fabián Sánchez",
            2018, "Lunes a Sábado de 9am a 8pm", 12,
            "www.techhub.com.co", "+57 320 555 7890"
        );
        miNegocio.tecnologia();

        System.out.println("\n--- Catálogo de productos ---");
        ProductoEspecial s23Ultra = new ProductoEspecial(
            "Samsung Galaxy S23 Ultra", "smartphone", "negro",
            "Bogotá, Colombia", "Fabián Sánchez",
            2018, "Lunes a Sábado de 9am a 8pm", 12,
            "www.techhub.com.co", "+57 320 555 7890",
            "reacondicionado", 2_400_000, "Samsung", true
        );
        s23Ultra.tecnologia();

        ProductoEspecial zFlip4 = new ProductoEspecial(
            "Samsung Galaxy Z Flip 4", "smartphone", "lavanda",
            "Bogotá, Colombia", "Fabián Sánchez",
            2018, "Lunes a Sábado de 9am a 8pm", 12,
            "www.techhub.com.co", "+57 320 555 7890",
            "nuevo", 3_899_000, "Samsung", false
        );
        zFlip4.tecnologia();
    }
}
