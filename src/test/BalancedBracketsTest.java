package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }

    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    @Test
    public void singleOpenBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void singleClosingBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }

    @Test
    public void emptyStringReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    @Test
    public void mismatchedBrackets() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void unevenBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[[]]]"));
    }


    @Test
    public void singleOpenBracketWithString() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void stringWithBalancedBrackets() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringWithLineBreakReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch\nCode"));
    }

    @Test
    public void singleOpenBraceWithSingleCurlyBracket() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[}"));
    }

    @Test
    public void bracketPairWithConcatonation() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[" + "]"));
    }

    @Test
    public void mistmatchedBracketsWithStrings() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    @Test
    public void bracketPairWithExtraOtherBraces() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[{()]"));
    }

}