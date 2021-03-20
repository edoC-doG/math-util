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
