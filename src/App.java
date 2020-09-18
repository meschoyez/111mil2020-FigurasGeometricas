import java.awt.Color;
import java.util.ArrayList;
import java.util.Random;

public class App {
    // Campos para su funcionamiento
    // Canvas es la ventana para graficar
    private Canvas miVentana;
    private Random aleatorio;
    // Mas informacion sobre ArrayList en la API de Java
    // API - Application Programming Interface
    //       Interface para Programacion de Aplicaciones
    private ArrayList<Circulo> circulos;
    private ArrayList<Triangulo> triangulos;
    private ArrayList<Rectangulo> rectangulos;
    private int ancho = 800;
    private int alto = 600;

    /**
     * Constructor sin parametros
     */
    public App () {
        aleatorio = new Random();
        circulos = new ArrayList<>();
        rectangulos = new ArrayList<>();
        triangulos = new ArrayList<>();
        miVentana = new Canvas("Hola Ventana", ancho, alto);
        miVentana.setVisible(true);
    }

    /**
     * Solo lanza la aplicacion
     * @param args Los del Sistema Operativo
     * @throws Exception En caso de fallo
     */
    public static void main(String[] args) throws Exception {
        App miAplicacion = new App();
        miAplicacion.ejecutar();
        // miAplicacion.imagenes();
        // miAplicacion.triangulos();
    }

    public void ejecutar () {
        CrearFigurasAleatorias(5);
        MostrarSuperficies();
    }

    private void MostrarSuperficies() {
        for (Circulo f : circulos) {
            // f -> tipo estatico FiguraGeometrica -> verifica el compilador
            System.out.println(f.getSuperficie());
            // dado el polimorfismo en la herencia
            // en ejecucion -> f -> tipo dinamico -> verifica la JVM
        }
        for (Triangulo f : triangulos) {
            // f -> tipo estatico FiguraGeometrica -> verifica el compilador
            System.out.println(f.getSuperficie());
            // dado el polimorfismo en la herencia
            // en ejecucion -> f -> tipo dinamico -> verifica la JVM
        }
    }

    /**
     * Genera los objetos graficos en forma aleatoria y los agrega a la coleccion
     * correspondiente
     * 
     * @param cantidad Cantidad de figuras a crear
     */
    public void CrearFigurasAleatorias (int cantidad) {
        // TODO - Implementar creacion de rectangulos y getSuperficie
        for (int c = 0; c < cantidad; c++) {
            Circulo circulo = new Circulo (aleatorio.nextInt(91) + 10,
                                           aleatorio.nextInt( getAncho() ),
                                           aleatorio.nextInt( getAlto() ) );
            circulo.getPos().setDespX( aleatorio.nextInt( 31 ) - 15 );
            circulo.getPos().setDespY( aleatorio.nextInt( 31 ) - 15 );
            // Lo agrego en la coleccion
            // circulos.add(circulo);
            circulos.add(circulo);
            Triangulo triangulo = new Triangulo (aleatorio.nextInt(91) + 10,
                                        aleatorio.nextInt(91) + 10,
                                        aleatorio.nextInt( getAncho() ),
                                        aleatorio.nextInt( getAlto() ) );
            triangulo.getPos().setDespX( aleatorio.nextInt( 31 ) - 15 );
            triangulo.getPos().setDespY( aleatorio.nextInt( 31 ) - 15 );
            triangulos.add(triangulo);
            // TODO - Repetir lo mismo para Rectangulo
        }
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

}
