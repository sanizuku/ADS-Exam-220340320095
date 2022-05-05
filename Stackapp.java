import java.util.Arrays;
import java.util.List;

class Stack{
int[] arr;
int capacity;
int top1,top2;
public Stack(int n){
capacity =n;
arr=new int[n];
top1=-1;
top2=n;
}
public void push1(int key){
if(top1+1==top2)
{
System.out.println("Stack overflow");
System.exit(-1);
}
top1++;
arr[top1]=key;
}
public void push2(int key){
if(top1+1==top2){
System.out.println("Stack is overflow");
System.exit(-1);
}
top2--;
arr[top2]=key;
}
public int pop1(){
if(top1<0)
{
System.out.println("Stack is underflow");
System.exit(-1);
}
int top=arr[top1];
top1--;
return top;
}
public int pop2(){
if(top2<0)
{
System.out.println("Stack is underflow");
System.exit(-1);
}
int top=arr[top2];
top2++;
return top;
}
}
class Stackapp{
public static void main(String[] args){
int[] arr={5,11};
int[] arr1={10,15,7,40};
Stack s=new Stack(arr.length+arr1.length);
for(int i:arr){
s.push1(i);
}
for(int j:arr1){
s.push2(j);
}
System.out.println("Popped element from stack1 is"+ s.pop1());
System.out.println("Popped element from stack2 is"+ s.pop2());
}
}