package Yang;

/**
 * Created by temp on 3/10/2016.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;

public class Main {

    private static final int NUM_BASKETS = 3;

    /**
     * Drives the reading of the file and generation of output
     */
    public static void main(String[] args) {

        /**
         * Reads in file name and text file.
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name of file: ");
        String fileName = scanner.nextLine();
        fileName += ".txt";

        BufferedReader br = null;
        try{

            br = new BufferedReader(new FileReader(fileName));

        } catch (IOException e) {

            System.out.println("Error while finding text file.");
        }

        /**
         * Creates basket objects while parsing through text file.
         * Continues to add items to each basket as long as there as the line is not null or empty
         */
        for (int i = 0; i < NUM_BASKETS; i++) {
            Basket b = new Basket(i+1);

            try {
                String inputLine = br.readLine();
                while (true) {
                    inputLine = br.readLine();
                    if (inputLine == null) {
                        break;
                    }

                    inputLine = inputLine.trim();
                    if (inputLine.length() == 0) {
                        break;
                    }

                    b.appendItem(inputLine);
                }
            } catch (IOException e) {
                System.out.println("Error while parsing input");
                System.exit(-1);
            }

            /**
             * Gives output.
             */
            b.generateOutput();
        }
    }
}
