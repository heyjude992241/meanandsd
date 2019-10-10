import java.lang.Math;

public class SumAndSD{
    public static void main(String args[]){

        int[] arrays = {1, 5, 8, 10, 12, 6};
        double mean = 0.0;
        double x_x_squared = 0;
        double sd = 0.0;
        int sum=0;

        /**
         * This part of code sums the array and store the valu in variable name sum
         */
        for(int i=0; i<arrays.length; i++){
            sum += arrays[i];
        }

        /**
         * Now we already have the sum from the arrays, We can now calculate the mean
         */

         mean = sum/arrays.length;

         /**
          * So done with mean calculation, Let's proceed with standard deviation calculation. We will do it part by part
          */

          System.out.println("Mean is: " +mean);

          /**
           * Let's find the standard deviation. We will break down the calculation parts
           */

           for(int a=0; a<arrays.length; a++){              
               x_x_squared += Math.pow((arrays[a]-mean), 2);
           }

           /**
            * So we already have the sum of varience. Let's calculate the standard deviation
            */

            sd = Math.sqrt(x_x_squared/(arrays.length-1));
            
            System.out.println("Standard deviation is: " +sd);

    }
}