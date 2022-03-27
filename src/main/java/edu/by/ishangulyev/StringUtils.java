package edu.by.ishangulyev;

public class StringUtils {
    public static boolean isPositiveNumber(String number){
        return isNumber(number) && isPositive(number);
    }
    private static boolean isNumber(String str){
        boolean result;
        try{
            Integer.parseInt(str);
            result = true;
        }
        catch (NumberFormatException e){
            result = false;
        }
        return result;
    }

    private static boolean isPositive(String str){
        return str.charAt(0) != '-';
    }
}

