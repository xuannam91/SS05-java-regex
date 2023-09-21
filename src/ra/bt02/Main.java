package ra.bt02;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Viết một chương trình Java để kiểm tra xem hai chuỗi có giống nhau hay không,
       // sử dụng phương thức equals() của String.
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào 2 chuỗi để so sánh");
        System.out.println("Nhập vào chuỗi 1");
        String str1 = sc.nextLine();
        System.out.println("Nhập vào chuỗi 2");
        String str2 = sc.nextLine();
        boolean check =  str1.equals(str2);
        System.out.println(check);
    }
}
