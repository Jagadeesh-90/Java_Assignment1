package assignment_7.innerClass;

public class OuterClass {
    private int outerData;

    public OuterClass(int outerData) {
        this.outerData = outerData;
    }

    public void printOuterData() {
        System.out.println("Outer data: " + outerData);
    }

    class Inner {
        private int innerData;

        public Inner(int innerData) {
            this.innerData = innerData;
        }

        public void printInnerData() {
            System.out.println("Inner data: " + innerData);
        }
    }
}
