package com.example.salah.exo1_vues_intents;

import java.io.Serializable;import java.lang.String;

/**
 * Created by Salah on 29/02/2016.
 */
public class Book implements Serializable{
    private  String title;
    private String author;
    private String editeur;
    private String année;
    private  int cover;
    private int bigCover;

    public void setBigCover(int bigCover) {
        this.bigCover = bigCover;
    }

    public int getBigCover() {

        return bigCover;
    }

    public void setCover(int cover) {
        this.cover = cover;
    }

    public int getCover() {

        return cover;
    }

    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }

    public void setAnnée(String année) {
        this.année = année;
    }

    public void setRsume(String rsume) {
        this.rsume = rsume;
    }

    public String getRsume() {

        return rsume;
    }

    public String getEditeur() {
        return editeur;
    }

    public String getAnnée() {
        return année;
    }

    private String rsume;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}
