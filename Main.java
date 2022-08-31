import javax.xml.transform.Templates;

public class Main{
    public static void main (String[] args){

        System.out.println("Hello World");

        Element fe = new Element(3);

        if(testConstructor()) pass++;

        else fail++;


        if(testSetter()) pass++;

        else fail++;


        System.out.println("passed: " + pass);
        System.out.println("failed: " + fail); 


    }

    static int pass = 0;
    static int fail = 0;


    public static boolean testConstructor(){
        Element fe = new Element(3);
        return fe.getkey() == 3;
    }


    public static boolean testSetter(){
        Element fe = new Element(3);
        Element se = new Element(4);
        fe.setnext(se);
        return fe.getnext().getkey() == 4;
    }

}

