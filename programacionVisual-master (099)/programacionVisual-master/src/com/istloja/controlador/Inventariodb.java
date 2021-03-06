/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;
import com.istloja.modelo.Inventario;
import com.istloja.conexionbd.Conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author johnp
 */
public class Inventariodb {
     // Registrar persona en la base de datos.
    public boolean registrarProducto(Inventario inventario) {
        boolean registrar = false;
        //Interfaz de acceso a la base de datos
        Statement stm = null;
        //Conexion con la base de datos.
        Connection con = null;
        //INSERT INTO `ejercicio`.`persona` (`idpersona`, `cedula`, `nombres`, `apellidos`, `direccion`, `correo`, `telefono`) VALUES ('1', '1104268899', 'John', 'Solano', 'Loja', 'jpsolanoc@gmail.com', '072587392');
        String sql = "INSERT INTO `bdejerciciov09`.`inventario` (`cod_producto`, `descripcion`, `precio_compra_sin_iva`, `precio_compra_con_iva`,`precio_mayorista` ,`precio_cliente_fijo`,`precio_cliente_normal`, `can_producto`) VALUES ('"+inventario.getCodProducto()+"', '"+inventario.getDescripcion()+"', '"+inventario.getPreciocomprasiniva()+"','"+inventario.getPreciocompraconiva()+"','"+inventario.getPreciomayorista()+"', '"+inventario.getPrecioclientefijo()+"','"+inventario.getPrecioclientenormal()+"', '"+inventario.getCanProductos()+"');";
        try {
            //Es una instancia de la conexion previamente creada.
            Conexion conexion = new Conexion();
            con = conexion.conectarBaseDatos();
            stm = con.createStatement();
            stm.execute(sql);
            registrar = true;
            stm.close();
            con.close();
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return registrar;
    }
    //ACtualizar la persona e la base de datos.
    public boolean actualizarInventario(Inventario inventario) {
        System.out.println("Actualizar:" + inventario);
        // Conexion con la base de datos.
        Connection connect = null;
        //Interfaz de acceso a la base de datos.
        Statement stm = null;
        // retorno del metodo cuando se realice la actualizacion
        boolean actualizar = false;
        //Contatenando la opcion de actualizacion
        String sql = "UPDATE `bdejerciciov09`.`inventario` SET `cod_producto` = '"+inventario.getCodProducto()+"', `descripcion` = '"+inventario.getDescripcion()+"', `precio_compra_sin_iva` = '"+inventario.getPreciocomprasiniva()+"', `precio_compra_con_iva` = '"+inventario.getPreciocompraconiva()+"', `precio_mayorista` = '"+inventario.getPreciomayorista()+ "' , `precio_cliente_fijo` = '"+inventario.getPrecioclientefijo()+  "', `precio_cliente_normal` = '"+inventario.getPrecioclientenormal()+ "', `can_producto` = '"+inventario.getCanProductos()+"' WHERE (`idinventario` = '"+inventario.getIdInventario()+"');";
        try {
            Conexion con = new Conexion();
            connect = con.conectarBaseDatos();
            //Puente entre la conexion y el codigo
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return actualizar;
    }
    //Eliminar una persona en base al ID de la persona seleccionada de la base de datos.
    public boolean eliminarInventario(Inventario inventario) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM `bdejerciciov09`.`inventario` WHERE (`idinventario` = '"+inventario.getIdInventario()+"');";
        try {
            connect = new Conexion().conectarBaseDatos();
            stm = connect.createStatement();
            stm.execute(sql);
            eliminar = true;
        } catch (SQLException e) {
            System.out.println("Error: " + e.getMessage());
        }
        return eliminar;
    }
    
//     //Sirve para traer todos los registros de persona de la base de datos 
    public List<Inventario> obtenerProductosInventarioCodigo(String codigo) {
        System.out.println("BusquedaCodigo"+ codigo);
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejerciciov09.inventario where cod_producto = '"+codigo+"';";
        List<Inventario> listaInventario = new ArrayList<Inventario>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                   c.setPreciocomprasiniva(rs.getString(4));
               
               
                c.setPreciocompraconiva(rs.getString(5));
                c.setPreciomayorista(rs.getString(6));
                c.setPrecioclientefijo(rs.getString(7));
                c.setPrecioclientenormal(rs.getString(8));
                
                
                c.setCanProductos(rs.getString(9));

                
                c.setCanProductos(rs.getString(9));
                
                listaInventario.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaInventario;
    }
    
      public List<Inventario> obtenerProductosInventarioDescripcion(String descripcion) {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejerciciov09.inventario where descripcion like \"%"+descripcion+"%\"";
        List<Inventario> listaInventario = new ArrayList<Inventario>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                c.setPreciocomprasiniva(rs.getString(4));
               
               
                c.setPreciocompraconiva(rs.getString(5));
                c.setPreciomayorista(rs.getString(6));
                c.setPrecioclientefijo(rs.getString(7));
                c.setPrecioclientenormal(rs.getString(8));
                
                
                c.setCanProductos(rs.getString(9));
                
                listaInventario.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaInventario;
    }
    
      public List<Inventario> obtenerProductosInventario() {
        Connection co = null;
        Statement stm = null;
        //Sentencia de JDBC para obtener valores de la base de datos.
        ResultSet rs = null;
        String sql = "SELECT * FROM bdejerciciov09.inventario;";
        List<Inventario> listaProveedores = new ArrayList<Inventario>();
        try {
            co = new Conexion().conectarBaseDatos();
            stm = co.createStatement();
            rs = stm.executeQuery(sql);
            while (rs.next()) {
                Inventario c = new Inventario();
                c.setIdInventario(rs.getInt(1));
                c.setCodProducto(rs.getString(2));
                c.setDescripcion(rs.getString(3));
                  c.setPreciocomprasiniva(rs.getString(4));
               
               
                c.setPreciocompraconiva(rs.getString(5));
                c.setPreciomayorista(rs.getString(6));
                c.setPrecioclientefijo(rs.getString(7));
                c.setPrecioclientenormal(rs.getString(8));
                
                
                c.setCanProductos(rs.getString(9));

                
                listaProveedores.add(c);
            }
            stm.close();
            rs.close();
            co.close();
        } catch (SQLException e) {
            System.out.println("Error:"+ e.getMessage());
        }

        return listaProveedores;
    }
            
           
    
}
