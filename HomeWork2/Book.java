package HomeWork2;

public class Book{

    private final String title;
    private final String author;
    private final int pages;
    private final int year;

    public Book(String title, String author, int pages, int year) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.year = year;
    }

    public int getPages(){
        return pages;
    }

    public int getYear(){
        return year;
    }

    @Override
    public String toString() {
        return title + " (" + author + ", " + pages + " стр., " + year + " г.)";
    }
}
