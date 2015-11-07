/**
 * Created by imac on 11/7/15.
 */
public class Node<T> {
    private T data;
    private Node nextnode;

    public Node(T data) {
        this.data=data;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Node getNextnode() {
        return nextnode;
    }

    public void setNextnode(Node nextnode) {
        this.nextnode = nextnode;
    }


}
