package DataStructures;

import com.sun.jmx.remote.internal.ArrayQueue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedTransferQueue;

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

    List<Integer> BreadthFirstSearch() {
        Node currentNode = root;
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedTransferQueue<>();
        queue.add(root);
        while (queue.size() > 0) {
            currentNode = queue.poll();
            list.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if(currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return list;
    }

    List<Integer> BreadthFirstSearchR(List<Integer> list, Queue<Node> queue) {
        if (queue.size() == 0) {
            return list;
        }
        Node currentNode = queue.poll();
        list.add(currentNode.value);
        if (currentNode.left != null) {
            queue.add(currentNode.left);
        }
        if(currentNode.right != null) {
            queue.add(currentNode.right);
        }
        return BreadthFirstSearchR(list, queue);
    }


    List<Integer> DFSInOrder(List<Integer> list) {
         return TraverseInOrder(root,  list);
    }
    List<Integer> TraverseInOrder(Node node, List<Integer> list) {
        if (node.left != null)
            TraverseInOrder(node.left, list);
        list.add(node.value);
        if (node.right != null)
            TraverseInOrder(node.right, list);
        return list;
    }

     List<Integer> DFSPostOrder(List<Integer> list) {
        return TraversePostOrder(root, list);
     }
    List<Integer> TraversePostOrder(Node node, List<Integer> list) {
        if (node.left != null)
            TraversePostOrder(node.left, list);
        if (node.right != null)
            TraversePostOrder(node.right, list);
        list.add(node.value);
        return list;
    }

     List<Integer> DFSPreOrder(List<Integer> list) {
        return TraversePreOrder(root, list);
     }
    List<Integer> TraversePreOrder(Node node, List<Integer> list) {
        list.add(node.value);
        if (node.left != null)
            TraversePreOrder(node.left, list);
        if (node.right != null)
            TraversePreOrder(node.right, list);
        return list;
    }

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
        myTree.insert(9);
        myTree.insert(4);
        myTree.insert(20);
        myTree.insert(1);
        myTree.insert(6);
        myTree.insert(15);
        myTree.insert(170);
        myTree.BreadthFirstSearch();
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new LinkedTransferQueue<>();
        queue.add(myTree.root);

        List<Integer> myList = myTree.BreadthFirstSearchR(list, queue);
        myList.forEach(System.out::println);

        List<Integer> DFSInOrderResult = myTree.DFSInOrder(list);
        DFSInOrderResult.forEach(System.out::println);

        List<Integer> DFSPreOrderResult = myTree.DFSPreOrder(list);
        DFSPreOrderResult.forEach(System.out::println);

        List<Integer> DFSPosOrderResult = myTree.DFSPostOrder(list);
        DFSPosOrderResult.forEach(System.out::println);

    }
}