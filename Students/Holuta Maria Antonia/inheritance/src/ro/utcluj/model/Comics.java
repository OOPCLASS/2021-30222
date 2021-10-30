package ro.utcluj.model;

import ro.utcluj.model.Product;

import java.util.Objects;

public class Comics extends Product {

    private String artist;
    private int volume;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    @Override
    public int getLinkNumber() {
        return volume;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Comics comics = (Comics) o;
        return artist == comics.artist && Objects.equals(volume, comics.volume);
    }

}
