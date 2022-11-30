package main.java.recuperatorio;

import java.time.LocalDate;

public class Post {
    private String descripcion;
    
    public Post(String contenido, LocalDate fecha) {
    }

    public String descripcion() {
 
     return descripcion;
    }

    public void setdescripcion(String descripcion) {
 
     this.descripcion = descripcion;
    }
}
