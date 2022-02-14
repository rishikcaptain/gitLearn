class Super{
  void display(){
    System.out.println("Super Method Display");
  }
}

class Sub extends Super{
  @Override
  void display(){
    System.out.println("Sub Method Display");
  }
}

class OverRidingAndDynamicMethodDispatch{
  public static void main(String[] args) {
    Super s = new Sub(); /* this is dynamic method dispatch*/
    s.display();/*When a refrence of super class is given to an object of sub class and the method is called is overridden, then the sub class method execute*/
    Super sup = new Super();
    sup.display();
    Sub sub = new Sub();
    sub.display();

  }
}
