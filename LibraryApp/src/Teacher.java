public class Teacher extends Member{
    public Teacher(String name){
        super(name);
    }
    @Override
    public void borrow(Book book){
        System.out.println(name+" "+"is borrowing");
        book.borrowBook();
    }

}
