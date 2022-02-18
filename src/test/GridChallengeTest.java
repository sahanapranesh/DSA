package test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class GridChallengeTest {

    public String solveAlphabeticalGrid(List<String> grid) {
        List<String> sortedList = new ArrayList<>();
        for (String row : grid) {
            StringBuffer finalStringBuffer = new StringBuffer();
            String sortedRow = row.chars().sorted().mapToObj(value -> finalStringBuffer.append((char) value)).toString();

        }
        return null;
    }
}
