import java.util.ArrayList;

//7.14
public class Permutations
{
    public static void main(String[] args)
    {
        String stringToPermute = args[0];

        ArrayList<String> permutations = permute("", stringToPermute);
        for (int i = 0; i < permutations.size(); i++) {
            System.out.println(permutations.get(i));
        }
    }

    public static ArrayList<String> permute(String pre, String stringToPermute) 
    {
        ArrayList<String> returnList = new ArrayList<String>();
        int length = stringToPermute.length();
        if (length == 0) {
            returnList.add(pre);
        }
        else {
            for (int i = 0; i < length; i++) {
                returnList.addAll(permute(pre + stringToPermute.charAt(i),
                                  stringToPermute.substring(0, i) +
                                  stringToPermute.substring(i + 1, length)));
            }     
        }
        return returnList;
    }
}