import java.util.Vector;
// import java.util.*; // Wildcard - imports all classes into the package
public class vectors {
        public static void main(String[] args){
        // Create a vectir
        // Vector<data_type_Class> objName
        // ^- You have to instanciate using new
        Vector<Integer> numVect = new Vector();
            System.out.println();
        // We can add value by using the .add(); method
        numVect.add(3);
        numVect.add(5);
        numVect.add(10);

        // If I want to output the second value
        // I'm going to use the get() method
        System.out.println("Second value" + numVect.get(1));

        // I can remove values, using the remove() method.
        // Let's remove the second value.
        numVect.remove(1);
        System.out.println("Second value" + numVect.get(1));
        
        // To remove everything, we can use the clear() method
        numVect.clear();
        // Verify
        System.out.println("Vector size" + numVect.size());
        }
}

