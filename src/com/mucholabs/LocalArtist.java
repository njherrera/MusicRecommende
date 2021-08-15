package com.mucholabs;


import java.util.List;

public class LocalArtist implements Comparable<LocalArtist>{

    private String name;
    private List<LocalArtist> similarLocalArtists;
    private int similarityScore;

    public LocalArtist(String artistName, int simScore){
         this.name = artistName;
         this.similarityScore = simScore;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSimilarityScore(int score){
        this.similarityScore = score;
    }

    public int getSimilarityScore(){
        return similarityScore;
    }

    public List<LocalArtist> getSimilarLocalArtists() {
        return similarLocalArtists;
    }

    public void setSimilarLocalArtists(List<LocalArtist> similarLocalArtists) {
        this.similarLocalArtists = similarLocalArtists;
    }

    @Override
    public java.lang.String toString() {
        return  "Artist name: " + name +
                ", Similarity score: " + similarityScore;
    }

    @Override
    public int compareTo(LocalArtist comparingTo){
        int compareScore = ((LocalArtist)comparingTo).getSimilarityScore();
        return compareScore - this.similarityScore;
    }

}
