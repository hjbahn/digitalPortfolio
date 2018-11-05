package tests;
import maze.MyStack;

public class MyStackTest{
  public static void main(String[] args){
    MyStack<String> queue = new MyStack<String>();
    queue.add("A");
    queue.add("B");
    queue.add("C");
    System.out.println(queue.remove());
    System.out.println(queue.remove());
    System.out.println(queue.remove());
  }
}