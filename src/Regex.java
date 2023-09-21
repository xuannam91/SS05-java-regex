import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    public static void main(String[] args) {
        System.out.println(validateUsername("nam"));
//        yêu cầu: nâng cao
//        tạo lớp validate kiểm tra sự chính xác của các dữ liệu sau
//        email: gmail.com
//        số điện thoại: việt Nam
//        mật khẩu: bảo mật cao
//        Ngày tháng năm: dd/MM/YY
//        validate chuỗi nhập vào có phaỉ là số không, thì mới hiển thị, nếu không là số thì nhập lại
    }
    public static boolean validateUsername(String username){
//        yêu cầu: 8-12 kí tự; không kí tự đặc biệt, không khoảng trắng, bắt đầu bằng in hoa
//        c1:
//        String pattern = "^[A-Z]{1}(a-zA-Z0-9)&&\\S{7,11}$";
//        Pattern patt = Pattern.compile(pattern);
//        Matcher math = patt.matcher(username);
//        return math.matches();
//        c2:
//        return Pattern.matches("^[A-Z]{1}(a-zA-Z0-9)&&\\S{7,11}$",username);
//        c3:
        return username.matches("^[A-Z]{1}(a-zA-Z0-9)&&\\S{7,11}$");
    }
}
