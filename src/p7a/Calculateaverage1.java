package p7a;
import java.util.Scanner;
public class Calculateaverage1
{
	public static void main(String[] args)
	{
        float average =0.0f;
        Scanner sc = new Scanner(System.in);
        Integer ciel, cie2, cie3;
        System.out.println("Enter the score of First Internal:");
        ciel = Integer.parseInt(sc.next());
        System.out.println("Enter the score of Second Internal: ");
        cie2 = Integer.parseInt(sc.next());
        System.out.println("Enter the score of Third Internal: ");
        cie3= Integer.parseInt(sc.next());
        
        average = (float) (ciel + cie2 + cie3)/3;
        System.out.println("The average Internal Score is "+average);
        sc.close();
    }
}


