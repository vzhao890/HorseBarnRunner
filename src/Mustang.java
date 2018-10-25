public class Mustang implements Horse {
    private int weight;
    private String name;
    public Mustang(String name, int weight)
    {
        this.name=name;
        this.weight=weight;
    }

    public String getName()
    {
        return this.name;
    }

    public int getWeight()
    {
        return this.weight;
    }
}