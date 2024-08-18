
abstract  class AbstractAnonymousInnerClass {
    abstract public void show();
}

class AbstractAnonymous{
    public static void main(String[] args) {
        AbstractAnonymousInnerClass obj=new AbstractAnonymousInnerClass(){
            public void show(){
                System.out.println("In anonymous inner class");
            }
        };
        obj.show();
    }
}