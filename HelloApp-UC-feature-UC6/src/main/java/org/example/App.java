package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StringBuilder nameBuilder = new StringBuilder();
        for (String name : args) {
            nameBuilder.append(name).append(", ");
        }
        String name = "";
        if (nameBuilder.length() > 0) {
            name = nameBuilder.substring(0, nameBuilder.length() - 2);
        }
        System.out.println("Hello " + name + '!');
    }
}
