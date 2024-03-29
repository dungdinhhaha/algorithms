import java.util.ArrayList;
import java.util.List;

public class PowerSet {
    ArrayList<Integer> input = new ArrayList<>();
    ArrayList<Integer> output = new ArrayList<>();
    Integer n = 3;

    public void function1(ArrayList<Integer> output, Integer max, Integer j) {
        if (output.size() == max) {
            System.out.println(output);
            return;
        }
        if (j == input.size()) {
            return;
        }


        function1(output, max, j + 1);


        ArrayList<Integer> newOutput = new ArrayList<>(output);
        newOutput.add(input.get(j));
        function1(newOutput, max, j + 1);
    }

    public static void main(String[] args) {
        PowerSet powerSet = new PowerSet();
        ArrayList<Integer> inputSet = new ArrayList<>(List.of(1, 2, 3)); // Example input
        powerSet.input = inputSet;

        for (int i = 1; i <= powerSet.n; i++) {
            powerSet.function1(new ArrayList<>(), i, 0);
        }
    }
}
