package docs;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<DocumentItem> files = new ArrayList<>();
        files.add(new DocumentItem());
        files.add(new Text());
        files.add(new Doc());
        files.add(new Docx());
        files.add(new Calc());
        files.add(new Xls());
        files.add(new Xlsx());
        files.add(new Image());
        files.add(new Jpg());
        files.add(new Jpeg());

        for (DocumentItem file : files) {
            System.out.println(file.getDescription());
        }
    }
}
