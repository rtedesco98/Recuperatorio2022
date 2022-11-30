package main.java.recuperatorio;

import java.time.LocalDate;

public class Post {
    private String contenido;
    
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
}
