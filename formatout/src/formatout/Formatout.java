
package formatout;


public class Formatout {

    
    public static void main(String[] args) {
        double amount = 12618.98;
        double interestRate = .0013;
        double interest = amount + interestRate;
        
        System.out.println(interest);
        
        System.out.printf("Interest is %4.2f\n", interest); //%d = int %f = float %c = char %b = boolean
        
        System.out.printf("%3d %2s %.8f \n", 1233122, "Java", 3213.242134);
        
        System.out.printf("%8d%8s%8.1f\n", 1234, "Java", 5.42);
        
        System.out.printf("%-8d%-8s%-8.1f\n",1234, "Java", 5.42);

    }
    
}
