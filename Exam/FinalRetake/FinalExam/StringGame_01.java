package Fundamentals.Exam.FinalRetake.FinalExam;

import java.util.Scanner;

public class StringGame_01 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();
        String command = scanner.nextLine();

        while (!command.equals("Done")){
            String[] data = command.split("\\s+");

            switch (data[0]){
                case "Change":
                    String stringToReplace = data[1];
                    String replacement = data[2];
                    text = text.replaceAll(stringToReplace, replacement);
                    System.out.println(text);
                    break;
                case "Includes":
                    String substring = data[1];
                    if (text.contains(substring)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "End":
                    String endSubstring = data[1];
                    if (text.endsWith(endSubstring)){
                        System.out.println("True");
                    }else{
                        System.out.println("False");
                    }
                    break;
                case "Uppercase":
                    text = text.toUpperCase();
                    System.out.println(text);
                    break;
                case "FindIndex":
                    String stringToFind = data[1];
                    int index = text.indexOf(stringToFind);
                    System.out.println(index);
                    break;
                case "Cut":
                    int startIndex = Integer.parseInt(data[1]);
                    int count = Integer.parseInt(data[2]);
                    text = text.substring(startIndex, startIndex + count);
                    System.out.println(text);
                    break;
            }


            command = scanner.nextLine();
        }
    }
}
