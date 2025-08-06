public class Member {
    protected String name;

    public Member(String name) {
        this.name = name;
    }
    public void borrow(Book book){
        book.borrowBook();
    }
    public void returnBook(Book book){
        book.returnBook();
    }

}
