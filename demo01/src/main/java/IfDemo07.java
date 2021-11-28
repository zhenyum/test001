/*
奇偶数
需求：任意给出一个整数，请用程序实现判断整数是奇数还是偶数，
并在控制台输出该整数是奇数还是偶数
 */
import java.util.Scanner;
public class IfDemo07 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        //接收数据
        int x = sc.nextInt();
        if (x%2==0){
            System.out.println("这个数是偶数");
        }
        else {
            System.out.println("这个数是奇数");
        }
        //输出数据
        System.out.println("x:" + x);

    }
}
