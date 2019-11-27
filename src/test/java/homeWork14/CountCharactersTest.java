package homeWork14;

        // import com.sun.org.apache.xpath.internal.operations.String;
        import org.junit.Test;

        import static org.junit.Assert.assertEquals;

    public class CountCharactersTest {
        /**
         * This method should return amount of specified characters in the text. Upper and lower case characters are meant to be the same character
         *
         * @param text      - text sentence
         * @param character - character amount of which we are counting
         * @return - amount of character in text
         */
        public static int countCharacters(String text, char character) {
            int amountOfCharactersInText = 0;

//        Implementation goes here.
//        TIP String class has "text".toCharArray() method that transforms String to characters array.


            char[] textToChar = text.toLowerCase().toCharArray();
            for (char c : textToChar) {
                if (c == character) {
                    amountOfCharactersInText++;
                }
            }

            return amountOfCharactersInText;
        }

        @Test
        public void singleWordTest() {
            assertEquals(2, countCharacters("digitsArray", 'r'));
        }

        @Test
        public void caseSensitiveTest() {
            assertEquals(2, countCharacters("digitsArray", 'a'));
        }

        @Test
        public void upperCaseTest() {
            assertEquals(0, countCharacters("digitsArray", 'A'));
        }
    }
