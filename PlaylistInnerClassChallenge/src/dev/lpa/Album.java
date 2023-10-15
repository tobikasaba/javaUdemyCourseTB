package dev.lpa;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {

    private String name, artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }

    public boolean addSong(String title, double duration) {
        Song newSong = new Song(title, duration);
        if (songs.findSong(newSong.getTitle()) == null) {
            songs.add(newSong);
            return true;
        }
        return false;
//        return this.songs.add(new Song(title, duration));
    }

    public boolean addToPlayList(int track, LinkedList<Song> playlist) {
        Song checkSong = songs.findSong(track);
        if (checkSong != null) {
            playlist.add(checkSong);
            return true;
        }
/*
in this code block, songs.size() and songs.get() throw an error. This is because songs is a field of type SongList which doesn't have these methods in it
        for (int i = 0; i < songs.size(); i++) {
            if (track > 0 && i == track - 1) {
                playlist.add(songs.get(i));
                System.out.println("track playlist " + playlist);
                return true;
            }
        }
 */
        return false;
    }

    public boolean addToPlayList(String title, LinkedList<Song> playlist) {
        Song checkSong = songs.findSong(title);
        if (checkSong != null) {
            playlist.add(checkSong);
            return true;
        }
/*
in this code block, songs.size() and songs.get() throw an error. This is because songs is a field of type SongList which doesn't have these methods in it
        var song = songs.findSong(title);
        if (song != null) {
            playlist.add((song));
            System.out.println("title playlist " + playlist);
            return true;
        }
 */
        return false;
    }

    public static class SongList {

        private ArrayList<Song> songs;

        private SongList() {
            songs = new ArrayList<>();
        }

        private boolean add(Song songName) {
            for (var song : songs) {
                if (song.getTitle().equals(songName.getTitle())) {
                    System.out.println("song present " + songName);
                    return false;
                }
            }
            songs.add(songName);
            System.out.println("song added " + songName);
            return true;

        }

        private Song findSong(String title) {
            for (var songTitle : songs) {
                if (songTitle.getTitle().equals(title)) {
                    return songTitle;
                }
            }
            return null;
        }

        private Song findSong(int track) {
            for (var i = 0; i < songs.size(); i++) {
                if (track > 0 && i == track - 1) {
                    return songs.get(i);
                }
            }
            return null;
        }
    }
}