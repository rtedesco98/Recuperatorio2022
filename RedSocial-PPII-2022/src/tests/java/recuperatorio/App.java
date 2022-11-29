package tests.java.recuperatorio;
import main.java.recuperatorio.*;


import org.junit.*;


public class App {


   @Test
    public void debeSeguirUsuario(){
    Perfil miPerfil = new Perfil ();
    Usuario usuario = new Usuario ();
    miPerfil.SeguirUsuario(Usuario);
    assertTrue(miPerfil.getSeguidos() == 1);

   }

   @Test
   public void debeColorarUnaEtiqueta(){


    
   }

}
