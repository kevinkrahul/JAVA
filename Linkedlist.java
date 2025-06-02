class Node{
    Node next;
    int data;

    Node(int data){
        this.data=data;
        this.next=null;

    } 
}

class LinkedList{

    Node head;
    public void add(int data){
        Node newNode=new Node(data);
        if(head==null){
            head=newNode;
            return;
        }else{
            Node current=head;
            while(current.next!=null){
                current=current.next;
            }
            current.next=newNode; 

        }
    }

    public void display(){
        Node current=head;
        if(current==null){
            System.out.println("List is empty");
            return;
        }
        while(current!=null){
            System.out.print(current.data+" ");
            current=current.next;
        }
        System.out.println("Null");

    }
}

class Llist{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.add(10);
        list.add(20); 
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.display();
    }
}