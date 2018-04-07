package puzzlers;

public class PuzzlerOne {
    public static void main(String[] args) {
        System.out.println(isOdd(-2));
        System.out.println(isOdd(-1));
        System.out.println(isOdd(1));
        System.out.println(isOdd(2));
    }
    public static int isOdd(int i){
        return i%2;
    }
}
