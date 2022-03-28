public class Main {
  public static void main(String[] args) {
    System.out.println(getLengthRempvedDup(new int[]{1,2,2,3,3,3,4,5}));
  }
  public static int getLengthRempvedDup(int[] arr){
    // initialize
    int i = 0 ,  j = 1;
    // handle case
    while(j< arr.length){
      if(arr[i] != arr[j]){
        arr[++i] = arr[j];
      }
      j++;
    }
    return i + 1;
  }
}
