package docs;

public class Xlsx extends Calc{
    @Override
    public String getDescription() {
        return super.getDescription() + ", w formacie .xlsx";
    }
}
