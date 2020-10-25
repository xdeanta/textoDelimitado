package textoDelimitado;

/**
 * @author Xavier
 */

public class Product {
    private String codigo;
    private String descripcion;
    private double precio;

    public Product(String codigo, String descripcion, double precio) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    public Product() {
        this(null,null,0);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    @Override
    public String toString(){
        return "Codigo: " + codigo + "\nDescripcion: " + descripcion + "\nPrecio: " + precio;
    }
}
