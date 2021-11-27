package tests;

import task.IsPattern;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class IPv4PatternTest {
    @Test
    public void emptyIPv4Test() {
        assertFalse(IsPattern.IPv4(""));
    }

    @Test
    public void letterIPv4() {
        assertFalse(IsPattern.IPv4("l2l.1.1.1"));
    }

    @Test
    public void extraPointBeginIPv4() {
        assertFalse(IsPattern.IPv4(".1.1.1.1"));
    }

    @Test
    public void extraPointEndIPv4() {
        assertFalse(IsPattern.IPv4("1.1.1.1."));
    }

    @Test
    public void moreOctetsIPv4() {
        assertFalse(IsPattern.IPv4("1.1.1.1.1"));
    }

    @Test
    public void lessOctetsIPv4() {
        assertFalse(IsPattern.IPv4("1.1.1"));
    }

    @Test
    public void wrongOctetsIPv4() {
        assertFalse(IsPattern.IPv4("256.1.1.1"));
    }

    @Test
    public void extraNullIPv4() {
        assertFalse(IsPattern.IPv4("010.1.1.1"));
    }

    @Test
    public void correct() {
        assertTrue(IsPattern.IPv4("127.0.0.1"));
    }

    @Test
    public void minValueIPv4() {
        assertTrue(IsPattern.IPv4("0.0.0.0"));
    }

    @Test
    public void maxValueIPv4() {
        assertTrue(IsPattern.IPv4("255.255.255.255"));
    }
}