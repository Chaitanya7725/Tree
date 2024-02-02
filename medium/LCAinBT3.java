package medium;

import java.util.HashSet;



public class LCAinBT3 {

    public static void main(String[] args) {
        Node two = new Node(2);

        two.left = new Node(7);
        two.right = new Node(4);
        two.parent = new Node(5);

        two.parent.left = new Node(3);
        two.parent.right = new Node(6);

        Node one = new Node(1);

        one.left = new Node(0);
        one.right = new Node(8);
        one.parent = two.parent.left;

        System.out.println(dfs(two.parent,one).val);
    }

    private static Node dfs(Node p, Node q) {
//        Please check git
        /*Node a =p, b =q;
        while(a!=b){
            a=a==null?p:a.parent;
            b=b==null?q:b.parent;
        }
        return a;*/
        return q;
    }

}
