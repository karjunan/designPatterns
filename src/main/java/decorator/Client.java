package decorator;

public class Client {

    public static void main(String[] args) {
        ChristmasTree christmasTree = new ChristmasTreeImpl();
        ChristmasTree lights = new ChristmasLights(new ChristmasLights(christmasTree));
        ChristmasTree papers = new ChristmasPapers(new ChristmasPapers(lights));
        ChristmasTree lights1 = new ChristmasLights(new ChristmasLights(papers));
        String tree = lights1.decorate();


        System.out.println(tree);

    }
}
