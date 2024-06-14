import java.util.Scanner;

public class classtest {
    private static validateclass v;

    public static void main(String[] args) {
        v = new validateclass();
        Scanner sc = new Scanner(System.in);
        System.out.println("enter class name");
        String name = sc.next();
        boolean check = v.validate(name);
        if (check) {
            System.out.println("classtest " + check);
        } else {
            System.out.println("classtest " + check);
        }
    }
}
