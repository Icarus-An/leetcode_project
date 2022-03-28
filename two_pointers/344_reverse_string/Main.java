public class Main {
  public static void main(String[] args) {
    char []str = {'a','b','c','1','2','3'};
    System.out.println(reverseString(str));
  }

  public static char[] reverseString(char[] str){
    // initialize
    int i=0, j = str.length - 1;
    // two pointers oppsite directions
    while(i < j){
      char temp = str[i];
      str[i] = str[j];
      str[j] = temp;
      i++;
      j--;
    }
    return str;
  }
}
