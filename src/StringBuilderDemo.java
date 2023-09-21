import java.util.Scanner;

public class StringBuilderDemo {
    public static void main(String[] args) {
//        Khởi  tạo đối tượng : 3 cách
        String fullName = "Hùnghx";
        StringBuilder string = new StringBuilder(fullName);
        System.out.println(string);
//        Các phương thức làm vệc
//        chèn append();
//       StringBuilder str1 = string.append(".Tuổi -24");
//       string.append("Hà nộifafjsfjdsh");
//        System.out.println(str1);


//        chèn vào vị trí xác định
//        string.insert(4, "Hello");
//        System.out.println(string);
//        xoá chuỗi con
        string.delete(2,5);
        string.deleteCharAt(7);
//        đảo ngược
        string.reverse();
//        thay thế
        string.replace(0,5,"Đã thay thế");
        System.out.println(string);

//        Ví dụ áp dụng:
//        cho phép người dùng nhập vào một chuỗi, tìm kiếm chuỗi có độ dài lớn nhất mà sắp xếp kí tự tăng dần
//        input: abcdbzjy;
//        output: abcd
//        b1: duyệt qua từng phần tử của chuỗi và tìm ra chuỗi con tăng dần
//        b2: tìm trong danh sách các chuỗi đấy . chuỗi nào dài nhất

        StringBuilder input  = new StringBuilder(new Scanner(System.in).nextLine());
        System.out.println(System.currentTimeMillis());
        String arr = "";
        for (int i = 0; i < input.length(); i++) {
            StringBuilder subString = new StringBuilder();
            subString.append(input.charAt(i));
            for (int j = i+1; j < input.length(); j++) {
                if(input.charAt(j-1)<input.charAt(j)){
                    subString.append(input.charAt(j));
                }else {
                    i=j;
                    break;
                }
            }
//            System.out.println(subString);
            if (arr.isEmpty()){
                arr +=subString;
            }else {
                arr += "," + subString;
            }
        }
        // chuyển đổi thành mảng
        String[] arraySubString = arr.split(",");
//        System.out.println(Arrays.toString(arraySubString));
        int idMax = 0;
        for (int i = 1; i<arraySubString.length;i++) {
            if (arraySubString[i].length()>arraySubString[idMax].length()){
                idMax = i;
            }
        }
        // hiển thị kết quả
        System.out.println(" Chuỗi con dài nhất là "+ arraySubString[idMax]);
        System.out.println(System.currentTimeMillis());


    }
}
