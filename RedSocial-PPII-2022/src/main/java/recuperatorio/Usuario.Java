package main.java.recuperatorio;

import java.util.ArrayList;

public class Usuario {
    private String nombre;
    private String apellido;
    private int seguidores;
    private int seguidos;
    private int nickname;
    ArrayList <Seguido> seguidosList = new ArrayList<Seguido>();



    public Usuario (String nombre, String apellido, int seguidores, int seguidos, int nickname){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setSeguidores(seguidores);
        this.setSeguidos(seguidos);
        this.setNickname(nickname);
        }

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
    

    public int getNickname() {
        return nickname;
    }
    public void setNickname(int nickname) {
        this.nickname = nickname;
    }


    public void SeguirUsuario(){
     

    }
}
