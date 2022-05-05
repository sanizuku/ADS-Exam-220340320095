
import java.util.Scanner;
public class insertionSort{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the no of elements");
int n=sc.nextInt();
int[] a1=new int[n];
System.out.print("Enter the elements");
for(int i=0;i<n;i++)
a1[i]=sc.nextInt();
insertion(a1,n);
Display(a1);
}
static void insertion(int[] a1,int n){
for(int i=0;i<n-1;i++){
for(int j=i+1;j>0;j--){
if(a1[j]<a1[j-1]){
swap(a1,j,j-1);
}
else 
break;
}

}
}
static void swap(int[] a1,int first,int second){
int temp=a1[first];
a1[first]=a1[second];
a1[second]=temp;
}
static void Display(int[] a1){
	for(int i=0;i<a1.length;i++){
System.out.print(a1[i]+" ");

	}
}
}