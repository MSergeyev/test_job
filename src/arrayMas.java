public class arrayMas {
    public static void main(String[] args) {
        int[] array = {0,1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
        for(int i = 0; i<array.length; ++i) {
            if(array[i]%2 !=0) i++;
            System.out.println(array[i]);
            System.out.println("Done1");


        }


        }}