import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        FileHandler fh = new FileHandler();

        //load tour winners
        ArrayList<Covid19Data> dataSet = fh.loadAllData();

        // display tour winners
        for (Covid19Data data: dataSet) {
            System.out.println(data);
        }
    }
}
