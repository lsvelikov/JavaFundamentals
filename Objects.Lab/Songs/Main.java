package ObjectsAndClasses.Lab.Songs;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        List<Song> songsList = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String input = scanner.nextLine();
            String typeList = input.split("_")[0];
            String name = input.split("_")[1];
            String time = input.split("_")[2];

            Song song = new Song(typeList, name, time);
            songsList.add(song);
        }
        String command = scanner.nextLine();
        if (command.equals("all")){
            for (Song song : songsList) {
                System.out.println(song.getName());
            }
        }else{
            for (Song song: songsList) {
                if (song.getTypeList().equals(command)){
                    System.out.println(song.getName());
                }
            }
        }
    }
}
