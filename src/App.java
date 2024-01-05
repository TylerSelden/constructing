public class App {
    public static void main(String[] args) throws Exception {
        // new piano object
        magicPiano myPiano = new magicPiano();
        System.out.println("My " + myPiano.getBrand() + " " + myPiano.getModel() + " piano has " + myPiano.getKeyCount() + " keys.");
        myPiano.setKeyCount(100);
        System.out.println("Now it has " + myPiano.getKeyCount() + " keys.");
    }
}