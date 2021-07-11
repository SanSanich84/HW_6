package HomeWork_6.Lagacy;

public class Animal {
    protected String color;
    protected String name;
    protected String type;

    public void Swimm(int swim_distance){ System.out.printf("%s %s %s проплыл %d метров\n", this.color, this.type, this.name, swim_distance); }
    public void Wolk(int wolk_distance){ System.out.printf("%s %s %s пробежал %d метров\n", this.color, this.type, this.name, wolk_distance); }

}
