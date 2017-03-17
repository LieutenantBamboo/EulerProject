package Interview.BinaryTree.BinarySearchTree;

/**
 * Created by matthewconnorday on 18/12/16.
 */
public class Tree {

    BNode root, prevNode;
    boolean left = true;

    public Tree(BNode root) {this.root = root;}

    public void insert(BNode node, int key, int val){
        if(node==null){node = new BNode(key, val);}
        else if(key < node.key){insert(node.leftNode, key, val);}
        else {insert(node.rightNode, key, val);}
    }

    public void delete (BNode node, int key){
        if(key < node.key){prevNode = node; left = true; delete(node.leftNode, key);}
        else if(key > node.key){prevNode = node; left = false; delete(node.rightNode, key);}
        else{/* Delete the node */}
    }
}

