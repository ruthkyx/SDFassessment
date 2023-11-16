package playStoreAnalysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public static final int COL_APP = 1;
public static final int COL_CATEGORY = 2; 
public static final int COL_RATING = 2; 

public class Main {
    public static void main(String[] args) throws Exception {

        if (args.length <= 0) {
            System.out.println("Missing CSV file");
            System.exit(1);
        }

        

        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);


        Map <String, List<googlePlayStore>> appInfo = new HashMap<>();
        br.readLine().toLowerCase();

        // skip first row: titles
        .skip(1)
        .amp(row -> row.trim().split(","))


        for (String categories : appInfo.keySet()) {

            
            System.out.println();
        }
        

    }
}

/* first read the file -> then map each app (key) to a category (value) */