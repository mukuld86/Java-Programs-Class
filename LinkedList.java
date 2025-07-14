import java.util.*;

public class Main {
  public static class Node{
    int data;
    Node next;
    Node(int data){
      this.data=data;
      this.next=null;
    }
  }
    public static Node insertEnd(Node head,int data){
      Node newNode = new Node(data);
      if(head==null){
        head=newNode;
        return head;
      }
      Node temp=head;
      while(temp.next!=null){
        temp=temp.next;
      }
      temp.next=newNode;
      return head;
    }
    public static void printList(Node head){
      if(head==null){
        System.out.println("List is empty");
        return;
      }
      Node temp=head;
      while(temp!=null){
        System.out.print(temp.data+" ");
        temp=temp.next;
      }
      System.out.println();
    }
    
    public static Node delete(Node head, int key){
      if(head==null){
        System.out.println("List already empty");
        return null;
      }
      Node curr=head;
      Node prev=null;
      while(curr.data!=key && curr!=null){
        prev=curr;
        curr=curr.next;
      }
      if(curr==null){
        System.out.println("No Node has the specified value to delete");
        return null;
      }
      prev.next=curr.next;
      return head;
      
    }
    
    public static void main(String[] args) {
      Node head = null;
      head = insertEnd(head, 1);
      head = insertEnd(head, 2);
      head = insertEnd(head, 3);
      head = insertEnd(head, 4);
      head = insertEnd(head, 5);
      head = insertEnd(head, 6);
      head = insertEnd(head, 7);
      head = insertEnd(head, 8);
      head = insertEnd(head, 9);
      head = insertEnd(head, 10);
      printList(head);
      head = delete(head, 5);
      printList(head);
      
  }
}