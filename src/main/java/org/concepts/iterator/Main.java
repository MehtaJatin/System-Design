package org.concepts.iterator;

public class Main {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();

        playlist.addSong(new Song("Shape of You", "Ed Sheeran", 240));
        playlist.addSong(new Song("Blinding Lights", "The Weeknd", 200));
        playlist.addSong(new Song("Levitating", "Dua Lipa", 220));

        System.out.println("Forward Iteration:");
        Iterator<Song> forward = playlist.iterator();
        while (forward.hasNext()) {
            System.out.println(forward.next().getTitle());
        }

        System.out.println("\nBackward Iteration:");
        Iterator<Song> backward = playlist.backwardIterator();
        while (backward.hasNext()) {
            System.out.println(backward.next().getTitle());
        }
    }
}
