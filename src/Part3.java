import java.util.Scanner;

public class Part3 {
    boolean twoOccurrences (String stringa, String stringb){
      int occurrence1 = stringb.indexOf(stringa);
      int occurrence2 = stringb.indexOf(stringa,occurrence1 + 1);
      return  (occurrence1 != -1 && occurrence2 != -1) ? true : false;
    }

    void testing(){
        Scanner scan = new Scanner(System.in);
        String String1 = scan.nextLine();
        String String2 = scan.nextLine();
        System.out.println(twoOccurrences(String1,String2));
        System.out.println(lastPart(String1,String2));
    }

    String lastPart(String string1, String string2){
        int occurrence = string2.indexOf(string1);
        if (occurrence != -1) {
            return string2.substring(occurrence + string1.length());
        } else
            return string2;
    }
    public static void main(String[] args) {
        Part3 test = new Part3();
        test.testing();
    }
}
