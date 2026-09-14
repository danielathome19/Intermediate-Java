package Q1;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import Algorithms.SearchAlgorithms;

public class Prog460a {
    public static void main(String[] args) {
        try {
            var file = new Scanner(new File("Langdat/sort.dat"));
            var nums = new ArrayList<Integer>();

            while (file.hasNext())
                nums.add(file.nextInt());
            file.close();

            int lcv = 0;  // loop control variable
            var arr = new Integer[nums.size()];
            for (var n : nums) arr[lcv++] = n;

            // User can enter -1 to exit
            int num = 0;
            var input = new Scanner(System.in);
            do {
                System.out.print("Enter a number to search for: ");
                num = input.nextInt();
                int pos = SearchAlgorithms.binarySearchRecursive(arr, num);
                System.out.println(pos == -1 ? "Your number does not occur in the list\n"
                                             : "Your number occurs at index " + (pos+1) + "\n");
                // Ternary operator: <condition> ? value if true : value otherwise;
            } while (num != -1);

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
