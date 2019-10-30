import org.openqa.selenium.json.JsonOutput;

public class Kind {
    String name;
    int age;
    Double weight;

    public Kind() {

        System.out.println("first K");
    }
    public Kind (String name,int age) {

        System.out.println("Second K");
    }
    public Kind (int age, double weight) {

        System.out.println("Third K");
    }
    public Kind ( double weight) {

        System.out.println("Fourth K");
    }
    public Kind (String name,int age, double weight) {

        System.out.println("Fifth K");
    }

    /**public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    String name;
    int age;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    double weight;*/

}
