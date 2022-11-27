package main.java.recuperatorio;

public class Usuario {
    private String nombre;
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    private String apellido;

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    private int seguidores;
    public int getSeguidores() {
        return seguidores;
    }
    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }
    private int seguidos;
    public int getSeguidos() {
        return seguidos;
    }
    public void setSeguidos(int seguidos) {
        this.seguidos = seguidos;
    }
    
}
