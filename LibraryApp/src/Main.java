//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Book b1=new Book("horror","williams");
        Book b2=new Book("miracle","romanian");
        Member stu=new Student("balaji");
        Member tea=new Teacher("Jagan");
        b1.showStatus();
        stu.borrow(b1);
        tea.borrow(b2);
        stu.returnBook(b1);
        tea.borrow(b2);

    }
}