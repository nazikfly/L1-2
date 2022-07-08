public class Son extends GrandFather{
    private String profession;
    private int nine;
    private int five;

    private Son(String profession, int nine, int five) {
        this.profession = profession;
        this.nine = nine;
        this.five = five;
    }

    public Son(String profession, int nine) {
        this.profession = profession;
        this.nine = nine;
    }

    public Son(String profession) {
        this.profession = profession;
    }

    public String getProfession() {
        return profession;
    }
}
