/**
 * Created by imac on 11/7/15.
 */
public class LinkedListImplementation
{
     public static void main(String[] args)
     {
         LinkedList linkedList= new LinkedList();
         for (int i=0;i<10;i++)
         {
             linkedList.insertAthead(i);
         }
        System.out.println(linkedList);
     }
}
