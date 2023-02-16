import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Word {
    ArrayList<String> list = new ArrayList<>();

    public void enterList() throws FileNotFoundException {

        String PATH = "C:\\Users\\Пользователь\\OneDrive\\Рабочий стол\\wordList.txt";

        File file = new File(PATH);
        Scanner scanner = new Scanner(file);


        while (scanner.hasNext()) {

            list.add(scanner.next());

        }
        scanner.close();
    }

    public void letterEnter() throws FileNotFoundException {
        enterList();

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву");
        String letter = scanner.nextLine();

        int counter = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).charAt(0) == letter.charAt(0)) {
                System.out.println(list.get(i));
                counter++;
            }
        }
        if (counter == 0) {
            System.out.println("Нет слова на такую букву, добавьте его!");
            Scanner scanner1 = new Scanner(System.in);
            String newLetter = scanner1.nextLine();
            list.add(newLetter);
            System.out.println(list);
        }
    }
}

