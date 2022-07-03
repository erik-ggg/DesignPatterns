package decorator;

public abstract class TreeDecorator implements ChristmasTree {

    private ChristmasTree christmasTree;

    public TreeDecorator(ChristmasTree tree) {
        this.christmasTree = tree;
    }

    @Override
    public String decorate() {
        return christmasTree.decorate();
    }
}
