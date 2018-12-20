package changer;

import java.util.Scanner;
// Hendrik Emunds  

public class Changer {
    public static String unit_start;
    public static String unit_end;
    public static double value_start;

    public static void main(String[] args) {
        
    }
    
    public static String getUnit(String d){
        String x = null;
        boolean mm = false;
        boolean cm = false;
        boolean m = false;
        boolean km = false;
        
        if("mm".equals(d))mm = true;
        if("cm".equals(d))cm = true;
        if("m".equals(d))m = true;
        if("km".equals(d))km = true;
        
        if(mm == true)x = "mm";
        if(cm == true)x = "cm";
        if(m == true)x = "m";
        if(km == true)x = "km";
        return x;
    }
    public static String inputUnit(){
        String input = null;
        Scanner sc = new Scanner(System.in);
        input = sc.nextLine();
        return input;
    }
    public static double inputValue(){
        double input;
        Scanner sc = new Scanner(System.in);
        input = sc.nextDouble();
        return input;
    }
    public static void change(double x, String d, String e){
        unit_start = getUnit(inputUnit());
        unit_end = getUnit(inputUnit());
        value_start = inputValue();
        
       
    }
    public static void mmTOcm(double x){
        x = x * 10;
    }
    public static void mmTOm(double x){
        x = x
    }
}
