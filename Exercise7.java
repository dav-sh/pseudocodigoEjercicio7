import java.util.*;
public class Exercise7{
    public static void main(String[] args){
        Random rand = new Random();
        int odd =0;
        int even =0;
        int zero =0;
        for(int i=0;i<15;i++){
            int n = rand.nextInt(36);
            if(n ==0){
                zero++;
            }
            else if(n%2==0){
                odd++;
            }
            else{
                even++;
            }
            System.out.println("n: " + n);
        }
        System.out.println("percentage of odd numbers: "+((odd*100)/15.00));
        System.out.println("percentage of even numbers: "+((even*100)/15.00));
        System.out.println("percentage of zero numbers: "+((zero*100)/15.00));
    }
}