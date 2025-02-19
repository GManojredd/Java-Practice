package linkedLis;

import java.util.LinkedList;  
public class ListExample {  
public static void main(String[] args) {  
     
    LinkedList<String>list=new LinkedList<String>();  
    list.add("ankit");  
    list.add("peter");  
    list.add("mayank"); 
    list.addFirst("1");
    list.addLast("9");
    list.addFirst("hello");
    list.remove("peter");
    list.set(1,"nhgh");
    System.out.println(list);
   
}  
}  