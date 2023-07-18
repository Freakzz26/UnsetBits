import java.util.Scanner;

public class UnsetBit {
    static void check(int number,int index)
    {
        System.out.println(((number & (1<<index))==0)? number: (int)(number-Math.pow(2,index)));
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int number= scanner.nextInt();
        int index= scanner.nextInt();
       check(number,index);
    }
}
