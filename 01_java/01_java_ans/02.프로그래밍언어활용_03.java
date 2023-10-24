public class Ex10 {
    public static void main(String[] args) {
//        char c = 'a';
//        System.out.println((int)c);

        /*
        int start = 97;
        int end = (int) 'z';
        for(int i = start; i <= end; ++i) {
            System.out.print((char)i + " ");
        }
        */

        int start = 97;
        int end = (int) 'z';
        do {
            System.out.print((char)start + " ");
            ++start;

        }while(start <= end);
    }
}
