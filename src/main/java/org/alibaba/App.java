package org.alibaba;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String res = "920x689";
        Character c = res.charAt(0);
        if(c.equals('9')){
            System.out.println("equal");
        }
        String[] size = res.split("x");
        if(size.length!=2){
            //log error
        }
        double target = Double.parseDouble(size[0])*Double.parseDouble(size[1]);
        double ratio = target / (1920*1080);

        ratio = (double) Math.round(ratio * 10) / 10;
        System.out.println( "Hello World!" );

    }
}
