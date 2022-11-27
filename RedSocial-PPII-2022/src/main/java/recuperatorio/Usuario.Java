package main.java.recuperatorio;

public class Usuario {
    private String nombre;

    private String apellido;

    private int seguidores;

    private int seguidos;

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getSeguidores() {
        return seguidores;
    }
    public void setSeguidores(int seguidores) {
        this.seguidores = seguidores;
    }
    
    public int getSeguidos() {
        return seguidos;
    }
    public void setSeguidos(int seguidos) {
        this.seguidos = seguidos;
    }
    
}
