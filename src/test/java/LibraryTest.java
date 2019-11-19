import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {
    private Library library;
    private Book book1;
    private Book book2;
    private Book book3;

    @Before
    public void before() {
        library = new Library("Corstorphine Library");
        book1 = new Book("Molloy", "Samuel Beckett", "Comedy");
        book2 = new Book("Don Quixote", "Miguel De Cervantes", "Fiction");
        book3 = new Book("Of Mice and Men", "John Steinbeck", "Drama");
    }

        @Test
        public void canCountBooks(){
            assertEquals(0, library.bookCount());
        }

        @Test
        public void canAddBook(){
        library.addBook(book1);
        assertEquals(1, library.bookCount());
        }
    }

