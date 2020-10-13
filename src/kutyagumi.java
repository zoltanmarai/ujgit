public class kutyagumi {

    public static void main(String[] args) {
        int tomb[] =new int[100];
        for (int i = 0; i <tomb.length ; i++) {
            tomb[i]=(int)((Math.random()*100)+1);
        }
        System.out.println("a legkisebb ertek: "+minimum(tomb));
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
}
