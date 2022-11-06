package ObjectsAndClasses.Exe.Articles;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] data = input.split(", ");
        String title = data[0];
        String content = data[1];
        String author = data[2];

        Article article = new Article(title, content, author);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            String command = scanner.nextLine();

            if (command.contains("Edit")){
                String newContent = command.split(": ")[1];
                article.edit(newContent);
            } else if (command.contains("Rename")){
                String newTitle = command.split(": ")[1];
                article.rename(newTitle);
            } else if (command.contains("ChangeAuthor")){
                String newAuthor = command.split(": ")[1];
                article.changeAuthor(newAuthor);
            }
        }
        System.out.println(article.toString());
    }
}
