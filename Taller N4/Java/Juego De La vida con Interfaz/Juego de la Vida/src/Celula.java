
public class Celula {

    Estado estado;
    int fila, colum;
    // ingreso valores entero de las fila y las columnas

    public Celula(int fila, int colum, Estado estado) {
        this.estado = estado;
        this.fila = fila;
        this.colum = colum;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
}
