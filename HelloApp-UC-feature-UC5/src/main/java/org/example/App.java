package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringBuilder sb = new StringBuilder();
        boolean first = true;
        for (String name : args) {
            if(!first) {sb.append((", "));}
            sb.append(name);
            first = false;
        }
        System.out.println( "Hello, " + sb.toString() + '!' );
    }
}
