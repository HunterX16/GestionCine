public class FuncionCine {
    private String tituloPelicula;
    private String sala;
    private int asientosOcupados;
    private double recaudacion;
    
    // Constante solicitada en la guia
    public static final double TARIFA_BASE = 12000.0;

    public FuncionCine(String tituloPelicula, String sala) {
        this.tituloPelicula = tituloPelicula;
        this.sala = sala;
        this.asientosOcupados = 0;
        this.recaudacion = 0.0;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        if (tituloPelicula.equals("")) {
            System.out.println("Error: El titulo no puede estar vacio");
        } else {
            this.tituloPelicula = tituloPelicula;
        }
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public int getAsientosOcupados() {
        return asientosOcupados;
    }

    public void setAsientosOcupados(int asientosOcupados) {
        if (asientosOcupados < 0) {
            System.out.println("Error: Los asientos no pueden ser negativos");
        } else {
            this.asientosOcupados = asientosOcupados;
            calcularRecaudacion();
        }
    }

    public double getRecaudacion() {
        return recaudacion;
    }

    public void setRecaudacion(double recaudacion) {
        if (recaudacion < 0) {
            System.out.println("Error: La recaudacion no puede ser negativa");
        } else {
            this.recaudacion = recaudacion;
        }
    }

    // Metodo base solicitado
    public void calcularRecaudacion() {
        this.recaudacion = this.asientosOcupados * TARIFA_BASE;
    }
}
