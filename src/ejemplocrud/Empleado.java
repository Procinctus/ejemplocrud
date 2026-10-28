
package ejemplocrud;
public class Empleado {
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    // Constructor vacío
    public Empleado() {}
    // Constructor con campos (sin id, ya que es auto_increment)
    public Empleado(String nombre, String puesto, double salario) {
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
    }
    // Getters y Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getPuesto() { return puesto; }
    public void setPuesto(String puesto) { this.puesto = puesto; }
    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return "ID: " + id + " | " + nombre + " (" + puesto + ") - $" + salario;
    }
}

