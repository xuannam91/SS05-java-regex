package ra.bt03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Viết một phương thức Java để đảo ngược một chuỗi, sử dụng StringBuffer.
        System.out.println("Nhập vào chuỗi");

        String str = new Scanner(System.in).nextLine();
        StringBuffer newstr = new StringBuffer(str);
        newstr.reverse();
        System.out.println(newstr);
    }
}
