package docs;

public class Doc extends Text {
    @Override
    public String getDescription() {
        return super.getDescription() + ", w formacie .doc";
    }
}
