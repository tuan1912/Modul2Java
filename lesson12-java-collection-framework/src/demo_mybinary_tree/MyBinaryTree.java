package demo_mybinary_tree;

public class MyBinaryTree {
    int size;
    Node root;

    public void add(int number) {
        Node nodeNew = new Node();
        nodeNew.data = number;
        Node temp = root;

        if (root == null) {
            root = nodeNew;
            size ++;
            return;
        }
        while (true) {
            if (number > temp.data) {
                if (temp.right == null) {
                    temp.right = nodeNew;
                    size ++;
                    return;
                } else
                    temp = temp.right;
            } else if (number < temp.data) {
                if (temp.left == null) {
                    temp.left = nodeNew;
                    size ++;
                    return;
                } else temp = temp.left;
            } else return;
        }
    }


    public static void main(String[] args) {
        MyBinaryTree myTree = new MyBinaryTree();
        myTree.add(5);
        myTree.add(3);
        myTree.add(15);
        myTree.add(7);
        myTree.add(1);

        myTree.show(myTree.root);
    }


    public void show(Node temp) {
        if (temp == null) return;
        System.out.println(temp.data + "");

        if (temp.left != null) {
            show(temp.left);
        }

        if (temp.right != null) {
            show(temp.right);
        }
    }
}


