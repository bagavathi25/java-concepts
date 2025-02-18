public class ArrayExample{
    public static void main(String[] args){
        int[] arr={1,2,3,4,5};
        System.out.println("first element"+arr[0]);
        System.out.println("second element"+arr[1]);
        arr[1]=10;
        System.out.println("Modified element"+arr[1]);
        int arraylength=arr.length;
        System.out.println("array length"+arr);
        System.out.println("Using for loop");
        for(int i=0;i<arr.length;i++){
          System.out.println("Element at index"+i+":"+ arr[i]); 

          

        }

        }


}
