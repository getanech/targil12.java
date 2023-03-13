public class targil9 {
    public static void main(String[] args) {
        int[] arr1 = {10, 20, 30, 40, 50};
        System.out.println(array(arr1));

        double[] arr4 = {10, 20, 30};
        System.out.println(average(arr4));

    }

    public static int array(int[] biigest) {
        int max = 0;
        for (int i = 0; i < biigest.length; i++) {
            if (biigest[i] > biigest[0]) {
                max = biigest[i];

            }
        }
        return max;
    }

    public static double average(double[] number) {
        double sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i];
        }
        double average = sum / number.length;
        return average;
    }

}
