import java.util.LinkedList;

import javax.xml.transform.Templates;

public class Main{
    public static void main (String[] args){

        System.out.println("Hello World");

        Element fe = new Element(3);

        if(testConstructor()) pass++;

        else fail++;


        if(testSetter()) pass++;

        else fail++;


        if(testSearch()) pass++;
        else fail++;

        if(testSearchNotEmpty()) pass++;
        else fail++;

        if(testSearchTwoElements()) pass++;
        else fail++;

        if(testdelete1()) pass++;
        else fail++;

        if(testdelete2()) pass++;
        else fail++;
       

        LinkedLists fl = new LinkedLists();

        fl.search(3);


        System.out.println("passed: " + pass);
        System.out.println("failed: " + fail); 


    }

    static int pass = 0;
    static int fail = 0;


    public static boolean testSearch(){
        LinkedLists fl = new LinkedLists();

        return fl.search(3) == null;


    }
    public static boolean testdelete1(){
        LinkedLists fl = new LinkedLists();
        Element fe = new Element(3);
        Element se = new Element(4);
        fl.insert(fe);
        fl.insert(se);
        fl.delete(fe);

        return fl.search(3) == null;
    }


    public static boolean testdelete2(){
        LinkedLists fl = new LinkedLists();
        Element fe = new Element(3);
        Element se = new Element(4);
        fl.insert(fe);
        fl.insert(se);
        fl.delete(se);

        return fl.search(3) == fe;
    }


    public static boolean testSearchNotEmpty(){
        LinkedLists fl = new LinkedLists();
        Element fe = new Element(3);
        fl.insert(fe);

        return fl.search(3) == fe;


    }

    public static boolean testSearchTwoElements(){
        LinkedLists fl = new LinkedLists();
        Element fe = new Element(3);
        Element se = new Element(4);
        Element te = new Element(5);
        fl.insert(fe);
        fl.insert(se);
    

        return fl.search(3) == fe;


    }


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

