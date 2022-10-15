public abstract class Pokemon {

 /*instance variables*/
 private String name;
 private int hp;
 private double height;
 private double weight;
 private int total_stats;

    /*constructors*/

    public Pokemon() {
    }

    public Pokemon(String name, int hp, double height, double weight, int total_stats) {
        this.name = name;
        this.hp = hp;
        this.height = height;
        this.weight = weight;
        this.total_stats = total_stats;
    }

    /*getters & setters*/
    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setTotal_stats(int total_stats) {
        this.total_stats = total_stats;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public int getTotal_stats() {
        return total_stats;
    }

    /*methods*/

    public void name() {
        System.out.println("This pokemon name is" + getName() + " points");
    }

    public void hp() {
        System.out.println(getName() + " got a hp of " + getHp() + " points");
    }

    public void height() {
        System.out.println(getName()+ " height is " + getHeight() + " mtr");
    }

    public void weight() {
        System.out.println(getName()+ " has a weight of " + getWeight() + " kg");
    }

    public void total_stats() {
        System.out.println(getName()+ " total stats are " + getTotal_stats() + " points");
    }

    abstract void weakness();
}
