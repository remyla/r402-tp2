import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class PileTests {

    Pile a;
    Pile b;
    Pile c;
    Pile d;

    PileTests() {
        a = new Pile(); // {}
        ArrayList<Object> elements = new ArrayList<>();
        elements.add("b");
        b = new Pile(elements); // {"b"}
        elements.remove("b");
        elements.add(2.0);
        elements.add("a");
        elements.add(3);
        c = new Pile(elements); // {2.0, "a", 3}
        elements.add(2.0);
        d = new Pile(elements); // {2.0, "a", 3, 2.0}
    }

    @Test
    void testConstructeur() {
        ArrayList<Object> elements = new ArrayList<>();
        elements.add(null);
        assertThrows(NullPointerException.class, () -> new Pile(elements));
        elements.add(0, "b");
        assertThrows(NullPointerException.class, () -> new Pile(elements));
    }

    @Test
    void testTaille() {
        assertEquals(0, a.taille());
        assertEquals(1, b.taille());
        assertEquals(3, c.taille());
        assertEquals(3, d.taille());
    }

    @Test
    void testContient() {
        assertFalse(a.contient(1));
        assertFalse(b.contient(1));
        assertTrue(b.contient("b"));
        assertFalse(c.contient(0));
        assertTrue(c.contient(2.0));
        assertFalse(d.contient(0));
        assertTrue(d.contient(2.0));
    }

    @Test
    void testElement() {
        assertThrows(NoSuchElementException.class, () -> a.element());
        assertEquals("b", b.element());
        assertTrue(c.contient(c.element()));
        assertTrue(d.contient(d.element()));
    }

    @Test
    void testUnion() {
        Pile e = b.union(c);
        assertEquals(4, e.taille());
        assertTrue(e.contient("b"));
        assertTrue(e.contient(3));
        assertFalse(e.contient(1.0));

        Pile f = c.union(d);
        assertEquals(3, f.taille());
        assertTrue(f.contient(3));
        assertFalse(f.contient(1.0));
    }
}
