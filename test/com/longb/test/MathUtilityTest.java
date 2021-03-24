/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.longb.test;

import MathUtility.MathUtility;
import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author longb
 * 
 */
public class MathUtilityTest {
    
    //ta sẽ viết những đoạn code ở đây để test các hàm chính getFactorial()
    //bên MathUtility coi mày chạy đúng ko 
    //viết code để test code chính
    //đúng sai ở đây chúng tôi dùng màu sắc XANH ĐỎ
    @Test //biến hàm thường thành hàm main
    public void testFactorialGivenRightArgumentReturnsGoodResult() {
        long expected = 120;//hi vọng trả về 120
        int n = 5; //tui muốn tính 5!
        long actual = MathUtility.getFactorial(n);
        assertEquals(expected, actual);
        //nếu khớp thì màu xanh, sai lệnh màu đỏ
        //màu xanh xuất hiện khi tất cả các tình huống xài hàm test case đều xanh
        //màu đỏ xuất hiện ngay khi có ít nhất 1 thằng đỏ một test case sai
        //                                          => tất cả bỏ
        //ẩn ý: hàm đã đúng thì phải đúng cho tất cả các tình huống
        //mình test
        
        assertEquals(720, MathUtility.getFactorial(6)); //6! có đúng là 720 ko?
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(2, MathUtility.getFactorial(2));
        assertEquals(1, MathUtility.getFactorial(1));
        assertEquals(1, MathUtility.getFactorial(0));
        
        //khi màu đỏ thì có 2 tình huống:   bạn tính sai ko như kì vọng 
        //                                  hàm tính đúng, bạn kì vọng sai
       
    }
        // ta sẽ đi test hàm có ném ra ngoại lệ như thiết kế hay không
        // hàm đc thiết kế rằng: đưa tham số n 0...20-> tính đúng n!
        // hàm đc thiết kế răng: đưa tham số sai n<0 n>20
        //                      ném ra ngoại lệ cảnh báo sai tham số ngoài miền 
        //                      giá trị tính!
        // chốt: đưa tham số cà chớn phải ném về ngoại lệ
        //      nếu thấy đúng là ném về ngoại lệ khi đưa tham số cà chớn
        //      thì kết luận hàm đúng => XANH
        // thấy ngoại lệ khi đưa n sai => hàm chạy đúng
        // ngoại lệ xuất hiện khi 5! là hàm đúng
        // ngoại lệ không phải là giá rị để so sáng kiểu essertEquals()
        // ta dùng kiểu khác
//    @Test(expected = Exception.class)    //ko nên bắt ở mức cao nhất
        //                                  mặc dù ko sai
    
    @Test(expected = IllegalArgumentException.class)
    public void getFactorialGivenWrongArgumentThrowsException() {
        MathUtility.getFactorial(40);
        MathUtility.getFactorial(-40);
    } //cả 2 luôn 2 thàng này phải ném về ngoại lệ IllegalArgumentException
    
}
