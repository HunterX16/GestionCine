public class Main {
    public static void main(String[] args) {
        System.out.println("--- GESTION DE CINE COLOMBIA ---");

        // Instanciar objetos de ambos tipos
        FuncionEstreno peliEstreno = new FuncionEstreno("Avatar 3", "Sala VIP 1");
        FuncionNormal peliNormal = new FuncionNormal("El Paseo", "Sala 4");

        // Cargar datos utilizando metodos set
        peliEstreno.setAsientosOcupados(45);
        peliNormal.setAsientosOcupados(60);

        // Desplegar resultados utilizando metodos get
        System.out.println("\nFuncion de Estreno:");
        System.out.println("Pelicula: " + peliEstreno.getTituloPelicula());
        System.out.println("Sala: " + peliEstreno.getSala());
        System.out.println("Asientos vendidos: " + peliEstreno.getAsientosOcupados());
        System.out.println("Total Recaudado: $" + peliEstreno.getRecaudacion() + " COP");

        System.out.println("\nFuncion Normal:");
        System.out.println("Pelicula: " + peliNormal.getTituloPelicula());
        System.out.println("Sala: " + peliNormal.getSala());
        System.out.println("Asientos vendidos: " + peliNormal.getAsientosOcupados());
        System.out.println("Total Recaudado: $" + peliNormal.getRecaudacion() + " COP");

        // Pruebas directas de validacion de valores negativos
        System.out.println("\n--- Ejecutando pruebas de control de errores ---");
        peliNormal.setAsientosOcupados(-10);
    }
}
