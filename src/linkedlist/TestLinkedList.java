package linkedlist;

public class TestLinkedList {
    public static void main(String args[]){
        Node<String> parentNode = createNewNode("Hello");
        addNewNodeAtEnd(createNewNode("Sandeep"),parentNode);
        addNewNodeAtEnd(createNewNode("Sowmya"),parentNode);
        addNewNodeAtEnd(createNewNode("Srinika"),parentNode);
        addNewNodeAtEnd(createNewNode("Sudhakar"),parentNode);
        addNewNodeAtEnd(createNewNode("Sandhya"),parentNode);

        printLinkedList(parentNode);
        Node<String> reverseLinkedList = reverseLinkedList(parentNode);
        printLinkedList(reverseLinkedList);
    }

    private static Node<String> reverseLinkedList(Node<String> parentNode) {
        Node prev = null;
        Node current = parentNode;
        Node next = null;
        while (current != null) {
            next = current.getReference();
            current.setReference(prev);
            prev = current;
            current = next;
        }
        parentNode = prev;
        return parentNode;
    }

    private static void printLinkedList(Node<String> linkedList) {
        while (linkedList.getReference()!=null){
            System.out.println(linkedList.getT());
            linkedList=linkedList.getReference();
        }
        if(linkedList.getReference()==null)
            System.out.println(linkedList.getT());
    }

    private static Node<String> addNewNodeAtEnd(Node<String> newNode, Node<String> existingLinkedList) {
        while (existingLinkedList.getReference()!=null){
            existingLinkedList=existingLinkedList.getReference();
        }
        existingLinkedList.setReference(newNode);
        return existingLinkedList;
    }

    private static Node<String> createNewNode(String nodeStr) {
        Node<String> newNode = new Node<>();
        newNode.setT(nodeStr);
        return newNode;
    }
}
