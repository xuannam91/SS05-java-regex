import java.sql.SQLOutput;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String fullName = "Hùng";
        System.out.println(fullName);
        fullName = "Nam";
        System.out.println(fullName);
//        so sánh 2 chuỗi
        System.out.println(fullName.equals(("Nam")));
//        Tìm kiếm con trong chuỗi cha
        System.out.println(fullName.contains("am"));
//        Chuỗi bắt đầu và kết thúc
        System.out.println(fullName.startsWith("Na"));
        System.out.println(fullName.endsWith("o"));
        String str = "";
//        Kiểm tra  một chuỗi có rỗng không
        System.out.println(str.isEmpty());
//        Lấy vị trí của kí tự đầu tiên tìm được
        System.out.println(fullName.indexOf("g")); // trả về index,
//        Tìm kiếm và thay thế
        String content ="Initializes a newly created String object so t" +
                "hat it represents the same sequence of characters as the";
        String rs = content.replace("same", "");
        System.out.println(rs);
        System.out.println(content);
//        Nối chuỗi
        String newName = fullName.concat("hello");
        System.out.println(newName);
//        chuyển 1 chuỗi thành mảng
        String numbers = "1,2,3,4,5,6";
        String array[] = numbers.split(",");
        System.out.println(Arrays.toString(array));
//        in hoa, in thường, xoá khoảng trắng hai đầu
        String demo = "         Hello     ";
        System.out.println(demo.trim());
//        bởi vì là một mảng kí tự nên có thể duyệt chuỗi
        for (int i = 0; i <content.length(); i ++){
            System.out.println(demo.charAt(i));
        }
//        Cắt chuỗi
        System.out.println(content.substring(10,30));




    }
}