import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileHandler {
    private final File file = new File("11_noegletal_pr_region_pr_aldersgruppe_test2.csv");

    public ArrayList<Covid19Data> loadAllData() {
        ArrayList<Covid19Data> dataSet = new ArrayList();
        Scanner sc = null;
        try {
            sc = new Scanner(file);
            //sc.nextLine();  // Skip første linje

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        Covid19Data data = null;
        while (sc.hasNext()) {
            String line = sc.nextLine();    // Split linje og læg tokens i attributter
            String[] attributes = line.split(";");
            data = new Covid19Data(
                    (attributes[0]), // region
                    (attributes[1]), // aldersgruppe
                    (Integer.parseInt(attributes[2])), // bekraeftede_tilfaelde
                    (attributes[3]), // doede
                    (Integer.parseInt(attributes[4])), // indlagte_intensiv
                    (Integer.parseInt(attributes[5])), // indlagte
                    (attributes[6]) // dato
            );


            /*
            private String region;
            private String aldersgruppe;
            private int bekraeftede_tilfaelde;
            private String doede;
            private int indlagte_intensiv;
            private int indlagte;
            private String dato;
            //(Integer.parseInt(attributes[0]))
             */

            dataSet.add(data);

        }
        sc.close();
        return dataSet;
    }

}
