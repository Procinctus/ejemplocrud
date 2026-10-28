
package ejemplocrud;
import java.util.Scanner;
public class EjemploCrud {
    public static void main(String[] args) {
        EmpleadoDAO dao = new EmpleadoDAO();
        Scanner op= new Scanner(System.in);
        char r='s';
        // 1. Crear Empleado
        Empleado emp1 = new Empleado("laurita garza", "maestra", 4000.00);
        dao.insertar(emp1);
        // 2. Leer Empleados
        System.out.println("Lista de empleados:");
        String nombre=op.nextLine();
        int edad=op.nextInt();
        
        dao.listarTodos().forEach(System.out::println);
        // 3. Actualizar (asumiendo que id 1 existe)
        //emp1.setId(3); // Necesitamos establecer el ID real
        emp1.setSalario(3500.00);
        dao.actualizar(emp1);
        do{
            System.out.println("++++++++elija a una opcion++++++");
            System.out.println("");
            System.out.println("");
            System.out.println("1. Crear Registro ");
            System.out.println("2. Eliminar Registro");
            System.out.println("3. Actualizar Registro");
            System.out.println("4. Borrar Registro");
            System.out.println("5. Listar Registros");
            System.out.println(" ");
            System.out.print("elija una opcion : ");
            r=op.next().charAt(0);
            if (r=='1') {
                //Empleado emp1 = new Empleado("laurita garza", "maestra", 4000.00);
                dao.insertar(emp1);
                
            }else if (true){
            
        }
        
            
        }while(r!='s');
    }
}
