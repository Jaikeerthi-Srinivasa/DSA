
import java.io.*;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Stack<Character> stack = new Stack<>();
        String str = br.readLine();
        boolean tag = false;
        for(int i = 0 ; i < str.length() ; i++){
            if(str.charAt(i) == '<'){
                while(!stack.isEmpty()){
                    System.out.print(stack.pop());
                }
                tag = true;
                System.out.print(str.charAt(i));
            }

            else if(str.charAt(i) == '>'){
                tag = false;
                System.out.print(str.charAt(i));
            }
            else{
                if(tag){
                    System.out.print(str.charAt(i));
                }
                else{
                    if(str.charAt(i) == ' '){
                        while(!stack.isEmpty()){
                            System.out.print(stack.pop());
                        }
                        System.out.print(" ");
                    }
                    else{
                        stack.add(str.charAt(i));
                    }
                }
            }
        }
        while(!stack.isEmpty()){
            System.out.print(stack.pop());
        }
        br.close();
    }
}
//======================================================================


import java.io.*;
import java.util.Stack;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String val  = br.readLine();
        Stack<Character> stack = new Stack<>();
        int pieceCnt = 0;
        for(int i = 0 ; i < val.length() ; i++){
            if(val.charAt(i) == '('){
                stack.push(val.charAt(i));
            }
            else{
                stack.pop();
                if(val.charAt(i - 1) == '('){
                    pieceCnt +=stack.size();
                }
                else{
                    pieceCnt++;
                }
            }
        }
        System.out.println(pieceCnt);
    }
}
