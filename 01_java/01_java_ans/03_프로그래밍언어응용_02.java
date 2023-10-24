public class Ex05 {
    public static void main(String[] args) {
        /*
        int[] arr = {8,3,1,6,2,4,5,9 };

        int sum = 0;
        for(int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        System.out.println(String.format("%.2f", (double)sum / arr.length));
         */

        int[] arr;
        arr = new int[]{8,3,1,6,2,4,5,9 };
        Ex05 ex05 = new Ex05();

        System.out.println(String.format("%.2f", ex05.avg(arr)));


    }

    public double avg(int[] arr) {
        int sum = 0;
        for(int i = 0; i < arr.length; ++i) {
            sum += arr[i];
        }
        return (double)sum / arr.length;
    }
}
