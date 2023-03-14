package assignment_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class PingHostMethod {
    double runPing(String url,String rounds) throws IOException {
        MedianOfPings median = new MedianOfPings();
        ArrayList<Double> roundTripTimes = new ArrayList<>();
        ProcessBuilder processBuilder = new ProcessBuilder("ping", "-n", rounds, url);
        Process process = processBuilder.start();
        BufferedReader inputStream = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String outputLine;
        while ((outputLine = inputStream.readLine()) != null) {
            if (outputLine.contains("time=")) {
                String rttString = outputLine.substring(outputLine.indexOf("time=") + 5, outputLine.indexOf("ms"));
                double time = Long.parseLong(rttString);
                roundTripTimes.add(time);
            }
        }
        return median.median( roundTripTimes);
    }
}
