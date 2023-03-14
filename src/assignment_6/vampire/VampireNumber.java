package assignment_6.vampire;

import java.util.Arrays;

public class VampireNumber {
    public boolean isVampireNumber(int num){
        String numberString=String.valueOf(num);  //converts into string
        int length=numberString.length();
        if(length%2!=0){  //should be even
            return false;
        }
        char[] charArray = numberString.toCharArray();
        // Sort the array
        Arrays.sort(charArray);
        // Convert sorted array back to string
        String sortedNumbers = new String(charArray);

        for(int firstFactor=10;firstFactor<=Math.sqrt(num);firstFactor++){
            if(num%firstFactor==0){
                int secondFactor=num/firstFactor;
                if(String.valueOf(firstFactor).endsWith("0") &&  String.valueOf(secondFactor).endsWith("0")){
                    continue;
                }
                String combinedFactor=String.valueOf(firstFactor)+String.valueOf(secondFactor);

                if(combinedFactor.length()!=length){
                    continue;
                }
                char[] charArray2 = combinedFactor.toCharArray();
                // Sort the array
                Arrays.sort(charArray2);
                // Convert sorted array back to string
                String sortedNumbers2 = new String(charArray2);
                if( sortedNumbers.equals(sortedNumbers2)){
                        return true;
                }
            }
        }
        return false;
    }
}
