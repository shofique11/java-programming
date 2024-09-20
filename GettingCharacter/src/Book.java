public class Book {
    public String name;
    public String code;
    public String author;
    public Book(String name, String code, String author)
    {
        this.name = name;
        this.code = code;
        this.author = author;
    }
    public String toString()
    {
        return ("Name: "+ this.name + " Code: "+this.code + " Author: "+ this.author);
    }
}
