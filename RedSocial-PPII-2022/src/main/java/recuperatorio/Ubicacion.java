package main.java.recuperatorio;

public class Ubicacion {
    private float latitud;
    private float longitud;
    

    public float getLatitud() {
        return latitud;
    }
    public void setLatitud(float latitud) {
        this.latitud = latitud;
    }

    public float getLongitud() {
        return longitud;
    }
    public void setLongitud(float longitud) {
        this.longitud = longitud;
    }
    
    public long distancia(Ubicacion ubicacion){

        return 1;

    }
}
