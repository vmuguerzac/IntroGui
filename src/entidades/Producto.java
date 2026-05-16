package entidades;
public class Producto {
    private String nombre;
    private String codigo;
    private String categoria;

    public Producto(){}
    
    public Producto(String _nombre, String _codigo, String _categoria){
        setNombre(_nombre);
        setCodigo(_codigo);
        setCategoria(_categoria);
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getCodigo() {
        return codigo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
}
