package assignment_7.innerClass;

public class SubOuterClass extends OuterClass{
    public SubOuterClass(int outerData) {
        super(outerData);
    }

    class SubclassInner extends Inner {
        public SubclassInner(int innerData) {
            super(innerData);
        }

        public void printData() {
            printOuterData();
            printInnerData();
        }
    }
}
