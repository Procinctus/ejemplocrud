
package ejemplocrud;


public class Cliente {
    private int id_cliente;
    private String nombre;
    private String direccion;
    private String telefono;
    private int id_auto;

    public Cliente(String nombre, String direccion, String telefono, int id_auto) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.id_auto = id_auto;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getId_auto() {
        return id_auto;
    }

    public void setId_auto(int id_auto) {
        this.id_auto = id_auto;
    }

    

    

   
    
    
}
