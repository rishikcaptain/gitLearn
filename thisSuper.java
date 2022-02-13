class rectangle{
  int length;
  int breadth;
  int x=10;
  rectangle(int length,int breadth){
    this.length = length;
    this.breadth = breadth;
  }
}
class thisSuper extends rectangle{
  int height;
  int x =29;
  thisSuper(int l,int b,int h){
super(l,b);
    height = h;
  }
  void display(){
    System.out.println(super.x);
    System.out.println(x);
  }
  public static void main(String[] args) {
    thisSuper ts = new thisSuper(5,8,9);
    ts.display();
  }
}
