import java.awt.Color;

public class Rectangulo extends FiguraGeometrica {
    private int lado1;
    private int lado2;
    
    // Falta definir los constructures

    /**
     * Este metodo establece el color del Rectangulo segun
     * la superficie configurada.
     * 
     * Si superficie <   500 -> tiene color azul (Color.BLUE)
     * Si superficie <  1000 -> tiene color verde (Color.GREEN)
     * Si superficie <  1500 -> tiene color amarillo (Color.YELLOW)
     * Si superficie <  2000 -> tiene color naranja (Color.ORANGE)
     * Si superficie <  2500 -> tiene color rojo (Color.RED)
     * Si superficie >= 2500 -> tiene color magenta (Color.MAGENTA)
     */
    private void determinarColor () {
        // TODO implementar
    }

    public double getPerimetro () {
        return 0.0;
    }

    public double getSuperficie () {
        return 0.0;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    // Click derecho sobre el codigo fuente
    // click en "Source action"
    // click en "Generate Getter and Setters"
}