public class Fruit {
    public String name;


    public Fruit setName(String name) {
        this.name = name;
        return this;
    }



    public String getname(String getname) {
        return getname;
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "name='" + name + '\'' +
                '}';
    }
}
