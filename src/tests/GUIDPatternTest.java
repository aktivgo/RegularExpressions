package tests;

import org.junit.Test;
import task.IsPattern;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class GUIDPatternTest {
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
}