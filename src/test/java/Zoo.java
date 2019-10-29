public class Zoo {
    public static void main(String[] args) {
        Kind mykind = new Kind();
        mykind.setName("myau");
        mykind.setAge(3);
        mykind.setWeight(5.5);
        System.out.println("Name:\t" + mykind());
        System.out.println("Age:\t" + mykind());
        System.out.println("Weight:\t" + mykind());
    }
}
