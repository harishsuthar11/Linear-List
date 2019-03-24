import java.util.*;
class List
{
void add(int j)
 {
    ListObject<Integer> ob=new ListObject<Integer>(j);
 if(j==1)
 {
  head=ob;
   tail=ob;
   
 }
 
 else
  {

   tail.next=ob;
   tail=ob;
  }
}




  void  Traverse()
{ ListObject<Integer> ob1=head;
   
 while(ob1!=null)
 {
  System.out.println(ob1);
  ob1=ob1.next;
  }
  }
  
 
ListObject<Integer> head=null;
ListObject<Integer> tail=null;
public static void main(String args[])
{
Scanner ob=new Scanner("System.in");
System.out.println("enter  length of the list");
List d=new List();
int i=ob.nextInt();
 for(int j=0;j<i;j++)
 {
  d.add(j);

 } 
 d.Traverse();
}

}
