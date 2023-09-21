package ra.bt01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        Viết một chương trình Java để kiểm tra xem một chuỗi có rỗng hay không, sử dụng phương thức isEmpty()
//        của String.
        Scanner sc = new Scanner(System.in);
        System.out.println("Kiểm tra chuỗi có hay không hay rỗng");
        String str = sc.nextLine();
        System.out.println(str.isEmpty());


    }
}
