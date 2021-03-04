/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.controlador;
import com.istloja.modelo.RegistrodeTipodeUsuario;
import java.sql.Connection;
import java.sql.Statement;
import com.istloja.conexionbd.Conexion;
import java.sql.SQLException;

/**
 *
 * @author jonathanfb
 */

public class RegistrodeTipodeUsuariobd {

    
    public boolean registrarTipoUsuario(RegistrodeTipodeUsuario Registrodetipodeusuario) {
        boolean registrar = false;
      
        Statement stm = null;
       
        Connection con = null;
        String sql = "INSERT INTO `ejercicio`.`tipo_usuario` (`tipo_usuario_sistema`, `id_persona_sistema`, `contrasenia`) VALUES (" + "'"+Registrodetipodeusuario.getId_persona_sistema()+"', " + "'"+Registrodetipodeusuario.getId_persona_sistema()+"', " + "'"+Registrodetipodeusuario.getId_persona_sistema()+"');";
        try {
           
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

    
    public boolean actualizar(RegistrodeTipodeUsuario Registrodetipodeusuario) {
        
        Connection connect = null;
        
        Statement stm = null;
       
        boolean actualizar = false;
    
        String sql = "";
        try {
            Conexion con = new Conexion();
            connect = con.conectarBaseDatos();
           
            stm = connect.createStatement();
            stm.execute(sql);
            actualizar = true;
        } catch (SQLException e) {
            System.out.println("Error:" + e.getMessage());
        }
        return actualizar;
    }

   
    public boolean eliminar(RegistrodeTipodeUsuario Registrodetipodeusuario) {
        Connection connect = null;
        Statement stm = null;
        boolean eliminar = false;
        String sql = "DELETE FROM `ejercicio`.`tipoUsuario` WHERE (`idtipoUsuario` = '" + String.valueOf(Registrodetipodeusuario.getIdtipo_suario()) + "');";
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

 



}
