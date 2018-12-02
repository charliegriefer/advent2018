package advent2018.day_02.java;

import java.io.*; 
import java.util.*; 

public class day02 {
    public static void main(String[] args) throws Exception {
        String filePath = new File("").getAbsolutePath();
        Scanner inFile = new Scanner(new File(filePath + "/day_02/input.txt")).useDelimiter("\n");
        List<String> ids = new ArrayList<String>();
        while (inFile.hasNext()) {
            ids.add(inFile.next());
        }

        System.out.println(partOne(ids));
        System.out.println(partTwo(ids));
    }

    public static int partOne(List<String> ids) {
        Set<String> repeat2 = new HashSet<String>();
        Set<String> repeat3 = new HashSet<String>();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        for (String id: ids) {
            for (char letter: alphabet) {
                String tempId = id + " ";
                int result = tempId.split(String.valueOf(letter)).length-1;
                if (result == 2) {
                    repeat2.add(id);
                }
                if (result == 3) {
                    repeat3.add(id);
                }
            }
        }
        return repeat2.size() * repeat3.size();
    }

    public static String partTwo(List<String> ids) {
        String s1, s2, returnValue = "";
        Integer targetLength = ids.get(0).length()-1;
        
        for (int i = 0; i < ids.size(); i++) {
            for (int j = i+1; j < ids.size(); j++) {
                s1 = ids.get(i);
                s2 = ids.get(j);
                returnValue = "";
                for (int k = 0, n = s1.length(); k < n; k++) {
                    if (s1.charAt(k) == s2.charAt(k)) {
                        returnValue += s1.charAt(k);
                    }
                }
                if (returnValue.length() == targetLength) {
                    return returnValue;
                }
            }
        }
        return ""; // should never ever happen
    }

}