
public class GreatestNumber {
    public static void main(String[] args) {
        int first=20; 
        int second=50; 
        int third=100; 
        if (first > second) {
            if (first>third) 
            {
             System.out.println(first+" is Greatest.");
            }
             else 
            { 
             System.out.println(third+" is Greatest."); 
            } 
            } else { 
               if (second>third) {
             System.out.println(second+" is Greatest.");
           } else { 
              System.out.println(third+" is Greatest.");
            } 
        }
     }
   }