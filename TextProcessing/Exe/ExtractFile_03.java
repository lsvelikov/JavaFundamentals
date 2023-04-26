package Fundamentals.TextProcessing.Exe;

import java.util.Scanner;

public class ExtractFile_03 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] data = input.split("\\\\");
        String file = data[data.length - 1];
        String[] fileData = file.split("\\.");
        String fileName = fileData[0];
        String fileExtension = fileData[1];

        System.out.println("File name: " + fileName);
        System.out.println("File extension: " + fileExtension);
    }
}
