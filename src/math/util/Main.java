/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

//import com.tienvm.mathutil.MathUtility;

import MathUtility.MathUtility;


/**
 *
 * @author longb
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //tui muốn test xem 5! có bằng 120 ko?
        long expected = 120; //tui hi vọng 120 là giá trị trả về
        int n = 5;              //nếu tui tính 5!
        long actual = MathUtility.getFactorial(n);
                    //actual: cái value hàm thực sự trả về
                    //ta đi so sánh = mắt để luận xem hàm ta viết chạy đúng hay ko
        System.out.println("5!: Expected: " + expected +"; Actual: " + actual);
        
        // tình huống test thứ 2, 0! xem sao?
        //TÌNH HUỐNG TEST, TÌNH HUỐNG XÀI, GỌI LÀ TEST CASE
        n = 0;
        expected = 1;
        actual = MathUtility.getFactorial(n); //thực tế
        System.out.println("0!: Expected: " + expected +"; Actual: " + actual);
//        System.out.println("Hello GitHub.");
//        System.out.println("This is 1st upload connects to remote GitHub server");
    }
    
}

//trong quy trình lập trình chuyên nghiệp/ ở các công ty, đặc biệt là làm cho JP
//mọi hàm hay class bạn viết ra đều phải test kĩ càng 
//trước khi ghép nó vào trong các cột tính năng, và ghép với UI, Back-end
//làm sao để test các hàm, các class
// Dân dev có nhiều cách
//1. Cách 1: sout(kết quả xữ lí của hàm)
//2. Cách 2: JOptionPane(pop-up liên kết quả xữ lí hàm) bên trong Java Desktop
//3. Cách 3: Ghi vào LOG file trong môn Java Web, hay in kết quả xữ lí ra một trang web tạm nào đó
//VỚI 3 CÁCH NÀY, ta gọi hàm, nhìn kết quả trả về của hàm - ACTUAL VALUE
//  và ta ngầm so sánh với các kết quầm ta tự tính toán trước đó
//  khi chưa gọi hàm - ta gọi là GIÁ TRỊ KÌ VỌNG - EXPECTED VALUE
//nếu EXPECTED VALUE == ACTUAL VALUE (thực tế và kì vọng khớp nhau)
//nếu bằng =>> HÀM CHẠY ĐÚNG
//nếu ko bằng =>> HÀM XỮ LÍ SAI
// ==> 3 CÁCH TRÊN ĐÒI HỎI DEV PHẢI DÙNG MẮT ĐỂ LUẬN KẾT QUẢ ĐÚNG SAI
//nếu nhiều test case cần phải test, ta dễ bỏ sót, nhìn sai kết quả
//KĨ THUẬT TEST NHƯ TRÊN GỌI LÀ MANUAL TEST
//TEST KHI CODE VỪA MỚI XONG TỪNG HÀM GỌI LÀ UNIT TEST

//CÒN CÁCH XỊN SÒ THỨ 4
//TA KO CẦN NHÌN = MẮT TỪNG TRƯỜNG HỢP SỮ DỰNG HÀM
//TA NHỜ MÁY SO SÁNG GIÙM ACTUAL VỚI EXPECTED LUÔN
//VÀ NẾU TẤT CẢ CÁC TÌNH HUỐNG ĐỀU KHỚP, BẰNG NHAU, NÉM RA 1 MÀU XANH
//NẾU HẦU HẾT ĐỀU KHỚP, CHỈ CÓ ÍT NHẤT 1 CÁI KHÔNG KHỚP, HÀM KO ỔN ĐỊNH
//NÁM RA MÀU ĐỎ -> CẢNH BÁO DÂN CODE CÓ TRỤC TRẶC
// VẬY LÚC NÀY TA CHỈ NHÌN MÀU LÀ ĐỦ, KO CẦN LUẬN TỪNG KẾT QUẢ
//KỸ THUẬT NÀY GỌI LÀ TEST DRIVEN DEVELOPMENT + TEST AUTOMATION
//                      vừa viết code vừa test  tự động hóa việc test
//MUỐN LÀM ĐƯỢC ĐIỀU NÀY, TA CẦN THÊM THƯ VIỆN PHỤ TRỢ ĐỂ TUNG RA MÀU 
//THƯ VIỆN NÀY ĐỀU CÓ TƯƠNG ỨNG Ở CÁc NGÔN NGỮ LẬP TRÌNH
//JAVA: Junit, TestNG ...
//c#: NUnit, xUnit, MSTest
//PHP: PHPUnit
//...      
