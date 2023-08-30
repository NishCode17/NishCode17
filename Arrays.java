import java.util.Scanner;
public class Arrays{
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        int A[]= new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter the "+(i+1)+" entry :");
            A[i]=sc.nextInt();      
        }
        
        for(int x=0;x<5;x++){
            System.out.println(A[x]);
            
        }
        sc.close();
        
    }
}