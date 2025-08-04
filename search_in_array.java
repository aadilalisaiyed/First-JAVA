import java.util.*;
class Main {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter element to search ");
        int search = sc.nextInt();
        int idx = -1;
        System.out.print("Enter elements ");
        for(int i=0;i<size;i++)
        {
            if(arr[i]==search)
            {
                idx = i;
                System.out.println("It is present at index "+i);
                return;
            }
            
        }
        if(idx==-1)
        {
                System.out.println("Element is not present in array ");
        }
        
    }
}





