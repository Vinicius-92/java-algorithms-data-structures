package DataStructures;

public class BinaryTree {
    public Node root;

    public BinaryTree() {
        root = null;
    }

    void insert(int value) {
        Node newNode = new Node(value, null, null);
        if (root == null)
            root = newNode;
        else {
            Node currentNode = root;
            while (true) {
                if (value < currentNode.value) {
                    // Left
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        break;
                    }
                    currentNode = currentNode.left;
                } else {
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }

    Node lookup(int value) {
        Node currentNode = root;
        while(true) {
            if (value == currentNode.value)
                return currentNode;
            else if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else {
                currentNode = currentNode.right;
            }
        }
    }

    // Unfinished remove method
//    void remove(int value) {
//        if (root == null) return;
//        // Setting up basic nodes to aux
//        Node nodeToRemove = lookup(value);
//        Node leafNode = root;
//        Node temp = null;
//        // finding the parent node
//        while (true) {
//            if (leafNode.right == nodeToRemove || leafNode.left == nodeToRemove) break;
//            else if (leafNode.right.value < nodeToRemove.value) leafNode = leafNode.right;
//            else leafNode = leafNode.right;
//        }
//        // setting up the temporary node to hold information of node that replaces to removed value
//        if (nodeToRemove.right == null && nodeToRemove.left != null)
//            temp = nodeToRemove.left;
//        else if (nodeToRemove.right != null && nodeToRemove.left == null)
//            temp = nodeToRemove.right;
//        else if (nodeToRemove.right != null) // This line certifies that we have both nodes !null
//            temp = nodeToRemove.right.left;
//
//        while (temp.left != null)
//            temp = temp.left;
//        // Pointing parent node to new child node
//        if(leafNode.right == nodeToRemove) leafNode.right = temp;
//        else leafNode.left = temp;
//        // Repointing the children nodes of new positioned node
//    }

    @Override
    public String toString() {
        return "BinaryTree{" +
                "root=" + root +
                '}';
    }
}

class Node {
    public int value;
    public Node left;
    public Node right;

    public Node() {
    }

    public Node(int value, Object left, Object right) {
        this.value = value;
        this.left = null;
        this.right = null;
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

class Main {
    public static void main(String[] args) {
        BinaryTree myTree = new BinaryTree();
        myTree.insert(10);
        myTree.insert(9);
        myTree.insert(11);
        myTree.insert(1);
        myTree.insert(2);
        myTree.insert(15);
        myTree.insert(0);
        myTree.insert(25);
        System.out.println(myTree);
        myTree.remove(1);
        System.out.println(myTree);

        System.out.println(myTree.lookup(25));
    }
}