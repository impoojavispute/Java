package OOPS;

class SmartLibrary 
{
    void searchBook(String title)
    {
        System.out.println("Searching for book with TITLE: " + title);
    }

    void searchBook(String title, String author)
    {
         System.out.println("Searching for book with TITLE: " + title + ", AUTHOR: " + author);
    }

    void searchBook(long isbn)
    {
        System.out.println("Searching for book with ISBN: " + isbn);
    }

    void searchBook(int startYear, int endYear)
    {
        System.out.println("Searching for books published between " + startYear + " and " + endYear);
    }
}
public class _5_MethodOverLoading_Library
{
    public static void main(String[] args) 
    {
        SmartLibrary lib = new SmartLibrary();
        lib.searchBook("Harry Potter");
        lib.searchBook("Harry Potter", "J.K Rowling");
        lib.searchBook(712537485);
        lib.searchBook(1990, 2000);    
    }
}
