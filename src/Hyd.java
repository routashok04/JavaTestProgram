public class Hyd {
    static int x;

    void increment() {
        x++;
    }

}
class HydDemo{

    public static void main(String[] args) {
        //Object obj=new Object();
        //System.out.println(obj.getClass());
    Hyd obj1=new Hyd();
    Hyd obj2=new Hyd();
    obj1.x=0;
    obj1.increment();
    obj2.increment();
        System.out.println(obj1.x+""+obj2.x);
    }
    }

