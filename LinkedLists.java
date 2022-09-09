public class LinkedLists{
    
    Element current;

    public Element search(int key){


        Element x = current;

        while(x != null && x.getkey() != key) x = x.getnext();

        return x;
    }


    public void insert(Element a){
       

        a.setnext(current);
        if(current != null){
            current.setprev(a);
        }
        current = a;
        a.setprev(null);
    }


    public void delete(Element a){
        boolean firstnull = false;
        boolean secondnull = false;


        if(a.getnext() == null) firstnull = true;
        if(a.getprev() == null) secondnull = true;
        else current = a.getnext();
        
        if(!firstnull) a.getnext().setprev(a.getprev());
        if(!secondnull) a.getprev().setnext(a.getnext());


        // if(deleteme.getnext() != null) firstnull = true;
        // if(deleteme.getprev() != null) secondnull = true;
        
    }




    
    

}