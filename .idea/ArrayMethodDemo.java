import java.util.Arrays;

/**
 * Created by Dassa on 3/09/2016.
 */
public class ArrayMethodDemo {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        int limit = 4;
        System.out.println("The integers are " + Arrays.toString(array));
        System.out.println("The integers in reverse are " + Arrays.toString(reverse(array)));
        System.out.println("The sum of the integers is " + (arraySum(array)));
        System.out.println("The integers less than " + limit + " are " + Arrays.toString(smallerThan(limit,array)));
        System.out.println("The integers greater than the average are " + Arrays.toString(largerThan(array)));
    }
    public static int[] reverse(int[] array) {
        // assigns each element in the original array to a new array in the reversed order
        int index;
        int[] reversed = new int[array.length];
        for (index = 0; index < array.length; index++)
            reversed[index] = array[array.length - (index + 1)];
        return reversed;
    }

    public static int arraySum(int[] array){
        // sums the values in the array
        int index;
        int sum = 0;
        for(index = 0; index < array.length; index++){
            sum += array[index];
        }
        return sum;
    }

    public static int[] smallerThan(int limit, int[] array) {
        // assigns each element in the original array that is less than a limit to a new array
        int index, index2 = 0;
        int numberOf = 0;
        // finds the length of the new array so it can be initialised
        for (index = 0; index < array.length; index++) {
            if (array[index] < limit) {
                numberOf += 1;
            }
        }
        // assigns each value to the new array
        int[] smaller = new int[numberOf];
        for (index = 0; index < array.length; index++) {
            if (array[index] < limit) {
                smaller[index2] = array[index];
                index2++;
            }
        }
        return smaller;
    }
    public static int[] largerThan(int[] array) {
        // assigns each element in the original array that is greater than the average to a new array
        // find average
        double average = (double)arraySum(array)/array.length;
        int index, index2 = 0;
        int numberOf = 0;
        // finds the length of the new array so it can be initialised
        for (index = 0; index < array.length; index++) {
            if (array[index] > average) {
                numberOf += 1;
            }
        }
        // assigns each value to the new array
        int[] larger = new int[numberOf];
        for (index = 0; index < array.length; index++) {
            if (array[index] > average) {
                larger[index2] = array[index];
                index2++;
            }
        }
        return larger;
    }
}


