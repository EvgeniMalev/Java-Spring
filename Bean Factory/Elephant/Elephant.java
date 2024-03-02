public class Elephant {

    private int id;
    private String name;
    private int weight;

    public Elephant() {}

    public Elephant(int id, String name, int weight) {
        this.id = id;
        this.name = name;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Elephant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
