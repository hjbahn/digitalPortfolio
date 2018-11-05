package maze;
import java.util.Stack;

public class MyStack<T> implements Agenda<T>{

  private Stack<T> s;

  public MyStack(){
    s = new Stack<T>();
  }
  public void add(T element){
    s.push(element);
  }
  public T remove(){
    return (T)s.pop();
  }
  public boolean isEmpty(){
    return s.isEmpty();
  }
  public T peek(){
    return (T)s.peek();
  }

  public int size(){
    return s.size();
  }



}