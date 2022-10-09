package org.example;

import org.example.restClient.JercyClient;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        String response = JercyClient.getHello();
        System.out.println(response);
    }
}
