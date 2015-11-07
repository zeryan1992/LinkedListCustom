/**
 * Created by imac on 11/7/15.
 */
public class HeadAndTailLinkedList<T>
{
    private Node head;
    private Node tail;

    public void addToEnd(T data)
    {
        Node newNode= new Node(data);
        if (head==null)
        {
            head=newNode;
        }
        else if(tail!=null)
        {
            tail.setNextnode(newNode);
            tail=newNode;
        }
    }
}
