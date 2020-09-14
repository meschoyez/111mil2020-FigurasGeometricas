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
    // private ArrayList<Circulo> circulos;
    // private ArrayList<Rectangulo> rectangulos;
    // private ArrayList<FiguraGeometrica> figuras;
    private int ancho = 800;
    private int alto = 600;

    /**
     * Constructor sin parametros
     */
    public App () {
        aleatorio = new Random();
        // circulos = new ArrayList<>();
        // rectangulos = new ArrayList<>();
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
        // miAplicacion.ejecutar();
        // miAplicacion.imagenes();
        // miAplicacion.triangulos();
    }

}
