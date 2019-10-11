package decorator;

public class ChristmasLights implements ChristmasTree {

    ChristmasTree christmasTree;

    public ChristmasLights(ChristmasTree christmasTree) {
        this.christmasTree = christmasTree;
    }

    @Override
    public String decorate() {
        return  christmasTree.decorate() + " and Christmas Lights";
    }
}
