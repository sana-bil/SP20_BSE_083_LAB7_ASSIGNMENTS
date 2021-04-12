public class Book {
    private Person2 author;
    private String bookName;
    private String publisher;
    //CONSTRUCTOR
    public Book(Person2 a,String b,String p)
    {
        author=a;
        bookName=b;
        publisher=p;
    }
    //display method
    public void display()
    {
        System.out.println("\n BOOK DETAILS");
        System.out.println("\nBOOK NAME :" + this.bookName +"\nPUBLISHER NAME :"
                + this.publisher);
    }

}
