import java.util.*;
public class StackMain{
    public static void main(String[] args)
    {
        //push
        //pop
        //peek
        //search
        //isEmpty
        Stack<String> books=new Stack<>();
        books.push("head");//insert
        books.push("travis");
        books.push("david");
        System.out.println(books.peek());//lastly added element is shown
        //System.out.println(books);
        System.out.println(books.pop());
        System.out.println(books.pop());
        System.out.println(books.pop());// removes one at a time
         //System.out.println(books.pop());
        //System.out.println(books.push());
        System.out.println(books.search("travis"));// returns the place of object from the begining of the inddex
        //System.out.println(books.peek());


    }
}