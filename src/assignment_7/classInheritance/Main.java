//2. Create a Cycle class, with subclasses Unicycle, Bicycle and Tricycle.
// Add a balance( ) method to Unicycle and Bicycle, but not to Tricycle.
// Create instances of all three types and upcast them to an array of Cycle. Try to call balance( ) on each element of the array
// and observe the results. Downcast and call balance( ) and observe what happens.


package assignment_7.classInheritance;

public class Main {
    public static void main(String[] args) {
        Cycle[] cycle=new Cycle[3];
        cycle[0]=new Unicycle();
        cycle[1]=new Bicycle();
        cycle[2]=new Tricycle();
        for(Cycle cycle1:cycle){
          //  cycle1.balance();
        }
    }
}
