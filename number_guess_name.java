import java.util.*;
class Main {
    public static void main(String[] args) {
        System.out.print("Enter num ");
        int num=0;
        boolean found = false;
        Scanner sc = new Scanner(System.in);
        int r = (int)(Math.random()*100)+1;
        while(r != num)
        {
            System.out.println("Guess The value of num: (1-100)");
            num = sc.nextInt();
            if(num>r) System.out.println("Number is Smaller, Try Again...");
            else if(num<r) System.out.println("Number is Greater, Try Again...");
            if(num <0) 
            {
                break;
            }
            if(num == r)
            {
                found = true;
            }
            
        }
        System.out.println((found)?"Wow! You Found That Correct!":"Try Next time...");
    }
}