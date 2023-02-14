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
    void sort(){
        Node currentNode=this.head,index=null;
        int temp;
        if(currentNode==null){
            return;
        }
        while(currentNode!=null){
            index=currentNode.next;
            while(index!=null){
                if(currentNode.data>index.data){
                    temp=currentNode.data;
                    currentNode.data=index.data;
                    index.data=temp;
                }
                index=index.next;
            }
            currentNode=currentNode.next;
        }
        

    }

}
public class A2T2 {
    public static void main(String[] args) {
        LinkedList task2=new LinkedList();
        LinkedList task2_1=new LinkedList();
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        while(n-->0){
            
            task2.append(sc.nextInt());
        }
        int m=sc.nextInt();
        while(m-->0){
            int s=sc.nextInt();
            task2_1.append(s);
            task2.append(s);
        }
        task2.sort();
        task2.print();

    }
}
