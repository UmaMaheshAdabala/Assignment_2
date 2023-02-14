import java.util.Scanner;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}
class LinkedList{
    Node head;
    int size;
    LinkedList(){
        this.head=null;
        this.size=0;
    }
    boolean isEmpty(){
        if(this.size==0){
            return true;
        }
        else{
            return false;
        }
    }
    int getsize(){
        return this.size;
    }
    void append(int data){
        Node currentNode=new Node(data);
        if(isEmpty()==true){
            this.head=currentNode;
        }
        else{
            Node pre=this.head;
            while(pre.next!=null){
                pre=pre.next;
            }
            pre.next=currentNode;
        }
        this.size++;
    }
    
    void print(){
        Node currentNode=this.head;
        String list="";
        while(currentNode!=null){
            list+=String.valueOf(currentNode.data);
            list+=" ";
            currentNode=currentNode.next;
        }
        System.out.println(list);
    }
    
    void removedata(){
        Node currentNode=this.head,index=null,t1=null;
        if(this.head==null){
            return;
        }
        while(currentNode!=null){
            t1=currentNode;
            index=currentNode.next;
            while(index!=null){
                if(currentNode.data==index.data){
                    t1.next=index.next;
                }
                else{
                    t1=index;
                }
                index=index.next;
            }
            currentNode=currentNode.next;
        }
    }

}
public class A2T3 {
    public static void main(String[] args) {
        LinkedList task3=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        while(n-->0){
            //int a=sc.nextInt();
            task3.append(sc.nextInt());
        }
        task3.removedata();
        task3.print();

    }
}
