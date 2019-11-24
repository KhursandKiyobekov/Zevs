package day9.homework;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class day9b {
    public int calculateSum(int maxValue) {

        int sum = 0;
        int i = 0;
        while (i <=maxValue ) {
            sum = sum + i;
            i++;
        }
        return sum;

    }
        @Test
        public void testSumOfZero () {
            assertEquals(0, new day9b().calculateSum(0));
        }

        @Test
        public void testSumOfOne () {
            assertEquals(1, new day9b().calculateSum(1));
        }

        @Test
        public void testSumOfTwo () {
            assertEquals(3, new day9b().calculateSum(2));
        }

        @Test
        public void testSumOfThree () {
            assertEquals(6, new day9b().calculateSum(3));
        }

        @Test
        public void testSumOfFour () {
            assertEquals(10, new day9b().calculateSum(4));
        }

        @Test
        public void testSumOfOneTwenty () {
            assertEquals(120, new day9b().calculateSum(15));
        }
    };

