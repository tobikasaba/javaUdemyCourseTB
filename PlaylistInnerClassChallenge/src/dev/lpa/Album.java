package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {

    private String name, artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<>();
    }

    public boolean addSong(String title, double duration) {
        Song newSong = new Song(title, duration);
        if (findSong(title) == null) {
            songs.add(newSong);
            System.out.println("song added" + songs);
            return true;
        }
        return false;
    }

    private Song findSong(String title) {
        for (Song songTitle : songs) {
            if (songTitle.getTitle().equals(title)) {
                return songTitle;
            }
        }
        return null;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playList) {
        var song = findSong(title);
        if (song != null) {
            playList.add((song));
            System.out.println("title playlist " + playList);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(int track, LinkedList<Song> playList) {
        for (int i = 0; i < songs.size(); i++) {
            if (track > 0 && i == track - 1) {
                playList.add(songs.get(i));
                System.out.println("track playlist " + playList);
                return true;
            }
        }
        return false;
    }

    public class SongList {

        private List<Song> songs = new ArrayList<>();

        public SongList() {
            songs = new ArrayList<>();
        }

        private boolean findSong (String songTitle){
            for (var song : songs){
                if(song.getTitle().equals(songTitle)){
                    return false;
                }else {
                    songs.add(newSong);
                    return true;
                }
            }
            return false;
        }


    }
}