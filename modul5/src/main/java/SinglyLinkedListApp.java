package Slinkedlist;
public class SinglyLinkedListApp {
    public static void main(String[] ar){
        SinglyLinkedList newlist = new SinglyLinkedList();
        newlist.insertAwal(100);
        newlist.display();
        newlist.insertAkhir(200);
        newlist.display();
        newlist.insertAwal(50);
        newlist.display();
        newlist.insertAtPos(80, 2);
        newlist.display();
        newlist.deleteAtPos(1);
        newlist.display();
    
    }
    
}