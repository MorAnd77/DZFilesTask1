import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();

        File dirSrc = new File("E://Games/src");
        if (dirSrc.mkdir()) {
            sb.append("Создан каталог - " + dirSrc.getName() + '\n');
        }

        File dirMain = new File("E://Games/src/main");
        if (dirMain.mkdir()) {
            sb.append("Создан каталог - " + dirMain.getName() + '\n');
        }

        File dirTemp = new File("E://Games/temp");
        if (dirTemp.mkdir()) {
            sb.append("Создан каталог - " + dirTemp.getName() + '\n');
        }

        try {
            new File(dirMain, "Main.java").createNewFile();
            new File(dirMain, "Utils.java").createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (dirMain.isDirectory()) {
            for (File item : dirMain.listFiles()) {
                if (item.isDirectory()) {
                    sb.append("Создан каталог -" + item.getName() + '\n');
                } else {
                    sb.append("Создан файл - " + item.getName() + '\n');
                }
            }
        }

        File dirTest = new File("E://Games/src/test");
        if (dirTest.mkdir()) {
            sb.append("Создан каталог - " + dirTest.getName() + '\n');
        }

        File dirRes = new File("E://Games//res");
        if (dirRes.mkdir()) {
            sb.append("Создан каталог - " + dirRes.getName() + '\n');
            new File("E://Games/res/drawables").mkdir();
            new File("E://Games/res/vectors").mkdir();
            new File("E://Games/res/icons").mkdir();
        }

        if (dirRes.isDirectory()) {
            for (File item : dirRes.listFiles()) {
                if (item.isDirectory()) {
                    sb.append("Создан каталог -" + item.getName() + '\n');
                } else {
                    sb.append("Создан файл - " + item.getName() + '\n');
                }
            }
        }

        File dirSavegames = new File("E://Games/savegames");
        if (dirSavegames.mkdir()) {
            sb.append("Создан каталог - " + dirSavegames.getName() + '\n');
        }

        File file = new File("E://Games/temp", "temp.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (dirTemp.isDirectory()) {
            for (File item : dirTemp.listFiles()) {
                if (item.isDirectory()) {
                    sb.append("Создан каталог -" + item.getName() + '\n');
                } else {
                    sb.append("Создан файл - " + item.getName() + '\n');
                }
            }
        }

        try (FileWriter writer = new FileWriter(file, false)) {
            writer.write(String.valueOf(sb));
            writer.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
