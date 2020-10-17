import com.cg.datastructures.LinkedList;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void search() {
        LinkedList.Node head = new LinkedList.Node(56);
        LinkedList.Node second = new LinkedList.Node(30);
        LinkedList.Node third = new LinkedList.Node(70);

        head.setNext(second);
        second.setNext(third);

        int pos = LinkedList.search(head, 30);
        Assert.assertEquals(2, pos);


    }


}
