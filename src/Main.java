import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        int i = 0;
        while (true)
        {
            list.add(reader.readLine());
            if (list.get(i).equals("end"))
            {
                list.remove(list.size()-1);
                break;
            }
            i++;
        }
        for (String j : list)
        {
            System.out.println(j);
        }
    }
}
