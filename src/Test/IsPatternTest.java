package Test;

import Task.IsPattern;
import org.junit.Test;

import static org.junit.Assert.*;

public class IsPatternTest {

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
    public void minValueIPv4() {
        assertTrue(IsPattern.IPv4("0.0.0.0"));
    }

    @Test
    public void maxValueIPv4() {
        assertTrue(IsPattern.IPv4("255.255.255.255"));
    }


    @Test
    public void emptyGUIDTest() {
        assertFalse(IsPattern.GUID(""));
    }

    @Test
    public void wrongLetterGUIDTest() {
        assertFalse(IsPattern.GUID("i0000000-0000-0000-0000-000000000000"));
    }

    @Test
    public void minValueGUIDTest() {
        assertTrue(IsPattern.GUID("00000000-0000-0000-0000-000000000000"));
    }

    @Test
    public void maxValueLowerCaseGUIDTest() {
        assertTrue(IsPattern.GUID("ffffffff-ffff-ffff-ffff-ffffffffffff"));
    }

    @Test
    public void maxValueUpperCaseGUIDTest() {
        assertTrue(IsPattern.GUID("FFFFFFFF-FFFF-FFFF-FFFF-FFFFFFFFFFFF"));
    }

    @Test
    public void moreSymbolsInFirstNumberGUIDTest() {
        assertFalse(IsPattern.GUID("100000000-0000-0000-0000-000000000000"));
    }

    @Test
    public void lessSymbolsInFirstNumberGUIDTest() {
        assertFalse(IsPattern.GUID("0000000-0000-0000-0000-000000000000"));
    }

    @Test
    public void moreSymbolsInSecondNumberGUIDTest() {
        assertFalse(IsPattern.GUID("00000000-10000-0000-0000-000000000000"));
    }

    @Test
    public void lessSymbolsInSecondNumberGUIDTest() {
        assertFalse(IsPattern.GUID("00000000-000-0000-0000-000000000000"));
    }

    @Test
    public void moreSymbolsInThirdNumberGUIDTest() {
        assertFalse(IsPattern.GUID("00000000-0000-0000-10000-000000000000"));
    }

    @Test
    public void lessSymbolsInThirdNumberGUIDTest() {
        assertFalse(IsPattern.GUID("00000000-0000-0000-000-000000000000"));
    }

    @Test
    public void moreSymbolsInFourthNumberGUIDTest() {
        assertFalse(IsPattern.GUID("00000000-0000-0000-10000-000000000000"));
    }

    @Test
    public void lessSymbolsInFourthNumberGUIDTest() {
        assertFalse(IsPattern.GUID("00000000-0000-0000-000-000000000000"));
    }

    @Test
    public void moreSymbolsInFifthNumberGUIDTest() {
        assertFalse(IsPattern.GUID("00000000-0000-0000-0000-1000000000000"));
    }

    @Test
    public void lessSymbolsInFifthNumberGUIDTest() {
        assertFalse(IsPattern.GUID("00000000-0000-0000-0000-00000000000"));
    }

    @Test
    public void lessMinusGUIDTest() {
        assertFalse(IsPattern.GUID("000000000000-0000-0000-00000000000"));
    }

    @Test
    public void moreMinusGUIDTest() {
        assertFalse(IsPattern.GUID("000000000000--0000-0000-00000000000"));
    }


    @Test
    public void URL() {
    }


    @Test
    public void strongPassword() {
    }
}