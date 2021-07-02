import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Question1 {

    public static void main(String[] args) {
        Map<String, String> phoneBook = new HashMap<>();

        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            phoneBook.put(name,phone+"");
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            String result = phoneBook.getOrDefault(s,null);

            if (result == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + result);
            }

        }
    }

}
