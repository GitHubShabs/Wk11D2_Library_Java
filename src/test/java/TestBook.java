import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestBook {
    Book book;

    @Before
    public  void setUp() {
        book = new Book("Power of Now", "Erkart Tolle", "Spiritual");
    }

    @Test
    public void bookHasTitle(){
        assertEquals("Power of Now", book.getBookTitle());
    }

    @Test
    public void bookHasAuthor(){
        assertEquals("Erkart Tolle", book.getBookAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Spiritual", book.getBookGenre());
    }

}
