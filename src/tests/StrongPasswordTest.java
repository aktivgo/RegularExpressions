package tests;

import task.IsPattern;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class StrongPasswordTest {
    @Test
    public void emptyPasswordTest() {
        assertFalse(IsPattern.StrongPassword(""));
    }

    @Test
    public void noDigitsPasswordTest() {
        assertFalse(IsPattern.StrongPassword("Cool_pass"));
    }

    @Test
    public void noUpperCaseLettersPasswordTest() {
        assertFalse(IsPattern.StrongPassword("coo1_pass"));
    }

    @Test
    public void noLowerCaseLettersPasswordTest() {
        assertFalse(IsPattern.StrongPassword("COO1_PASS"));
    }

    @Test
    public void less8SymbolsPasswordTest() {
        assertFalse(IsPattern.StrongPassword("C00l"));
    }

    @Test
    public void RussianLettersPasswordTest() {
        assertFalse(IsPattern.StrongPassword("Кул1"));
    }

    @Test
    public void wrongSymbolsPasswordTest() {
        assertFalse(IsPattern.StrongPassword("Coo1*pass"));
    }

    @Test
    public void allRulePasswordTest() {
        assertTrue(IsPattern.StrongPassword("SupperPas1"));
    }
}