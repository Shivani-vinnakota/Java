import java.util.Scanner;

public class BubbleSortApp {
public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	System.out.println("Enter Array Length");
	int arr[] = new int[scan.nextInt()];
	System.out.println("Enter "+arr.length+" Elements");
	for(int i=0;i<=arr.length-1;i++) {
		arr[i] = scan.nextInt();
	}
	System.out.println("Before Sorting the array");
	for(int x :arr) {
		System.out.print(x+" ");
	}
	System.out.println();
	Sort sort = new Sort();
	sort.bubbleSort(arr);
	System.out.println("After Sorting the array");
	for(int x :arr) {
		System.out.print(x+" ");
	}
	
	
}
}
