public class Task8 {

    public static int sumWithCumulative(int... numbers) {
        int totalSum = 0;

        for (int i = 0; i < numbers.length; i++) {
            int num = numbers[i];

            // Compute cumulative sum: 1+2+3+...+num
            int cumulativeSum = 0;
            StringBuilder expression = new StringBuilder();

            for (int j = 1; j <= num; j++) {
                cumulativeSum += j;
                expression.append(j);
                if (j < num) {
                    expression.append("+");
                }
            }

            System.out.println(num + " = (" + expression + ") = " + cumulativeSum);
            totalSum += cumulativeSum;
        }

        return totalSum;
    }

    public static void main(String[] args) {
        System.out.println("Parameters: (4, 5, 10)");
        System.out.println("--- Cumulative Sums ---");
        int total = sumWithCumulative(4, 5, 10);
        System.out.println("--- Total Sum: " + total + " ---");
    }
}