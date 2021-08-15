package com.mucholabs;

import de.umass.lastfm.Artist;

import java.lang.reflect.Array;
import java.util.*;

public class Recommender {

    public String[] makeListeningHistory(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Input names of artists, separated by #");
        String listeningHistory = sc.nextLine();
        String[] historyArray = listeningHistory.split("#");
        return historyArray;
    }

    public String[] makeHistoryFromTextField(String str){
        String[] historyArray = str.split("|");
        return historyArray;
    }

    public Map<String, Integer> makeSimilarArtistsHashMap(String[] listeningHistory){
        List<String> historyAsArrayList = Arrays.asList(listeningHistory);
        Map<String, Integer> artistOccurrences = new HashMap<String, Integer>();
        for (String str : listeningHistory) {
            Artist newArtist = Artist.getInfo(str, "7f4af55362bcc0f898bf3aa9ae03f138");
            Collection<Artist> artistsSimilarToStr = newArtist.getSimilar(str, 20,"7f4af55362bcc0f898bf3aa9ae03f138" );
            for (Artist artist : artistsSimilarToStr) {
                System.out.println(artist.getName());
                if(!historyAsArrayList.contains(artist.getName())) {
                    Integer count = artistOccurrences.get(artist.getName());
                    if (count == null) {
                        artistOccurrences.put(artist.getName(), 1);
                    } else artistOccurrences.put(artist.getName(), count + 1);
                }
            }
            System.out.println("new artist");
        }
        return artistOccurrences;
    }

    public ArrayList<LocalArtist> convertMaptoList(Map<String, Integer> artistOccurrenceMap){
        ArrayList<LocalArtist> listOfSimilarArtists = new ArrayList<LocalArtist>();
        for (Map.Entry<String, Integer> entry : artistOccurrenceMap.entrySet()) {
            LocalArtist newArtist = new LocalArtist(entry.getKey(), entry.getValue());
            listOfSimilarArtists.add(newArtist);
        }
        Collections.sort(listOfSimilarArtists);
        return listOfSimilarArtists;
    }

    public void printSortedList(ArrayList<LocalArtist> listOfArtists){
        for (LocalArtist artist : listOfArtists){
            System.out.println(artist.toString());
        }
    }

    public String makeSortedList(ArrayList<LocalArtist> listOfArtists){
        StringBuilder str = new StringBuilder();
        for (LocalArtist artist : listOfArtists){
            str.append(artist.toString());
        }
        return str.toString();
    }
/*
    public List<Album> recommendAlbums(String[] listeningHistory){

    }

 */
}
