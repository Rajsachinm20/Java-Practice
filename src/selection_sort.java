import java.util.Scanner;

public class selection_sort {
    public static void main(String[] args) {
        int i;
        Scanner sc=new Scanner(System.in);
        int arr[] = new int[5];
        System.out.println("enter the elements int array");
        for ( i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();

        }
        for ( i=0;i<arr.length-1;i++){
            int min=i;
            for (int j=i+1;j< arr.length;j++){
                if (arr[j]<arr[min]){
                    min=j;
                }

            }
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;

            }
        System.out.println("sorted array");
        for (i=0;i<arr.length;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
