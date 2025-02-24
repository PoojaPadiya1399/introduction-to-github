import java.io.*;


public class FileReverser {

    public static void main(String args[]) throws IOException {
       /* BufferedReader reader = new BufferedReader(
                new FileReader("C:\\Users\\t657075\\UBS\\Dev\\Pooja\\modelfeed_change_testing.txt"));
        String line;


        BufferedWriter writer = null;
        FileWriter fileWriter = new FileWriter("C:\\Users\\t657075\\UBS\\Dev\\Pooja\\modelfeed_change_testing.txt");


      */
        RandomAccessFile randomAccessFile = new RandomAccessFile(new File("C:\\Users\\t657075\\UBS\\Dev\\Pooja\\modelfeed_change_testing.txt"),"r");
        System.out.println(randomAccessFile.getFilePointer());
        System.out.println(randomAccessFile.length());
        /*

        while ((line = reader.readLine()) != null) {
            System.out.println("--------------------------------------------------------------------");
            System.out.println(line);
            System.out.println("--------------------------------------------------------------------");

         *//*   StringBuilder sb = new StringBuilder();
            sb.append(line);
            String reverseline = sb.reverse().toString();
            writer = new BufferedWriter(fileWriter);*//*

        }
*/

        ReverseLineImpl fr = new ReverseLineImpl(new File("\\TEST.txt"));
        BufferedReader in = new BufferedReader (new InputStreamReader (fr));

        BufferedWriter writer = null;
        FileWriter fileWriter = new FileWriter("Reverse_TEST.txt");

        while(true) {
            String line1 = in.readLine();

            writer.append(line1);
            System.out.println("Writing text in reverse file: " + line1);
            if (line1 == null) {
                break;
            }

        }
        fr.close();
        fileWriter.close();

    }
}
