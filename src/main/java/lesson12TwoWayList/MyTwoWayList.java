package lesson12TwoWayList;

public class MyTwoWayList {

    private Node firstNode;
    private Node lastNode;
    private int size = 0;


    public void add(String value){
        if (firstNode == null){
            lastNode = firstNode = new Node(value);
        }else{
            Node temporaryLastNode = lastNode;
            lastNode = new Node(value, firstNode, temporaryLastNode);
            temporaryLastNode.setNext(lastNode);
            firstNode.setPrevious(lastNode);
        }
        size++;
    }

    public void add(Integer index, String value){

        if(index > size || index < 0){
            throw new IndexOutOfBoundsException("index out of range");
        }

        Node temporaryNode = firstNode;
        if(index == 0){
            Node temporaryFirstNode = firstNode;
            firstNode = new Node(value, temporaryNode, lastNode);
            lastNode.setNext(firstNode);
            temporaryFirstNode.setPrevious(firstNode);
            size++;
        }else if(index == size){
            add(value);
        }else {
            for (int i = 0; i <= index; i++){
                if(i == index){
                    Node temporaryPreviousNode = temporaryNode.getPrevious();
                    Node temporaryNextNode = temporaryNode;
                    temporaryNode = new Node(value, temporaryNextNode, temporaryPreviousNode);
                    temporaryPreviousNode.setNext(temporaryNode);
                    temporaryNextNode.setPrevious(temporaryNode);
                    break;
                }
                temporaryNode = temporaryNode.getNext();
            }
            size++;
        }
    }

    public void remove(Integer index){
        if(index >= size || index < 0){
            throw new IndexOutOfBoundsException("index out of range");
        }

        Node temporaryNode = firstNode;
        for (int i = 0; i <= index; i++){
            if(i == index){
                temporaryNode.getNext().setPrevious(temporaryNode.getPrevious());
                temporaryNode.getPrevious().setNext(temporaryNode.getNext());
                if(index == 0){
                    firstNode = temporaryNode.getNext();
                }
                if(index + 1 == size){
                    lastNode = firstNode.getPrevious();
                }
            }
            temporaryNode = temporaryNode.getNext();
        }
        size--;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Node temporaryNode = firstNode;
        for(int i = 0; i < size*2; i++) {
            stringBuilder.append(temporaryNode.value).append(", ");
            temporaryNode = temporaryNode.next;
            }
        return stringBuilder.toString();
    }

    public void printReversed(){
        StringBuilder stringBuilder = new StringBuilder();
        Node temporaryNode = lastNode;
        for(int i = 0; i < size*2; i++) {
            stringBuilder.append(temporaryNode.value).append(", ");
            temporaryNode = temporaryNode.previous;
        }
        System.out.println(stringBuilder);
    }

    public int size(){
        return size;
    }


    private static class Node {
        private final String value;
        private Node next;
        private Node previous;


        Node(String value) {
            this.value = value;
            this.next = this;
            this.previous = this;
        }

        Node(String value, Node next) {
            this(value);
            this.next = next;
        }

        Node(String value, Node next, Node previous) {
            this(value, next);
            this.previous = previous;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value='" + value + '\'' +
                    '}';
        }

        public Node getNext() {
            return next;
        }

        public Node getPrevious() {
            return previous;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public void setPrevious(Node previous) {
            this.previous = previous;
        }
    }
}