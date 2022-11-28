package main.java.recuperatorio;

public class Etiqueta {
    private String nickname;

    public Etiqueta (String nickname){

        this.nickname = nickname;

    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
    

    public String soString(){
        return "Etiqueta: " + this.nickname;
    }
}
