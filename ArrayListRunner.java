import java.util.ArrayList;

public class ArrayListRunner
{
    public static void main( String[] args )
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println( names );

        // a) Invoke add() to enter the following names in sequence:
        //  Alice, Bob, Connie, David, Edward, Fran, Gomez, Harry.
        //  Print the ArrayList again.
        names.add( "Alice" );
        names.add( "Bob" );
        names.add( "Connie" );
        names.add( "David" );
        names.add( "Edward" );
        names.add( "Fran" );
        names.add( "Gomez" );
        names.add( "Harry" );
        System.out.println( "a) " + names );

        // b) Use get() to retrieve and print the first and last names
        //   in the list.
        String firstName = names.get( 0 );
        String lastName = names.get( 7 );
        System.out.println( "b) first name: " + firstName +
                "; last name: " + lastName );

        // c) Print the size() of the ArrayList.
        System.out.println( "c) size: " + names.size());

        // d) Use size() to help you print the last name in the list.
        lastName = names.get( names.size() - 1 );
        System.out.println( "d) last name (with size): " + lastName );

        // e) Use set() to change "Alice" to "Alice B. Toklas".
        //  Print the ArrayList to verify the change.
        names.set( 0, "Alice B. Toklas" );
        System.out.println( "e) " + names );

        // f) Use the alternate form of add() to insert "Doug" after
        //  "David". Print the ArrayList again.
        names.add( 4, "Doug" );
        System.out.println( "f) " + names );

        // g) Use an enhanced for loop to print each name in the ArrayList.
        System.out.println( "g)" );
        for( String name : names )
        {
            System.out.println( name );
        }
        
        // h) Create a second ArrayList called names2 that is built
        //  by calling the ArrayList constructor that accepts another
        //  ArrayList as an argument. Pass names to the constructor
        //  to build names2. Then print the ArrayList.
        ArrayList<String> names2 = new ArrayList<String>( names );
        System.out.println( "h) " + names2 );
        
        // i) Call names.remove(0) to remove the first element.
        //  Print names and names2. Verify that Alice B. Toklas
        //  was removed from names, but not from names2.
        names.remove( 0 );
        System.out.println( "i) names: " + names + "; names2: " + names2 );
    }
} 

