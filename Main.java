import java.io.*;

public class Main {
    public static void main(String[] args) {
        int c ;
        int count=0;
        boolean word=false;
        String filepath=args[0];
        try (BufferedReader r = new BufferedReader(new FileReader(filepath))) {
            while ((c = r.read()) != -1)
            {
                if (Character.isLetter((char)c))
                    word=true;

                if (Character.isWhitespace((char)c)&&word==true){
                        word=false;
                        count++;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        if (word==true)
            count++;
        System.out.println("Word count: " + count);
}
}
