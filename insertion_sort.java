import java.util.Scanner;

public class insertion_sort {
    void sort(int arr[]){
        int n=arr.length;
        for(int i=1;i<n;++i){
            int key=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i< arr.length;i++){
            System.out.print(arr[i]+" ");
            //System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the array elements");
        int arr[]=new int[5];
        for(int i=0;i< arr.length;i++){
            arr[i]=sc.nextInt();
        }
        insertion_sort ob=new insertion_sort();
        ob.sort(arr);
        printArray(arr);
    }
}
