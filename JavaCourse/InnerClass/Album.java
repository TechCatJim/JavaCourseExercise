package InnerClass;

import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    // write code here
    private String name;
    private String artist;
    private SongList songs;

    public Album(String albumName, String artistName) {
        this.name = albumName;
        this.artist = artistName;
        this.songs = new SongList();
    }

    public String getAlbumName() {
        return this.name;
    }

    public String getAristName() {
        return this.artist;
    }

    public boolean addSong(String songTitle, double songDuration) {
        // if (findSong(songTitle)!=null) return false;
        songs.add(new Song(songTitle, songDuration));
        return true;
    }

    public boolean addToPlayList(int trackNumSongInAlbum, LinkedList<Song> playList) {
        Song checkedSong = this.songs.findSong(trackNumSongInAlbum);
        if (checkedSong != null) {
            playList.add(checkedSong);
            return true;
        }
        return false;
    }

    public boolean addToPlayList(String songTitle, LinkedList<Song> playList) {
        Song song = this.songs.findSong(songTitle);
        if (song != null) {
            playList.add(song);
            return true;
        }
        return false;
    }

    public static class SongList {
        private ArrayList<Song> songs;

        private SongList() {
            this.songs = new ArrayList<Song>();
        }

        private boolean add(Song song) {
            String songTitle = song.getTitle();
            if (findSong(songTitle) == null) {
                this.songs.add(song);
                return true;
            }
            return false;
        }

        private Song findSong(String songTitle) {
            for (int i = 0; i < songs.size(); i++) {
                if (songTitle == songs.get(i).getTitle()) {
                    return songs.get(i);
                }
            }
            System.out.println("The song " + songTitle + " is not in this album");
            return null;
        }

        private Song findSong(int trackNumSongInAlbum) {
            if (trackNumSongInAlbum <= 0 || trackNumSongInAlbum > songs.size()) {
                System.out.println("This album does not have a track " + trackNumSongInAlbum);
                return null;
            }
            Song song = songs.get(trackNumSongInAlbum - 1);
            for (int i = 0; i < songs.size(); i++) {
                if (song == songs.get(i)) {
                    return songs.get(i);
                }
            }
            System.out.println("This album does not have a track " + trackNumSongInAlbum);
            return null;
        }
    }

}
