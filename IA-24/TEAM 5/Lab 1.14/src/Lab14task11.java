import java.io.*;
import java.util.*;

public class Lab14task11 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        String srcPrefix = "D:/мое/progr_repo/PF1_2022/IA-24/Team 5/Lab 1.14/src/chank" ; //default value for debugging
        String destinationFileName = "D:/мое/progr_repo/PF1_2022/IA-24/Team 5/Lab 1.14/src/fulldata.tmp"; //default value for debugging
        if (args.length == 2){
            srcPrefix = args[0];
            destinationFileName = args[1];
        }
        else
        {
            System.out.println("please use as: java Lab14task11.java sourcePrefix destinationFileName");
        }

        System.out.println("All files with prefix '" + srcPrefix + "' and endind between .000 and .999 will be combined to file:\n\t" + destinationFileName);
        try {
            unsplit(srcPrefix, destinationFileName);
        } catch (IOException e) {
            System.out.println("Detected IO error: " + e);
        } catch (Exception e) {
            System.out.println("Unexpected exception: " + e);
        }
    }

    public static void unsplit(String sourcePrefix, String destination) throws Exception {
        if ((sourcePrefix == null) || (destination == null)) {
            throw new NullPointerException("'sourcePrefix' or 'destination' can not be null!");
        }
        if ((sourcePrefix.isEmpty()) || (destination.isEmpty())) {
            throw new IllegalArgumentException ("'sourcePrefix' or 'destination' can not be empty!");
        }
        try (OutputStream fwriter = new FileOutputStream(destination, false)) {
            for(int i = 0; i <= 999; ++i) {
                String srcFileName = sourcePrefix + String.format(".%03d", i);
                File file = new File(srcFileName);
                if (!file.exists()) break;
                try (FileInputStream freader = new FileInputStream(file)) {
                    
                    byte buff[] = new byte[freader.available()];
                    while(freader.available() > 0) {
                        fwriter.write(buff, 0, freader.read(buff));
                    }
                    fwriter.flush();
                }
            }
        }
    }   

}