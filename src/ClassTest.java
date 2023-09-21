import java.util.Scanner;

public class ClassTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = new String("Nam");

        Student minh = new Student();
        Student toan = new Student("toan", 20, "hn");
        Student nam = new Student("nam", 22, "hd");
        System.out.println(toan.soLanHoc);
        System.out.println(toan.name);
        toan.study();
        toan.study();
        toan.study();
        System.out.println(toan.soLanHoc);
        System.out.println(nam.soLanHoc);

        System.out.println(toan.doiten("tien"));

    }
}
