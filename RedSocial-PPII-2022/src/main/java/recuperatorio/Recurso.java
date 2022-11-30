package main.java.recuperatorio;

import java.util.*;

public class Recurso {

    private String tipoRecurso;

    ArrayList <Etiqueta> etiquetasArr = new ArrayList<Etiqueta>();
    ArrayList<Etiqueta> etiquetasArrAux = new ArrayList<Etiqueta>();
    
    private int contador = 0;
    public Object getEtiquetas;

    public String getTipoRecurso() {
        return tipoRecurso;
    }

    private void setTipoRecurso(String value) {
        this.tipoRecurso = value;
    }

    public ArrayList<Etiqueta> getEtiquetas() {
        etiquetasArrAux.add(null);
        etiquetasArrAux.set(0, etiquetasArr.get(contador)); 
        contador++;
        return etiquetasArrAux;
    }

    public Recurso(String tipoRecurso){
            setTipoRecurso(tipoRecurso);
    }

    public Recurso addEtiqueta(Etiqueta etiqueta) {
            etiquetasArr.add(etiqueta);
        return this;
    }
    
}
