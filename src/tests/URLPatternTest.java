package tests;

import task.IsPattern;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class URLPatternTest {
    @Test
    public void emptyURLTest() {
        assertFalse(IsPattern.URL(""));
    }

    @Test
    public void justTextURLTest() {
        assertFalse(IsPattern.URL("Just Text"));
    }

    @Test
    public void oneWordDomainURLTest() {
        assertFalse(IsPattern.URL("http://a.com"));
    }

    @Test
    public void spaceInDomainURLTest() {
        assertFalse(IsPattern.URL("http://www.exa mple.com"));
    }

    @Test
    public void _InDomainURLTest() {
        assertFalse(IsPattern.URL("http://www.exa_mple.com"));
    }

    @Test
    public void hyphenInStartDomainURLTest() {
        assertFalse(IsPattern.URL("http://www.–example.com"));
    }

    @Test
    public void hyphenInEndDomainURLTest() {
        assertFalse(IsPattern.URL("http://www.example–.com"));
    }

    @Test
    public void httpURLTest() {
        assertTrue(IsPattern.URL("http://www.example.com"));
    }

    @Test
    public void httpsURLTest() {
        assertTrue(IsPattern.URL("https://www.example.com"));
    }

    @Test
    public void withoutProtocolURLTest() {
        assertTrue(IsPattern.URL("http://example.com"));
    }

    @Test
    public void withProtocolURLTest() {
        assertTrue(IsPattern.URL("http://www.example.com"));
    }

    @Test
    public void simpleURLTest() {
        assertTrue(IsPattern.URL("https://github.com/"));
    }

    @Test
    public void withAnySymbolsURLTest() {
        assertTrue(IsPattern.URL("https://new.vyatsu.ru/account/obr/rasp/?login=yes"));
    }

    @Test
    public void withSharpURLTest() {
        assertTrue(IsPattern.URL("https://ru.wikipedia.org/wiki/URL#StructureURL"));
    }
}