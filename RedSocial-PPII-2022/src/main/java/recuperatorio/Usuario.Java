package main.java.recuperatorio;

import java.util.ArrayList;
import java.time.LocalDate;
import java.util.*;

import java.util.function.Predicate;


public class Usuario implements InterfaceAcciones{
    private String nombre;
    private String apellido;
    private int seguidores;
    private int seguidos;
    private String nickname;
    ArrayList <Seguido> seguidosList = new ArrayList<Seguido>();
    private Post post;
    private Post postAcual;


    public Usuario (String nombre, String apellido, String nickname, int seguidores, int seguidos){
        this.setNombre(nombre);
        this.setApellido(apellido);
        this.setNickname(nickname);
        this.setSeguidores(seguidores);
        this.setSeguidos(seguidos);
        }

    public Usuario(Object nombre2, Object apellido2, int i, int seguidores2, int seguidos2) {
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
    

    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }


    public void SeguirUsuario(Usuario seguido){
     this.seguidosList.add(new Seguido(seguido.getNickname()));
     this.agregarSeguido();
     
    }

    private void agregarSeguido() {
        this.setSeguidos(this.getSeguidos());
    }

    public void setPostActual(Post post) {
        this.postAcual = post;
    }

    public Post getPostAcual() {
        return postAcual;
    }

    public void crearPost(String contenido, LocalDate fecha ) {
        post = new Post(contenido, fecha);
        this.setPostActual(post);
    }

    public void agregarLikeAPosteo(Seguido seguido){
        post.agregarLikeAPosteo.add(seguido);
    }
    
    public void quitarLikeAPosteo(){
        post.quitarLikeAPosteo.remove();
    }

}
