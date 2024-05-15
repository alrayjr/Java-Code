
package lab2;


public class Lab2 {

static int countOccurrences(int arr[], int n, int x)
    {
        int cnt = 0;
        for (int i=0; i<n; i++)
            if (x == arr[i])
              cnt++;
        return cnt;
    }

    public static void main(String[] args) {
        int[] x = new int[30];
        //int count = 0;
       for(int i=0; i<30; i++)
       {
            x[i] = (int)Math.floor(Math.random()*(100)+1);
            System.out.println(x[i] + " Occurs " + countOccurrences(x,x.length,x[i]) + " Times");
       }
        
 
            
       
       
    }
}
