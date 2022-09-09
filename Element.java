public class Element{

    private Element prev;
    private Element next;
    private int key;


    public Element(int _key){


        key = _key;



    }

    public int getkey(){
        return key;
    }

    public void setprev(Element prev){
         this.prev = prev;
    }


    public void setnext(Element next){
        this.next = next;
   }

   public Element getnext(){

    return next;

   }

   public Element getprev(){

    return prev;

   }






    // public void insert(Element next){
    //     if(next==null) this.next = next;
    //     this.next.insert(next);

    // }
}