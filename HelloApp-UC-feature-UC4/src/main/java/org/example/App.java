package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String name = "";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < args.length; i++) {
            sb.append(args[i]);
            if(i < args.length - 1) {
                sb.append(", ");
            }
            name = sb.toString();
        }
        System.out.println( "Hello, " + name );
    }
}
