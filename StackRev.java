import java.util.*;
public class StackRev{
public static void main(String[] args){
    Stack<Integer> st=new Stack<>();
    st.push(1);
    st.push(2);
    st.push(3);
    st.push(4);
    st.push(5);
    System.out.print(st);
    Stack<Integer> gt=new Stack<>();
    while(!st.isEmpty()){
        //System.out.print(st.pop() + " ");
        gt.push(st.pop());
}
 System.out.print(gt);
 Stack<Integer> rt=new Stack<>();
 while(!gt.isEmpty()){
    rt.push(gt.pop());
 }
 System.out.print(rt);
 }}