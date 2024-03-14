package src;

import java.io.Serializable;
import java.util.Objects;
import java.util.UUID;

public class Game implements Serializable {
    private String title;
    private String id;
    private String genre;
    private String price;
    private String rating;
    private String releaseDate;
    private String totalDownloads;

    public Game(String title, String genre, String price, String rating, String releaseDate, String totalDownloads) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
        this.releaseDate = releaseDate;
        generateId();
        this.totalDownloads = totalDownloads;
    }

    public Game(String title, String genre, String price, String rating, String releaseDate) {
        this.title = title;
        this.genre = genre;
        this.price = price;
        this.rating = rating;
        generateId();
        this.releaseDate = releaseDate;
        this.totalDownloads = "0";
    }

    public String getTotalDownloads() {
        return totalDownloads;
    }

    public void setTotalDownloads(String totalDownloads) {
        this.totalDownloads = totalDownloads;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getId() {
        return id;
    }
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public String getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(String releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public String toString() {
        return "title='" + getTitle() + '\'' +
                ", id='" + getId() + '\'' +
                ", genre='" + getGenre() + '\'' +
                ", price=" + getPrice() +
                ", rating=" + getRating() +
                ", releaseDate='" + getReleaseDate() + '\'' +
                ", totalDownloads': '" + getTotalDownloads() + '\'';
    }
    private void generateId() {
        int hash = Objects.hash(title, genre);
        this.id = generateUniqueId(hash);
    }

    private String generateUniqueId(int hash) {
        return Integer.toHexString(hash);
    }
}
