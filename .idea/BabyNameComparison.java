import java.util.Scanner;

/**
 * Created by Dassa on 3/09/2016.
 */
public class BabyNameComparison {
    public static void main(String[] args) {
        System.out.println("Please Input the first name...");
        Scanner input = new Scanner(System.in);
        String first = input.next();
        System.out.println("Please Input the second name...");
        String second = input.next();
        System.out.println("please input the third name...");
        String third = input.next();
        System.out.println("Some recomended name combinations: " + concatenator(first, second) + ", "
                + concatenator(first, third) + ", " + concatenator(second, first) + ", " + concatenator(second, third)
                + ", " + concatenator(third, first) + ", " + concatenator(third, second));
    }

    public static String concatenator(String name1, String name2) {
        String concatenatedName = name1 + "-" + name2;
        return concatenatedName;
    }
}
