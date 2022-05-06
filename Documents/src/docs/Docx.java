package docs;

public class Docx extends Text{
    @Override
    public String getDescription() {
        return super.getDescription() + ", w formacie .docx";
    }
}
