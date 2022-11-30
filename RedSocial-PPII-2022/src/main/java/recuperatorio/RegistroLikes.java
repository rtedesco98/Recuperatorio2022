package main.java.recuperatorio;
import java.util.*;


public class RegistroLikes {

    ArrayList<Usuario> usuariosLikes = new ArrayList<Usuario>();
    public RegistroLikes(){
        
}

    public void registrarLikeUsuario(Usuario usuario){
        usuariosLikes.add(usuario);
    }
}
