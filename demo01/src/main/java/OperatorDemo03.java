/*
数据输入：
scanner使用的步骤;
1,导包
    import java.util.Scanner
    导包的动作必须出现在类定义的上边
2，创建对象
    Scanner sc = new Scanner(System.in)
    上面这个格式里面，只有SC是变量名，可以变，其他的都不允许变
3，接收数据
    int i = sc.nextInt();
    上面这个格式里面，只有i是变量名，可以变其他的不允许变。
 */
import java.util.Scanner;

public class OperatorDemo03 {
    public static void main(String[] args) {
        //创建对象
        Scanner sc = new Scanner(System.in);

        //接收数据
        int x = sc.nextInt();

        //输出数据
        System.out.println("x:" + x);

        /*
        三个和尚，采用键盘录入实现，获取三个和尚的最高身高
         */

        //键盘录入三个身高分别赋值给三个和尚
        System.out.println("请输入第一个和尚的身高:");
        int height1 = sc.nextInt();
        System.out.println("请输入第二个和尚的身高:");
        int height2 = sc.nextInt();
        System.out.println("请输入第三个和尚的身高:");
        int height3 = sc.nextInt();

        //用三元运算符获取前两个和尚较高的身高值，并用临时身高变量保存起来
        int tempHeight = height1 > height2 ? height1 : height2;
        //用三元运算符获取临时身高值和第三个和尚身高较高值，并用最大身高变量保存
        int maxHeight = tempHeight > height3 ? tempHeight : height3;

        //输出结果
        System.out.println("maxHeight:" + maxHeight);
    }
}
