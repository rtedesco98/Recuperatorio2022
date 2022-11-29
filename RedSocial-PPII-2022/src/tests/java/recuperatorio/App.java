package tests.java.recuperatorio;
import main.java.recuperatorio.*;

import static org.junit.Assert.assertTrue;

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
   public void debeColorarUnaEtiqueta(){
   

    
   }

}
