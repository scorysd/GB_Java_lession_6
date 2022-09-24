public class app {

  public static void main(String[] args) {
    Node root = new Node(8);

    Node l1 = new Node(4);
    Node r1 = new Node(10);
    
    Node ll1 = new Node(3);
    Node lll1 = new Node(1);
    Node rll1 = new Node(2);
    
    Node rl1 = new Node(5);
    Node rrl1 = new Node(6);

    Node rr1 = new Node(12);
    Node rrr1 = new Node(13);
    
    root.right = r1;
    root.left = l1;

    r1.right = rr1;
    rr1.right = rrr1;

    l1.left = ll1;
    l1.right = rl1;

    ll1.left = lll1;
    ll1.right = rll1;

    rl1.right = rrl1;
    
    View.DirectTraverse(root, "");
  }

}

class Node {
  public Node(Integer v) {
    value = v;
  }
  Integer value;
  Node left;
  Node right;
}

class View {
  static void DirectTraverse(Node n, String space) {
    if (n != null) {
      System.out.printf("(%s%s", n.value, space);

      if (n.left != null) {
        DirectTraverse(n.left, "");
      }
      if (n.right != null) {
        DirectTraverse(n.right, space + ")");
      }
    }
  }
}

