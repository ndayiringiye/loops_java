package scr;

public class LoopingNumbers {

    public static void main(String[] args) {
        for (int x = 2; x <= 20; x++) {
            if (x % 2 == 0) {  
                System.out.println("This is an even number: " + x);
            }
        }
    }
}
