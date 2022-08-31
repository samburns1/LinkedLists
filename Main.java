import javax.xml.transform.Templates;

public class Main{
    public static void main (String[] args){

        System.out.println("Hello World");

        Element fe = new Element(3);

        if(testing()) pass++;

        else fail++;


        System.out.println("passed: " + pass);
        System.out.println("failed: " + fail); 


    }

    static int pass = 0;
    static int fail = 0;


    public static boolean testing(){
        Element fe = new Element(3);
        return fe.getkey() == 3;
    }
}

