/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MathUtility;

/**
 *
 * @author longb
 */
public class MathUtility {
    // class này chứa 1 nhóm toán học, fake từ các class chuẩn
    // java.util.Math của JDK
    // vì là đồ xài chung nên sẽ là STATIC
    public  static final double PI = 3.1415;
    
    // hàm tính n!
    // Vì giai thừa tắng rất nhanh,21 ! trận kiểu long
    // kiểu long chịu được 10*18 18 con số 0
    // âm giai thừa không tính được
    public  static long  getFactorial(int n){
        if(n <0 || n >20)
                throw new IllegalArgumentException ("Invalid argument." + "n must be between 0..20 ");
        if ( n==0|| n ==1)
                return 1;
        // khoi mất công tính return ngay
        long result = 0; // cố tình để value này
        for ( int i = 2; i <= n ; i++)
            result *=1;
        //n! = 1.2.3.4.5...n
        return result;
    }
}
// VIET CODE XONG THI PHAI TEST CODE - NGUYEN TAC PHAI THEO
// TEST NGAY TỪNG HÀNG TỪNG CLASS TRƯỚC KHI RÁP CHÚNG VỚI CÁC CLASS KHÁC
// TEST NGAY KHI XONG HÀM, XONG CLASS
// ĐƯỢC GỌI LÀ TEST MỨC ĐỌ 1, MỨC UNIT TEST ( TEST MỨC ĐƠN VỊ CODE)
// làm sao để test. Có nhiều cách
// 1.Cách 1 : sout(gọi hàm ()) để in ra kết quả xử lý của hàm
// 2. Cách 2: JOptionPane để popup lên kết quả xử lý của hàm
// 3. Cách 3 : ghi ra LOG file, ra trang web
// 3 cách này đều phải dùng mắt xem kết quả, và tự kết luận đúng sai
//đúng: tức là hàm chạy ra 1 giá trị - ACTUAL VALUE
                      //và ta thấy ACTUAL VALUE khớp bằng với các
// trị mà tra mong đợi , ta tính trước = tay , gọi là EXPECTED VALUE
// ví dụ 5! thì ta hy vọng expected hàm trả về 120
// nhưng khốn nạn thay , hàm trả về đúng 120 - actual
// hàm chạy đúng cho 5!

// * sai: tui test6!, expected = 720, khốn nạn thay , chạy ra actual = 120
// hàm xử lý sai



// CÁCH 4 : MÁY ƠI SO SÁNH GIÙM VÀ KẾT LUẬN GIÙM TAO LUÔN VÌ MÀY
// CÓ CÁC PHÉP TOÁN SO SÁNH MÀ
// CON NGƯỜI KHÔNG CẦN NHÌNH TỪNG DÒNG KẾT QUẢ  TRẢ VỀ ĐỂ LUẬN ĐÚNG SAI
// MÁY SẼ LO CHOLA
// NẾU TẤT CẢ TÍNH HUỐNG CHẠY HÀM ĐỀU ĐÓNG ->> HÀM ĐÓNG --> MÀU XANH
// HẦU HẾ TÍNH HUỐNG CHẠY HÀM ĐÓNG , CÓ 1 CÁI SAI --> HÀM SAI->> MÀU ĐỎ
// ĐỎ l CHỈ CẦN 1 THẰNG SAO
// XANH: TẤT CẢ CẦN PHẢI ĐỀU ĐÚNG

// MÚN LÀM ĐC ĐIỀU NÀY TA CẦN THƯ VIỆN PHỤ TRỢ GIÚP CHO JAVA XANH ĐỎ
// ĐIỀU NÀY CŨNG CÓ BÊN C# PHP, JS, RUBY,...
//JAVA : JUnit, TestNG
//C# : NUnit ,xUnit , MTest
//PHP : PHPUnit

