// https://www.acmicpc.net/problem/10828
import java.util.Scanner;
import java.util.Stack;

public class Boj_10828{
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i = 0 ; i < N ; i++){
            String str = sc.next();
            if(str.equals("push")){
                int addNumber = sc.nextInt();
                stack.add(addNumber);
            }
            else if(str.equals("pop")){
                if(stack.isEmpty()) System.out.println("-1");
                else System.out.println(stack.pop());
            }
            else if(str.equals("size")){
                System.out.println(stack.size());
            }
            else if (str.equals("empty")){
                if(stack.isEmpty()) System.out.println("1");
                else System.out.println("0");
            }
            else if(str.equals("top")){
                if(stack.isEmpty()) System.out.println("-1");
                else System.out.println(stack.peek());
            }
        }
        sc.close();
    }
}