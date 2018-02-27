package sample5;

public class News {
    private int id;
    private final String author;
    private final String newsText;

    public int getId() {
        return id;
    }

    public News(int id, String author, String newsText) {
        this.id = id;
        this.author = author;
        this.newsText = newsText;
    }

    public String getNewsText() {
        return newsText;
    }

    public String getAuthor() {
        return author;
    }
}
