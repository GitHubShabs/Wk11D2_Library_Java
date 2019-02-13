import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library(50);
        book = new Book("Cookery", "Gorden Ramsey", "cook-book");
    }

    @Test
    public void canGetBookCount(){
        assertEquals(0, library.getBookCount());

    }







}




