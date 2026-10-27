public class FuncionEstreno extends FuncionCine {
    
    public FuncionEstreno(String tituloPelicula, String sala) {
        super(tituloPelicula, sala);
    }

    // Modifica el calculo aplicando un recargo del 25 por ciento
    public void calcularRecaudacion() {
        double base = getAsientosOcupados() * TARIFA_BASE;
        double recargo = base * 0.25;
        setRecaudacion(base + recargo);
    }
}
