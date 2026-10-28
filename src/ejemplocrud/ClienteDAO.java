/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplocrud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Ecc
 */
public class ClienteDAO {
    
    public void insertar(Empleado emp) {
        String sql = "INSERT INTO empleados (nombre, puesto, salario) VALUES (?, ?, ?)";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getPuesto());
            ps.setDouble(3, emp.getSalario());
            
            ps.executeUpdate();
            System.out.println("Empleado insertado con éxito.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // READ
    public List<Empleado> listarTodos() {
        List<Empleado> lista = new ArrayList<>();
        String sql = "SELECT * FROM empleados";
        try (Connection conn = ConexionDB.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                Empleado emp = new Empleado();
                emp.setId(rs.getInt("id"));
                emp.setNombre(rs.getString("nombre"));
                emp.setPuesto(rs.getString("puesto"));
                emp.setSalario(rs.getDouble("salario"));
                lista.add(emp);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    // UPDATE
    public void actualizar(Empleado emp) {
        String sql = "UPDATE empleados SET nombre=?, puesto=?, salario=? WHERE id=?";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, emp.getNombre());
            ps.setString(2, emp.getPuesto());
            ps.setDouble(3, emp.getSalario());
            ps.setInt(4, emp.getId());
            ps.executeUpdate();
            System.out.println("Empleado actualizado.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // DELETE
    public void eliminar(int id) {
        String sql = "DELETE FROM empleados WHERE id=?";
        try (Connection conn = ConexionDB.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ps.executeUpdate();
            System.out.println("Empleado eliminado.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
