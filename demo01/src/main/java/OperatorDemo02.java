/*
三元运算符
格式：关系表达式？表达式1：表达式2；
示例：a > b ? a:b;
计算规则：
    首先计关系表达式的值
    如果值为true,表达式1的值就是运算结果
    如果值为false,表达式2的值就是运算结果
 */

public class OperatorDemo02 {
    public static void main(String[] args) {
        int a =10;
        int b = 20;

        //获取两个数据中的较大值
        int max = a > b ? a:b;

        //输出结果
        System.out.println("max:" + max);
        /*
        需求：两只老虎，分别体重180、200，判断是否相同
         */
        int weight1 = 180;
        int weight2 = 200;
        boolean j =weight1 == weight2 ? true : false;
        System.out.println("j:" + j);

           /*
        需求：三个和尚，210cm,165cn,150cm,输出最高的和尚
         */
        int height1 = 210;
        int height2 = 165;
        int height3 = 150;
        int max2 = height1 > height2 ? height1 : height2;
        System.out.println("max2:" + max2);
        int max3 = max2 > height3 ? max2:height3;
        System.out.println("max3:" + max3);
    }
}
