/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelo;

/**
 *
 * @author Lenovo
 */
public class RegistrodeTipodeUsuario {
    private int idtipo_suario;
    private int tipo_usuario_sistema;
    private int id_persona_sistema;
    private String contrasenia;

    public int getIdtipo_suario() {
        return idtipo_suario;
    }

    public void setIdtipo_suario(int idtipo_suario) {
        this.idtipo_suario = idtipo_suario;
    }

    public int getTipo_usuario_sistema() {
        return tipo_usuario_sistema;
    }

    public void setTipo_usuario_sistema(int tipo_usuario_sistema) {
        this.tipo_usuario_sistema = tipo_usuario_sistema;
    }

    public int getId_persona_sistema() {
        return id_persona_sistema;
    }

    public void setId_persona_sistema(int id_persona_sistema) {
        this.id_persona_sistema = id_persona_sistema;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }
    
}
