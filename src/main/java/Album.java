import java.io.Serializable;

public class Album implements Serializable {
    private long id;
    private String artist_name;
    private String album_name;
    private int release_date;
    private double sales_number;
    private String genre;

    public Album(){

    }

    public Album(long id, String artist_name, String album_name, int release_date, double sales_number
    , String genre){
        this.id = id;
        this.artist_name = artist_name;
        this.album_name = album_name;
        this.release_date = release_date;
        this.sales_number = sales_number;
        this.genre = genre;
    }

    public Album(String artist_name, String album_name, int release_date, double sales_number
            , String genre){
        this.artist_name = artist_name;
        this.album_name = album_name;
        this.release_date = release_date;
        this.sales_number = sales_number;
        this.genre = genre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getArtist_name() {
        return artist_name;
    }

    public void setArtist_name(String artist_name) {
        this.artist_name = artist_name;
    }

    public String getAlbum_name() {
        return album_name;
    }

    public void setAlbum_name(String album_name) {
        this.album_name = album_name;
    }

    public int getRelease_date() {
        return release_date;
    }

    public void setRelease_date(int release_date) {
        this.release_date = release_date;
    }

    public double getSales_number() {
        return sales_number;
    }

    public void setSales_number(double sales_number) {
        this.sales_number = sales_number;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
