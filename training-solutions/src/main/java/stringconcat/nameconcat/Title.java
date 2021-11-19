package stringconcat.nameconcat;

public enum Title {
    MR("Mr."), MRS("Mrs."), DR("dr."), DRS("Dr.");

    public final String title;

    Title(String shortTitle) {
        this.title = shortTitle;
    }

    public String getTitle() {
        return title;
    }
}