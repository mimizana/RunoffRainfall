import java.util.Scanner;

public class RunoffRainfall {
    public static void main (String[]args){


        Scanner scan = new Scanner(System.in);
        System.out.println(" What is your roof Dimension 1?");
        int dimension1 = scan.nextInt();
        System.out.println(" What is your roof Dimension2?");
        int dimension2 = scan.nextInt();
        int dimension1Inch = dimension1*12;
        int dimension2Inch = dimension2*12;
        int numberOFInches = dimension1Inch * dimension2Inch *1;
        int waterRun = numberOFInches/231;

        System.out.println("Amount of water runs off a roof in a rain storm equals:"+ waterRun);




    }
}
