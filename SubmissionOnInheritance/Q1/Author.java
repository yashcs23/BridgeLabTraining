package Q1;

public class Author {
    private String title;
    private int year;
    private String name;
    private String bio;

    public Author(String title, int year, String name, String bio) {
        this.title = title;
        this.year = year;
        this.name = name;
        this.bio = bio;
    }

    public void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Year: " + year);
        System.out.println("Author: " + name);
        System.out.println("Bio: " + bio);
    }
}
