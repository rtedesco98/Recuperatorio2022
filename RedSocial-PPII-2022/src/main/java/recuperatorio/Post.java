package main.java.recuperatorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.function.Predicate;

import javax.naming.LinkException;


public class Post implements InterfaceAcciones{
    private String contenido;

    private ArrayList<RegistroLikes> likes = new ArrayList<RegistroLikes>();
    private ArrayList<RegistroLikes> likesAPosteo = new ArrayList<RegistroLikes>();
    
    public Post(String contenido, LocalDate fecha) {
    }

    public String contenido() {
     return contenido;
    }

    public String getContenido() {
        return contenido;
    }


    public void setContenido(String contenido) {
 
     this.contenido = contenido;
    }

    public Object getFecha() {
        return null;
    }

    public void agregarLikeAPosteo(Post post){

        this.likesAPosteo.add(post);
    }
}
