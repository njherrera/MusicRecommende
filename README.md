# MusicRecommender
New home for my music recommender project - now with Git!

The project uses Last.fm's API to generate music recommendations based on an input list of favorite artists. Specifically, the program generates and updates a HashMap with each artist that appears in Last.fm's list of similar artists for each input artist, as well as how often they have appeared. After the program finds similar artists for each artist in the input list, it then recommends the artists who appeared the most times. 

This program was successful at recommending people musical artists that they would enjoy, as very often when I ran it on lists of artists supplied by friends and family they were already fans of the artists that were recommended. This is one possible area for future development, as Last.fm also keeps track of how popular an artist is; if I limit recommendations to artists under a certain popularity threshold, it would be more successful at making recommendations users have never heard before.
