package main.java.recuperatorio;

public class Seguido {
    private String nickname;

    public Seguido(String nickname){
        this.setNickname(nickname);
    }


    public Seguido(int nickname2) {
    }


    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }
}
