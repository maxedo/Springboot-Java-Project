package com.example.Proiect_Tehnologii_Web_Java.Market.POJO;


public class ComentariiDTO {
    private long id;
    private String text;
    private long stele;
    private long likes;



    public ComentariiDTO() {
    }

    public ComentariiDTO(long id, String text, long stele, long likes) {
        this.id = id;
        this.text = text;
        this.stele = stele;
        this.likes = likes;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getStele() {
        return stele;
    }

    public void setStele(long stele) {
        this.stele = stele;
    }

    public long getLikes() {
        return likes;
    }

    public void setLikes(long likes) {
        this.likes = likes;
    }
}