import java.util.Scanner;

public class ConvertNumToText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your number: ");
        int number = scanner.nextInt();
        int unit = Math.floorMod(number, 10);
        int tenUnit = Math.floorMod(Math.floorDiv(number,10),10);
        int hundredUnit = Math.floorDiv(number,100);

        String numToText = "";

        if (number > 999 || number < 0) {
            numToText = "out of ability";
        } else {
            if (hundredUnit > 0) {
                switch (hundredUnit) {
                    case 1:
                        numToText = "one"; break;
                    case 2:
                        numToText = "two"; break;
                    case 3:
                        numToText = "three"; break;
                    case 4:
                        numToText = "four"; break;
                    case 5:
                        numToText = "fine"; break;
                    case 6:
                        numToText = "six"; break;
                    case 7:
                        numToText = "seven"; break;
                    case 8:
                        numToText = "eight"; break;
                    case 9:
                        numToText = "nine"; break;
                }
                numToText += " hundred and ";
            }

            if (tenUnit != 1) {
                switch (tenUnit) {
                    case 0:
                        numToText += ""; break;
                    case 2:
                        numToText += "twenty "; break;
                    case 3:
                        numToText += "thirty "; break;
                    case 4:
                        numToText += "forty "; break;
                    case 5:
                        numToText += "fifty "; break;
                    case 6:
                        numToText += "sixty "; break;
                    case 7:
                        numToText += "seventy "; break;
                    case 8:
                        numToText += "eighty "; break;
                    case 9:
                        numToText += "ninety "; break;
                }

                switch (unit) {
                    case 0:
                        numToText += ""; break;
                    case 1:
                        numToText += "one"; break;
                    case 2:
                        numToText += "two"; break;
                    case 3:
                        numToText += "three"; break;
                    case 4:
                        numToText += "four"; break;
                    case 5:
                        numToText += "fine"; break;
                    case 6:
                        numToText += "six"; break;
                    case 7:
                        numToText += "seven"; break;
                    case 8:
                        numToText += "eight"; break;
                    case 9:
                        numToText += "nine"; break;
                }
            } else {
                switch (unit) {
                    case 0:
                        numToText += "ten"; break;
                    case 1:
                        numToText += "eleven"; break;
                    case 2:
                        numToText += "twelve"; break;
                    case 3:
                        numToText += "thirteen"; break;
                    case 4:
                        numToText += "fourteen"; break;
                    case 5:
                        numToText += "fifteen"; break;
                    case 6:
                        numToText += "sixteen"; break;
                    case 7:
                        numToText += "seventeen"; break;
                    case 8:
                        numToText += "eighteen"; break;
                    case 9:
                        numToText += "nineteen"; break;
                }
            }

            if (number == 0) numToText = "zero";

        }

        System.out.printf("%s",numToText);

    }
}
