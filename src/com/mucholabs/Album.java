package com.mucholabs;

public class Album {

    private String title;
    private String artist;

    public void setTitle(String name){
        this.title = name;
    }

    public void setArtist(String name){
        this.artist = name;
    }

    public String getTitle(){
        return this.title;
    }

    public String getArtist(){
        return this.artist;
    }

    public String toString(){
        String str = "Album artist: " + getArtist() + " Album title: " + getTitle();
        return str;
    }
}
