import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner S = new Scanner(System.in);

        //getting a string input
        System.out.println("Enter the String :\n");
        String str = S.nextLine();

        //first letter input
        System.out.println("Enter the first letter need to be searched :\n");
        char firstLetter = S.next().charAt(0);

        //last letter input
        System.out.println("Enter the last letter need to be searched :\n");
        char lastLetter = S.next().charAt(0);

        int firstLetterCount = 0;
        int lastLetterCount = 0;
        int bothLetter = 0;

        String [] words = str.split(" ");

        for (int r = 0; r<words.length; r++) {

                if(words[r].startsWith(String.valueOf(firstLetter))){
                    firstLetterCount++;
                }

                if(words[r].endsWith(String.valueOf(lastLetter))){
                    lastLetterCount++;
                }

                if((words[r].startsWith(String.valueOf(firstLetter))) && (words[r].endsWith(String.valueOf(lastLetter)))){
                    bothLetter++;
                }

        }

        System.out.println("Number of words starts with " +firstLetter+ " is "+firstLetterCount);
        System.out.println("Number of words ends with " +lastLetter+ " is "+lastLetterCount);
        System.out.println("Number of words have both " +firstLetter +" "+ lastLetter + " is "+bothLetter);


    }

}
