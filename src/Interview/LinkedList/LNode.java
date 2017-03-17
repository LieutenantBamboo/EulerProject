package Interview.LinkedList;

/**
 * Created by matthewconnorday on 18/12/16.
 */
public class LNode {

    public String name;
    public LNode nextNode;

    public LNode(String name){
        this.name = name;
    }

    // Insert Functions

    public void insertAfter(LNode node, LNode newNode){
        newNode.nextNode = node.nextNode;
        node.nextNode = newNode;
    }

    public void insertAtBeginning(LList list, LNode newNode){
        newNode.nextNode = list.firstNode;
        list.firstNode = newNode;
    }

    // Remove functions

    public void removeAfter(LNode node){
        LNode obsoleteNode = node.nextNode;
        node.nextNode = obsoleteNode.nextNode;
        obsoleteNode = null;
    }

    public void removeAtBeginning(LList list){
        LNode obsoleteNode = list.firstNode;
        list.firstNode = obsoleteNode.nextNode;
        obsoleteNode = null;
    }

    // Getter methods

    public String getName() {return name;}

    public LNode getNextNode() {return nextNode;}

    // Setter methods

    public void setName(String name){this.name = name;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LNode lNode = (LNode) o;

        if (!name.equals(lNode.name)) return false;
        return nextNode != null ? nextNode.equals(lNode.nextNode) : lNode.nextNode == null;
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + (nextNode != null ? nextNode.hashCode() : 0);
        return result;
    }
}