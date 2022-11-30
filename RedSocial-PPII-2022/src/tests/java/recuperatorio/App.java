package tests.java.recuperatorio;
import main.java.recuperatorio.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.util.function.Predicate;

import org.junit.*;


public class App {


   /**
    * 
    */
   @Test
    public void debeSeguirUsuario(){
      
    Usuario miUsuario = new Usuario (null, null, 0, 0, 0);
    miUsuario.SeguirUsuario(miUsuario);
    assertTrue(miUsuario.getSeguidos() == 1);
   }

   @Test
   public void debeCrearUnPost(){

   }

   @Test
   public void debeColorarUnaEtiqueta(){
   
   }

   @Test
   public void debeDarLikeAUnPost(){

   }

   @Test
   public void debeQuitarLikeAUnPost(){

   }

   @Test
   public void debeComentarUnPost(){

   }

   @Test
   public void debeEliminarComentarioDeUnPost(){

   }

   @Test
   public void debeUsarioCrearSuPerfil(){

   }

   @Test
   public void debeCargarUnaImagen(){

   }

   @Test
   public void debeCargarVideo(){

   }

   @Test
   public void debeEliminarImagen(){

   }

   @Test
   public void debeEliminarVideo(){

   }

   @Test
   public void debeBuscarImagenPorTitulo(){

   }

   @Test
   public void debeBuscarVideoPorTitulo(){

   }

}
