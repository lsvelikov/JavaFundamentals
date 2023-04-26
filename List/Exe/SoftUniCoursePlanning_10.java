package Fundamentals.List.Exe;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class SoftUniCoursePlanning_10 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<String> lessonsList = Arrays.stream(scanner.nextLine().split(", ")).collect(Collectors.toList());
        String input = scanner.nextLine();

        while (!input.equals("course start")) {
            String command = input.split(":")[0];
            String lessonTitle = input.split(":")[1];

            switch (command) {
                case "Add":
                    if (!lessonsList.contains(lessonTitle)) {
                        lessonsList.add(lessonTitle);
                    }
                    break;
                case "Insert":
                    int index = Integer.parseInt(input.split(":")[2]);
                    if (!lessonsList.contains(lessonTitle)) {
                        if (index >= 0 && index <= lessonsList.size()) {
                            lessonsList.add(index, lessonTitle);
                        }
                    }
                    break;
                case "Remove":
                    if (lessonsList.contains(lessonTitle)) {
                        lessonsList.remove(lessonTitle);
                    }
                    int indexOfLessonTitle = lessonsList.indexOf(lessonTitle);
                    if (lessonsList.get(indexOfLessonTitle + 1).equals(lessonTitle + "-Exercise")) {
                        lessonsList.remove(indexOfLessonTitle + 1);
                    }
                    break;
                case "Swap":
                    String lessonToSwap = input.split(":")[2];
                    if (lessonsList.contains(lessonTitle) && lessonsList.contains(lessonToSwap)) {
                        int indexOldLesson = lessonsList.indexOf(lessonTitle);
                        int indexLessonToSwap = lessonsList.indexOf(lessonToSwap);
                        lessonsList.set(indexOldLesson, lessonToSwap);
                        lessonsList.set(indexLessonToSwap, lessonTitle);

                        String exercise1 = lessonTitle + "-Exercise";
                        String exercise2 = lessonToSwap + "-Exercise";
                        if (lessonsList.contains(exercise1)){
                            lessonsList.remove(lessonsList.indexOf(exercise1));
                            lessonsList.add((indexLessonToSwap + 1), exercise1);
                        }
                        if (lessonsList.contains(exercise2)){
                            lessonsList.remove(lessonsList.indexOf(exercise2));
                            lessonsList.add((indexOldLesson + 1), exercise2);
                        }

                    }
                    break;
                case "Exercise":
                    String exercise = lessonTitle + "-Exercise";
                    int indexLessonTitle = lessonsList.indexOf(lessonTitle);
                    if (lessonsList.contains(lessonTitle)) {
                        if (indexLessonTitle == lessonsList.size() - 1) {
                            lessonsList.add(indexLessonTitle + 1, exercise);
                        } else if (!lessonsList.get(indexLessonTitle + 1).equals(exercise)) {
                            lessonsList.add(indexLessonTitle + 1, exercise);
                        }
                    } else {
                        lessonsList.add(lessonTitle);
                        lessonsList.add(exercise);
                    }
                    break;
            }

            input = scanner.nextLine();
        }
        for (int i = 0; i < lessonsList.size(); i++) {
            System.out.println(i + 1 + "." + lessonsList.get(i));
        }
    }
}
