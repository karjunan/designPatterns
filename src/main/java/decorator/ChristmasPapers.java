package decorator;

public class ChristmasPapers implements ChristmasTree {

    ChristmasTree christmasTree;

    public ChristmasPapers(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {

        return christmasTree.decorate() + " + Christmas Papers";
    }
}
