package ra.btnangcao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
 //        yêu cầu: nâng cao
//        tạo lớp validate kiểm tra sự chính xác của các dữ liệu sau:
//        email: @gmail.com
//        số điện thoại: việt Nam
//        mật khẩu: bảo mật cao
//        Ngày tháng năm: dd/MM/YY
//        validate chuỗi nhập vào có phaỉ là số không, thì mới hiển thị, nếu không là số thì nhập lại

        Scanner sc = new Scanner(System.in);
        System.out.println(" ================= Menu ===================\n" +
                "              1. validate email.\n" +
                "              2. validate sdt.\n" +
                "              3. validate password.\n" +
                "              4. validate date.\n");
        System.out.println("Hãy nhập lựa chọn của bạn");
       int choice = Integer.parseInt(sc.nextLine());
       switch (choice){
           case 1 : while (true){
               System.out.println("nhập email cần test");
               String email =  sc.nextLine();

               if(validateEmail(email)){
                   System.out.println(email +"Đúng định dạng");
                   break;
               }else {
                   System.out.println("Sai định dạng, yêu cầu nhập lại");
               }
           }
           case 2: while (true){
               System.out.println("nhập sdt cần test");
               String numberPhone =  sc.nextLine();
               if(validatePhone(numberPhone)){
                   System.out.println(numberPhone +"Đúng định dạng");
                   break;
               }else {
                   System.out.println("Sai định dạng, yêu cầu nhập lại");
               }
           }
           case 3: while (true){
               System.out.println("nhập password cần test");
               String password =  sc.nextLine();
               if(validatePassword(password)){
                   System.out.println(password +"Đúng định dạng");
                   break;
               }else {
                   System.out.println("Sai định dạng, yêu cầu nhập lại");
               }
           }
           case 4: while (true){
               System.out.println("nhập date cần test");
               String date =  sc.nextLine();
               if(validateDate(date)){
                   System.out.println(date +"Đúng định dạng");
                   break;
               }else {
                   System.out.println("Sai định dạng, yêu cầu nhập lại");
               }
           }

       }

    }

    public static boolean validateEmail(String email){
        String regexEmail = "^[a-zA-Z0-9_.+-]+@gmail\\.com$";
        return email.matches(regexEmail);
    }
    public static boolean validatePhone(String phone){
        String regexphone = "^\\+84\\d{9,10}$";
        return phone.matches(regexphone);
    }
    public static boolean validatePassword(String password){
        String regexpassword = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)[a-zA-Z\\d]{8,}$";
        return password.matches(regexpassword);
    }
    public static boolean validateDate(String date){
        String regexDate = "^(0[1-9]|1[0-9]|2[0-9]|3[0-1]|[1-9])/(0[1-9]|1[0-2]|[1-9])/([0-9]{4})$";
        return date.matches(regexDate);
    }

}
