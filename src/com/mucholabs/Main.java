package com.mucholabs;

import de.umass.lastfm.Artist;
import de.umass.lastfm.Caller;

import java.util.ArrayList;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Caller.getInstance().setUserAgent("tst");
	    Recommender test = new Recommender();
	    String[] testArray = test.makeListeningHistory();
        Map<String, Integer> listeningHistoryMap = test.makeSimilarArtistsHashMap(testArray);
        ArrayList<LocalArtist> mapInListForm = test.convertMaptoList(listeningHistoryMap);
        test.printSortedList(mapInListForm);
        }
}
