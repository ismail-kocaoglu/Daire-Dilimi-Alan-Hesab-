import java.util.Scanner;
public class Main {
    public static void main (String[] args){

        Scanner input = new Scanner(System.in);

        int yCap, Drc;

        double alan,pi=3.14;

        System.out.print("Yarıçapı giriniz: ");

        yCap= input.nextInt();

        System.out.print("Daire açısını giriniz: ");

        Drc = input.nextInt();

        alan= (pi*yCap*yCap*Drc)/360;

        System.out.print("Daire diliminin alanı: " +alan);








    }


}

