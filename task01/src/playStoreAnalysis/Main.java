package playStoreAnalysis;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {

        FileReader fr = new FileReader(args[0]);
        BufferedReader br = new BufferedReader(fr);

        if (args.length <= 0) {
            System.out.println("Missing CSV file");
            System.exit(1);
        }

        Map <String, storeStats> appStats = new HashMap<>();

        String line; 

        // br.lines return a stream of strings
        line = br.lines().toLowerCase()
            .skip(1) // first line is column name, need to skip
            .filter(line -> !line.contains("NaN")) // NaN stands for "Not A Number" on android play store; not a rating, filter out
            .map(line -> line.split(",")) // to split and make into an array
            .map (col -> new storeStats(col[0].trim(), col[1].trim(), Float.parseFloat(col[2].trim())))
            .collect(Collectors.groupingBy(record -> record.appCategory()))
            .forEach( (String appCategory, List<storeStats> records) -> {
                storeStats stats = new storeStats(appCategory);
                for(storeStats r: records) 
                stats.compute(r);
                appStats.put(appCategory, r);
            });

            for (String info: appStats.keySet()){
                storeStats store = appStats.get(info);
                System.out.println("Category: " + store.category());
                System.out.println("Highest: " + store.getBestApp() + ", " + storeStats.getHighestRating);
                System.out.println("Lowest: " + store.getWorstapp() + ", " + storeStats.getLowestRating);
                System.out.println("Average: " + store.getAverageRating());
                System.out.println("Count: " + (storeStats.getTotal - records.size()));
                System.out.println("Discarded: " + records.size());
            }

    }
}
