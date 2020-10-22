import java.io.*;

public class Main{
    static int N;
    static String in , ins[];
    static Queue q= new Queue();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        N = Integer.parseInt(br.readLine());

        for(int i = 0 ; i < N ;i++){
            in = br.readLine();
            ins = in.split(" ");
            if(ins.length == 1){
                switch (ins[0]){
                    case "size" : bw.write(q.size() + "\n"); break;
                    case "empty" : bw.write((q.isEmpty() ? 1 : 0) + "\n"); break;
                    case "front" : bw.write(q.front() + "\n"); break;
                    case "back" : bw.write(q.back() + "\n"); break;
                    case "pop" : bw.write(q.pop() + "\n"); break;
                }
            }
            else {
                q.push(Integer.parseInt(ins[1]));
            }
        }
        bw.close();
    }
    private static class Queue{
        int size;
        Node front , back;
        class Node{
            int data;
            Node next;
            Node(int data){
                this.data = data;
                this.next = null;
            }
        }
        Queue(){
            size = 0;
            front = back = null;
        }
        public int size(){
            return size;
        }
        public boolean isEmpty(){
            return (size==0);
        }
        public void push(int data){
            Node newNode = new Node(data);
            if(isEmpty()){
                front = back = newNode;
            }
            else{
                back.next = newNode;
                back = newNode;
            }
            size++;
        }
        public int pop(){
            if(isEmpty()){
                return -1;
            }
            else{
                int tmp = front.data;
                front = front.next;
                size--;
                return tmp;
            }
        }
        public int front(){
            return (isEmpty() ? -1 : front.data);
        }
        public int back(){
            return (isEmpty()) ? -1 : back.data;
        }

    }
}

//-----------------------------------------------------------------------------------

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Main{
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n = input.nextInt();

        Queue<Integer> q1 = new LinkedList<>();
        Queue<Integer> q2 = new LinkedList<>();
        int m = input.nextInt();

        for(int i = 0 ; i < n ; i++){
            q1.offer(i+1);
        }

        int count = 1;
        while(!q1.isEmpty()){
            if(count % m == 0){
                q2.offer(q1.poll());
            }
            if(count % m != 0){
                q1.offer(q1.poll());
            }
            count++;
        }
        System.out.print("<" + q2.poll());
        while (!q2.isEmpty()){
            System.out.print(", "+q2.poll());
        }
        System.out.print(">");
    }
}

//-----------------------------------------------------------------------------------

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.ArrayDeque;
public class Main { 

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        Deque<Integer> deque = new ArrayDeque<>();
        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++) {
            String[] arr = br.readLine().split(" ");
            switch (arr[0]) {
                case "push_front" : deque.offerFirst(Integer.parseInt(arr[1])); break;
                case "push_back" : deque.offerLast(Integer.parseInt(arr[1])); break;
                case "pop_front" : 
                    if(deque.isEmpty())
                        sb.append(-1 + "\n");
                    else
                        sb.append(deque.pollFirst() + "\n");
                    break;
                case "pop_back" : 
                    if(deque.isEmpty())
                        sb.append(-1 + "\n");
                    else
                        sb.append(deque.pollLast() + "\n");
                    break;
                case "size" : sb.append(deque.size() + "\n"); break;
                case "empty" :
                    if(deque.isEmpty())
                        sb.append(1 + "\n");
                    else
                        sb.append(0 + "\n");
                    break;
                case "front" :
                    if(deque.isEmpty())
                        sb.append(-1 + "\n");
                    else
                        sb.append(deque.peekFirst() + "\n");
                    break;
                case "back" :
                    if(deque.isEmpty())
                        sb.append(-1 + "\n");
                    else
                        sb.append(deque.peekLast() + "\n");
                    break;                  
            }
        }
        System.out.println(sb);
    }
}

//-----------------------------------------------------------------------------------

