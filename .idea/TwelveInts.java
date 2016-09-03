import java.util.Arrays;

/**
 * Created by Dassa on 3/09/2016.
 */
public class TwelveInts {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5,6,7,8,9,10,11,12};
        System.out.println("The integers are " + Arrays.toString(list)) ;
        int[] reversed = reverse(list);
        System.out.println("The integers in reverse are " + Arrays.toString(reversed));
    }

    public static int[] reverse(int[] array) {
        int index;
        int[] reversed = new int[array.length];
        for(index = 0; index < array.length; index++)           // for each element in the array
            reversed[index] = array[array.length-(index+1)];    // assigning the value of each element in the array to
        // a new array in its original position's index from the end of the array
        return reversed;
    }
}
