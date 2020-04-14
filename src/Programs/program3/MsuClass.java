package Programs.program3;

public class MsuClass {
    String name;
    private int sects;
    private int seats;
    String title;
    String whenWhere;
    String prof;

    public MsuClass(String name, int sects, int seats, String title, String whenWhere, String prof) {
        this.name = name;
        this.sects = sects;
        this.seats = seats;
        this.title = title;
        this.whenWhere = whenWhere;
        this.prof =prof;
    }

    public String getName() {
        return name;
    }

    public String getProf() { return prof; }

    public void addSeats(int add) {
        seats += add;
    }

    public void addSects(int add) {
        sects += add;
    }

    @Override
    public String toString() {
        String out = null;
        return out.format("%10s %6s %8s %36s %36s", name, sects, seats, title, whenWhere);
    }

    public String getWhenWhere() {
        return whenWhere;
    }

}
