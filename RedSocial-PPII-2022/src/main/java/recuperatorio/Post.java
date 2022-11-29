package main.java.recuperatorio;

public class Post {
    private String descripcion;

    public String descripcion() {
 
     return descripcion;
    }

    public void setdescripcion(String descripcion) {
 
     this.descripcion = descripcion;
    }


    public void quitarMeGusta(Megusta megusta){
        
    this.megusta.remove(megusta);
 
    }
 
    public void meGusta(){
 
    this.meGusta = meGusta();
 
    }
 
    public void agregarEtiqueta(){
 
    this.agregarEtiqueta() = agregarEtiqueta();
 
    }

    public void comentarPublicacion(){
     
    this.comentarPublicacion();  comentarPublicacion();
 
    }
}
