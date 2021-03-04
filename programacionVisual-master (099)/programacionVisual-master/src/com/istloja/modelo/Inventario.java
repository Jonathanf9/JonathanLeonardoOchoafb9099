/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.istloja.modelo;

/**
 *
 * @author johnp
 */
public class Inventario {

    private int idInventario;
    private String codProducto;
    private String descripcion;
    private String preciocomprasiniva;
    private String preciocompraconiva;
    private String preciomayorista;
    private String precioclientefijo;
    private String precioclientenormal;
    private String canProductos;

    public Inventario(int idInventario, String codProducto, String descripcion, String preciocomprasiniva, String preciocompraconiva, String preciomayorista, String precioclientefijo, String precioclientenormal, String canProductos) {
        this.idInventario = idInventario;
        this.codProducto = codProducto;
        this.descripcion = descripcion;
        this.preciocomprasiniva = preciocomprasiniva;
        this.preciocompraconiva = preciocompraconiva;
        this.preciomayorista = preciomayorista;
        this.precioclientefijo = precioclientefijo;
        this.precioclientenormal = precioclientenormal;
        this.canProductos = canProductos;
    }

    public Inventario() {
    }

    public int getIdInventario() {
        return idInventario;
    }

    public void setIdInventario(int idInventario) {
        this.idInventario = idInventario;
    }

    public String getCodProducto() {
        return codProducto;
    }

    public void setCodProducto(String codProducto) {
        this.codProducto = codProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getPreciocomprasiniva() {
        return preciocomprasiniva;
    }

    public void setPreciocomprasiniva(String preciocomprasiniva) {
        this.preciocomprasiniva = preciocomprasiniva;
    }

    public String getPreciocompraconiva() {
        return preciocompraconiva;
    }

    public void setPreciocompraconiva(String preciocompraconiva) {
        this.preciocompraconiva = preciocompraconiva;
    }

    public String getPreciomayorista() {
        return preciomayorista;
    }

    public void setPreciomayorista(String preciomayorista) {
        this.preciomayorista = preciomayorista;
    }

    public String getPrecioclientefijo() {
        return precioclientefijo;
    }

    public void setPrecioclientefijo(String precioclientefijo) {
        this.precioclientefijo = precioclientefijo;
    }

    public String getPrecioclientenormal() {
        return precioclientenormal;
    }

    public void setPrecioclientenormal(String precioclientenormal) {
        this.precioclientenormal = precioclientenormal;
    }

    public String getCanProductos() {
        return canProductos;
    }

    public void setCanProductos(String canProductos) {
        this.canProductos = canProductos;
    }

    @Override
    public String toString() {
        return "Inventario{" + "idInventario=" + idInventario + ", codProducto=" + codProducto + ", descripcion=" + descripcion + ", preciocomprasiniva=" + preciocomprasiniva + ", preciocompraconiva=" + preciocompraconiva + ", preciomayorista=" + preciomayorista + ", precioclientefijo=" + precioclientefijo + ", precioclientenormal=" + precioclientenormal + ", canProductos=" + canProductos + '}';
    }

}
