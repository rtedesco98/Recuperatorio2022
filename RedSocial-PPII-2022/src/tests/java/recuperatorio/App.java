package tests.java.recuperatorio;
import main.java.recuperatorio.*;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;
import java.util.function.Predicate;
import java.time.LocalDate;

import org.junit.*;


public class App {


   private static final Usuario Usuario = null;

   /**
    * 
    */
   @Test
    public void debeSeguirUsuario(){

    Usuario usuario = new Usuario (null, null, null, 0, 0);

    usuario.SeguirUsuario(Usuario);

    assertTrue(usuario.getSeguidos() == 1);
   }

   @Test
   public void debeCrearUnPost(){

      LocalDate fecha = LocalDate.now();

      Usuario usuario = new Usuario(null, null, null, 0, 0);

      usuario.crearPost("De paseo por las costas correntinas", fecha);

      assertEquals("De paseo por las costas correntinas", usuario.getPostAcual().getContenido());
      assertEquals(fecha, usuario.getPostAcual().getFecha());
   }


   @Test
   public void debeColorarUnaEtiqueta(){
      
      Etiqueta etiqueta1 = new Etiqueta(null);

      Recurso r1 = new Recurso(null);
      r1.addEtiqueta(etiqueta1);

      assertEquals(etiqueta1, ((Recurso) r1.getEtiquetas).getTipoRecurso().toString());

   }

   @Test
   public void debeDarLikeAUnPost(){
      RegistroLikes likesPost = new RegistroLikes();

      Usuario usuario = new Usuario(null, null, null, 0, 0);

      likesPost.registrarLikeUsuario(usuario);
      usuario.darLike(usuario.getPostAcual(), likesPost);

      assertEquals(likesPost, usuario);

   }

   @Test
   public void debeQuitarLikeAUnPost(){

      RegistroLikes likesPost = new RegistroLikes();

      Usuario usuario = new Usuario(null, null, null, 0, 0);

      likesPost.registrarLikeUsuario(usuario);
      usuario.quitarLike(usuario.getPostAcual(), likesPost);

      assertEquals(likesPost, usuario);


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

   @Test
   public void debeFiltrarPorEtiquetas(){

   }

}
