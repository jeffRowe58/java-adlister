import java.io.Serializable;

public class Album implements Serializable {
    private long id;
    private String artistName;
    private String albumName;
    private int releaseDate;
    private double salesNumber;
    private String genre;

    public Album(){

    }

    public Album(long id, String artist_name, String album_name, int release_date, double sales_number
    , String genre){
        this.id = id;
        this.artistName = artist_name;
        this.albumName = album_name;
        this.releaseDate = release_date;
        this.salesNumber = sales_number;
        this.genre = genre;
    }

    public Album(String artist_name, String album_name, int release_date, double sales_number
            , String genre){
        this.artistName = artist_name;
        this.albumName = album_name;
        this.releaseDate = release_date;
        this.salesNumber = sales_number;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist_name() {
        return artistName;
    }

    public void setArtist_name(String artist_name) {
        this.artistName = artist_name;
    }

    public String getAlbum_name() {
        return albumName;
    }

    public void setAlbum_name(String album_name) {
        this.albumName = album_name;
    }

    public int getRelease_date() {
        return releaseDate;
    }

    public void setRelease_date(int release_date) {
        this.releaseDate = release_date;
    }

    public double getSales_number() {
        return salesNumber;
    }

    public void setSales_number(double sales_number) {
        this.salesNumber = sales_number;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
