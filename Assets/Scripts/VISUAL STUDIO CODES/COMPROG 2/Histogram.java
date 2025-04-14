public class Histogram {
    public static void main(String[] args) {
        int[] values = {10, 3, 6, 18, 11, 1};

        System.out.println("\tIndex\tValue\tHistogram");

        for (int i = 0; i < values.length; i++) {
            System.out.print("\t" + i + "\t\t" + values[i] + "\t\t");

            for (int j = 0; j < values[i]; j++) {
                System.out.print("* ");
            }
            System.out.println();     
             }
}
}
   