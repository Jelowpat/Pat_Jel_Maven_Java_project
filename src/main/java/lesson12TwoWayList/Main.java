package lesson12TwoWayList;

public class Main {

    public static void main(String[] args) {
        MyTwoWayList mylist = new MyTwoWayList();
        mylist.add("1");
        mylist.add("2");
        mylist.add("3");
        mylist.add("4");
        mylist.add("5");
        mylist.add("6");
        mylist.add("7");
        mylist.remove(4);
        System.out.println(mylist); //displays list twice, to check if last and first nodes are connected properly
        mylist.printReversed();  //displays list twice, to check if last and first nodes are connected properly
        mylist.remove(0);
        System.out.println(mylist);
        mylist.printReversed();
        mylist.remove(4);
        System.out.println(mylist);
        mylist.printReversed();
        mylist.add(0,"01");
        System.out.println(mylist);
        mylist.printReversed();
        mylist.add(3,"23");
        System.out.println(mylist);
        mylist.printReversed();
        mylist.add(3,"23");
        System.out.println(mylist);
        mylist.printReversed();
        mylist.add("8");
        System.out.println(mylist);
        mylist.printReversed();
        mylist.add("9");
        System.out.println(mylist);
        mylist.printReversed();
        mylist.add("10");
        System.out.println(mylist);
        mylist.printReversed();

    }

}
