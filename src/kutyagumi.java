public class kutyagumi {

    public static void main(String[] args) {
        int tomb[] =new int[100];
        for (int i = 0; i <tomb.length ; i++) {
            tomb[i]=(int)((Math.random()*100)+1);
        }
        System.out.println("a legkisebb ertek: "+minimum(tomb));
        System.out.println(" A tömb legnagyobb eleme: " + maxOfArray(tomb));
        System.out.println(" A páratlan elemek száma: " + oddsNumbersInArray(tomb));
    }

    public static int minimum(int[] tomb){
        int min=Integer.MAX_VALUE;
        for (int i = 0; i < tomb.length; i++) {
            if(tomb[i]<min){
             min=tomb[i];
            }
        }
        return min;
    }
    public static int maxOfArray ( int [] nums) {
        int max= 0;

        for (int i = 0; i < nums.length; i++) {
            if ( max < nums [i]) {
                max = nums [i];
            }

        }
        return max;
    }
    public static int oddsNumbersInArray(int[] nums) {

        int counter = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 != 0) {
                counter++;
            }
        }
        return counter;
    }
}
