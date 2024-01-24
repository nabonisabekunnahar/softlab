
public class Factory {
    private static Factory factory=null;
    private Factory(){}
    public static Factory getInstance() {
        if(factory==null) factory=new Factory();
        return factory;
    }
    public  static Shape getShape(String name) {
        if(name==null) return null;
        if(name=="Rectangle") return new Rectangle();
        if(name=="Square") return new Square();
        return null;
    }
    public static void main (String[] args) {
        Factory factory=Factory.getInstance();
        Shape s1=Factory.getShape("Rectangle");
        Shape s2=Factory.getShape("Square");
        s1.draw();
        s2.draw();
        Factory factory2=Factory.getInstance();
        System.out.println(factory.hashCode());
        System.out.println(factory2.hashCode());

    }
}
