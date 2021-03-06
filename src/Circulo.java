import java.awt.Color;

// Modificador visibilidad - palabra reservada - Nombre de la clase
// Identificadores son CamelCase
public class Circulo extends FiguraGeometrica {
    // Caracteristicas - Comportamientos - Identidad

    // Caracteristicas (campos del objeto o de la clase)
    private static final int MAX_RADIO = 1000;
    // static -> campo de la clase
    // final -> hace que sea un valor constante (no modificable - inmutable)
    private int radio = 10; // Valor inicial por si me dan uno fuera de rango
    // Aclaracion -> Datos tipo objeto Integer, Double, Char, Boolean

    // Comportamientos (metodos)

    // Constructor -> crear objetos de la clase
    public Circulo (int radio) {
        // Llamado implicito al constructor de FiguraGeometrica
        setRadio(radio);
        determinarColor();
    }

    public Circulo (int radio, int x, int y) {
        // super -> se usa para invocar acciones de la superclase
        super(x, y);
        setRadio(radio);
        determinarColor();
    }

    /**
     * Este metodo establece el color del circulo segun
     * el radio configurado.
     * 
     * Si radio < 100  -> tiene color azul (Color.BLUE)
     * Si radio < 200  -> tiene color verde (Color.GREEN)
     * Si radio < 300  -> tiene color amarillo (Color.YELLOW)
     * Si radio < 400  -> tiene color naranja (Color.ORANGE)
     * Si radio < 500  -> tiene color rojo (Color.RED)
     * Si radio >= 600 -> tiene color magenta (Color.MAGENTA)
     */
    private void determinarColor () {
        if (getRadio() < 200) {
            setColor(Color.GREEN);
        }
        else if (getRadio() < 500) {
            setColor(Color.YELLOW);
        }
        else {
            setColor(Color.RED);
        }
    }

    public double getPerimetro () {
        return 3.1416 * 2 * radio;
    }
    
    public double getSuperficie () {
        return 3.1416 * radio * radio;     
    }

    // setters y getters -> son metodos de acceso a los campos
    public int getRadio() {
        return radio;
    }

    public int getDiametro() {
        return radio * 2;
    }

    public void setRadio(int radio) {
        // this = este
        // asignar radio al campo radio de este objeto
        if ((0 < radio) && (radio < MAX_RADIO)) {
            this.radio = radio;
            determinarColor();
        }
    }
    
}