import java.io.Serializable;

public class Quote implements Serializable {
    private long id;
    private String content;
    private Author author;

    public Quote(){

    }

    public Quote(long id, String content, Author author){
        this.id = id;
        this.content = content;
        this.author = author;
    }

    public Quote(String content, Author author){
        this.content = content;
        this.author = author;
    }

    public long getId(int i) {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }
}