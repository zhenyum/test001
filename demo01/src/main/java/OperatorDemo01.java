/*
段逻辑运算符
&&短路与和&相同，但是有短路效果。即左边是false，则右边不执行
|| 作用和|相同，但是有短路效果

注意事项：
逻辑与&，无论左边真假，右边都要执行
短路与&&， 即左边是false，则右边不执行，昨边为真，右边执行

逻辑或|，无论左边真假，右边都要执行
短路或&&， 即左边是false，则右边执行，左边为真，右边不执行
 */


public class OperatorDemo01 {
    public static void main(String[] args) {
        int i = 10;
        int j = 20;
        int k = 30;

        //&&(与) 有false则false
        System.out.println((i>j) && (i>k));//false && true
        System.out.println((i<j) && (i>k));//true && false
        System.out.println((i>j) && (i<k));//false && true
        System.out.println((i<j) && (i<k));// true && true
        System.out.println("-----------------");

        //||(或) 有true则true
        System.out.println((i>j) || (i<k));//false || true
        System.out.println((i<j) || (i<k));//true || false
        System.out.println((i>j) || (i>k));//false || true
        System.out.println((i<j) || (i>k));// true || true
        System.out.println("-----------------");

        //&&(与) 和 &
        System.out.println((i++ > 100) & (j++ > 100)); //false & false
        System.out.println((i++ > 100) && (j++ > 100)); //false && false
        System.out.println("i:" + i);
        System.out.println("j:" + j);
    }
}
