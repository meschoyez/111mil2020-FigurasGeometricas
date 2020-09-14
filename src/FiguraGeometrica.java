import java.awt.Color;

public class FiguraGeometrica {
    private Color color ;
    private Posicion pos;

    public FiguraGeometrica () {
        pos = new Posicion(0, 0);
    }
    
    public FiguraGeometrica (int x, int y) {
        pos = new Posicion(x, y);
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

        /**
     * Actualizar posicion del objeto
     */
    public void actualizarPosicion () {
        getPos().nuevaPosicion();
    }

    public Posicion getPos() {
        return pos;
    }

    public void setPos(Posicion pos) {
        this.pos = pos;
    }

}
