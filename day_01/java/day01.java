package advent2018.day_01.java;

import java.io.*; 
import java.util.*;

public class day01 {
    public static void main(String[] args)throws Exception {
        String filePath = new File("").getAbsolutePath();
        Scanner inFile1 = new Scanner(new File(filePath + "/day_01/input.txt")).useDelimiter("\n");
        List<Integer> nums = new ArrayList<Integer>();
        while (inFile1.hasNext()) {
            nums.add(Integer.parseInt(inFile1.next()));
        }

        System.out.println(part_one(nums));
        System.out.println(part_two(nums));
    }

    public static int part_one(List<Integer> numList) {
        int sum = 0;
        for (int n: numList) {
            sum += n;
        }
        return sum;
    }

    public static int part_two(List<Integer> numList) {
        int returnVal = 0;
        
        Set<Integer> frequencies = new HashSet<Integer>();
        int frequency = 0;
        frequencies.add(frequency);

        boolean found = false;
        while (!found) {
            for (int n: numList) {
                frequency += n;
                if (frequencies.contains(frequency)) {
                    returnVal = frequency;
                    found = true;
                    break;
                } else {
                    frequencies.add(frequency);
                }
            }
        }
        return returnVal;
    }
}