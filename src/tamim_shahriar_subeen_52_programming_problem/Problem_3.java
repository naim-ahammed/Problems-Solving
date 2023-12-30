package tamim_shahriar_subeen_52_programming_problem;

//Half-way numbers
public class Problem_3 {

    public static void main(String[] args) {

        int count = 0;

        for (int i = 1000; i >= 1; i--) {
            System.out.print(i + "\t");
            count++;

            // Check if five numbers have been printed
            if (count == 5) {
                System.out.println(); // Move to the next line
                count = 0; // Reset the count
            }
        }
    }
}