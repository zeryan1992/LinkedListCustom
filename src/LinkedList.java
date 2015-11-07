/**
 * Created by imac on 11/7/15.
 */
public class LinkedList<T>
{
    private Node head;
    public void insertAthead(int data)
    {
        Node newNode= new Node(data);
        newNode.setNextnode(head);
        head=newNode;
    }
    public int length()
    {
        int i = 0;
        Node current= head;
        while (current!=null)
        {

            i++;
            current=current.getNextnode();
        }
        return i;
    }
    public void deleteHead()
    {
        head=head.getNextnode();
    }
    public Node find(T data)
    {
        Node current= head;
        while (current!=null)
        {
            if (current.getData()==data)
            {
                return current;
            }
            else
            {
                current=current.getNextnode();
            }
        }
        return null;
    }

    @Override
    public String toString() {
        String result="{ ";
        Node current= head;
        while (current!=null)
        {
            result=result+current.getData()+" ,";

            current=current.getNextnode();
        }
        return result.replaceAll(",$","")+"}";
    }
}
