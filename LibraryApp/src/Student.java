public class Student extends Member{
    public Student(String name){
        super(name);
    }
    @Override
    public void borrow(Book book){
        System.out.println(name+" "+"is borrowing");
        book.borrowBook();
    }

}
