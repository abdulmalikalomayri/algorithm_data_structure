
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        /*create root*/
        tree.root = new Node(1);

        /* following is the tree after above statement

              1
            /   \
          null  null     */

        tree.root.left = new Node(2);
        tree.root.right = new Node(3);

        /* 2 and 3 become left and right children of 1
               1
            /     \
          2        3
        /   \     /  \
      null null null null  */


        tree.root.left.left = new Node(4);
        /* 4 becomes left child of 2
                    1
                /       \
               2          3
             /   \       /  \
            4    null  null  null
           /   \
          null null
         */
        /*
        var myQueue = new Queue();

        for (int i = 0; i < 12; i++) {
            myQueue.enqueue();
        }

        myQueue.print_frontRear();

        var front = myQueue.peek();
        System.out.println(front.data);
        myQueue.dequeue();
        */

    }

}
