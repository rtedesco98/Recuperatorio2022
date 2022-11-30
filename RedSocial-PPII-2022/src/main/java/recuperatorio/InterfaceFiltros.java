package main.java.recuperatorio;


import java.util.function.Predicate;


public class InterfaceFiltros {

    public Etiqueta buscar(Predicate<Post> filtro);
    
    public Predicate<Post> crearFiltroEtiqueta(Etiqueta etiqueta);
}
