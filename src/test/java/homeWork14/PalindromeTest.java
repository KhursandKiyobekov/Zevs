package homeWork14;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PalindromeTest {
    /**
     * https://en.wikipedia.org/wiki/Palindrome
     * A palindrome is a word, number, phrase, or other sequence of characters which reads the same backward as forward, such as taco cat or madam or racecar or the number 10801.
     * Sentence-length palindromes may be written when allowances are made for adjustments to capital letters, punctuation, and word dividers, such as "A man, a plan, a canal, Panama!", "Was it a car or a cat I saw?" or "No 'x' in Nixon".
     */
    public static boolean isPalindrome(String word) {
        boolean isPalindrome = false;
        String pureWordWithoutAnything = word.replaceAll("\\W+", "").toLowerCase();

        String reversedWord = "";
        char[] charArrayText = pureWordWithoutAnything.toCharArray();
        for (int i = charArrayText.length -1; i >=0; i--) {
            reversedWord += charArrayText[i];
        };
        isPalindrome = reversedWord.equals(pureWordWithoutAnything);
//        Implementation goes here. If you want to use StringBuilder please add the second implementation of this method with loops! toCharArray
        return isPalindrome;
    };

    @Test
    public void singleWordTest() {
        assertTrue(isPalindrome("madam"));
      assertTrue(isPalindrome("racecar"));
      assertTrue(isPalindrome("10801"));
    }

     @Test
    public void caseInsensitiveTest() {
        assertTrue(isPalindrome("oloLO"));
    }

    @Test
    public void sentenceWithSpaceTest() {
//        TIP: In order to remove punctuation and spaces from text use "word".replaceAll("\\W+", "") method.
//        See https://en.wikipedia.org/wiki/Regular_expression
//        and https://www.w3schools.com/jsref/jsref_regexp_wordchar_non.asp
        assertTrue(isPalindrome("taco cat"));
    }

    @Test
    public void sentenceWithSpacesAndPunctuationTest() {
        assertTrue(isPalindrome("A man, a plan, a canal, Panama!"));
        assertTrue(isPalindrome("Was it a car or a cat I saw?"));
        assertTrue(isPalindrome("No 'x' in Nixon"));
    }

    @Test
    public void emptyTextTest() {
        assertTrue(isPalindrome(""));
    }


};
