package tests.java.recuperatorio;
import main.java.recuperatorio.*;

import static org.junit.Assert.assertTrue;

import org.junit.*;


public class App {


   @Test
    public void debeSeguirUsuario(){
    Usuario usuario = new Usuario (null, null, 0, 0, 0);
    usuario.SeguirUsuario(usuario);
    assertTrue(usuario.getSeguidos() == 1);
   }

   @Test
   public void debeColorarUnaEtiqueta(){


    
   }

}
