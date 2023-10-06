package models;

public class Articulo{
    private String nombre;
    private float precio;
    private int cantidad;
    private String descripcion;

    public Articulo (String nombre, float precio, int cantidad, String descripcion){
        System.out.println("Se a creado articulo " + nombre);
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.descripcion = descripcion;
    }
    public String getNombre(){
        return this.nombre;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public float getPrecio(){
        return this.precio;
    }
    public void setPrecio(float precio){
        this.precio = precio;
    }
    public int getCantidad(){
        return this.cantidad;
    }
    public void setCantidad(int cantidad){
        this.cantidad = cantidad;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
    public void setDescripcion(String descripcion){
        this.descripcion = descripcion;
    }

}