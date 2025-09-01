package org.design.patterns.iterator;

import java.util.ArrayList;
import java.util.List;

public class Playlist implements Iterable<Song> {
    private final List<Song> songs = new ArrayList<>();

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(Song song) {
        songs.remove(song);
    }

    public List<Song> getSongs() {
        return songs;
    }

    public Iterator<Song> backwardIterator() {
        return new BackwardIterator<>(songs);
    }

    /**
     * @return
     */
    @Override
    public Iterator<Song> iterator() {
        return new ForwardIterator<>(songs);
    }
}
