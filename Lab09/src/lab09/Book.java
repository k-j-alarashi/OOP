package lab09;

public class Book {

    private int id;
    private String title;

    // Aggregation
    private Author a;

    public Book(int id, String title, Author a) {
        this.id = id;
        this.title = title;
        this.a = a;
    }
    
    // composition
    public Book(int id, String title, String name , int age , String address) {
        this.id = id;
        this.title = title;
        a = new Author(name, age, address);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getA() {
        return a;
    }

    public void setA(Author a) {
        this.a = a;
    }
}
