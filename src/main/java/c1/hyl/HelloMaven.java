package c1.hyl;

/**
 * 作者: Huang
 * 时间: 2022-10-19
 */
public class HelloMaven {//主程序 类

    public static void main(String[] args) {
        System.out.println("hello git!");
    }


    public int add(int a,int b){
        return a+b;
    }

    public int jian(int a,int b){
        if(a>=b){
            return a-b;
        }
        return b-a;
    }
}