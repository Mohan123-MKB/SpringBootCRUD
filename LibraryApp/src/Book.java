public class Book {
    private String title;
    private String author;
    private boolean isAvailable;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }
    public void borrowBook(){
        if(isAvailable){
            isAvailable=false;
            System.out.println(title+" has been borrowed.");
        }
        else{
            System.out.println(title+"is not available.");
        }
    }
    public void returnBook(){
        isAvailable=true;
        System.out.println(title+"has been returned.");
    }
    public void showStatus(){
        System.out.println("title: "+title);
        System.out.println("author: "+author);
        System.out.println("isAvailable: "+isAvailable);
    }
}
