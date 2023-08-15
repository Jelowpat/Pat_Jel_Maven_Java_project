package lesson12TwoWayList;

public class MyTwoWayList {

    private Node firstNode;

    public void add(String value){
        if (firstNode == null){
            firstNode = new Node(value);
        }else{
            Node temporaryNode = firstNode;
            while(temporaryNode.next != null){
                temporaryNode = temporaryNode.next;
            }
            temporaryNode.next = new Node(value);
        }
    }

    public void add(Integer index, String value){
        Node temporaryNode = firstNode;
        for (int i = 0; i <= index; i++){
            if(i == index){
                temporaryNode.next = new Node(value, temporaryNode.next);
            }
            temporaryNode = temporaryNode.next;
        }
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temporaryNode = firstNode;
        while(temporaryNode != null) {
            stringBuilder.append(temporaryNode.value).append(", ");
            temporaryNode = temporaryNode.next;
            }
        return stringBuilder.toString();
        }


    private class Node {
        private final String value;
        private Node next;


        Node(String value) {
            this.value = value;
        }

        Node(String value, Node next) {
            this.value = value;
            this.next = next;
        }

    }
}