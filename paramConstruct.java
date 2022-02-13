class Parent{
	Parent(){
		System.out.println("parent constructor");
	}
	Parent(int y){
		System.out.println(++y +" ParamParent");
	}
	Parent(int z,int m){
		System.out.println(z+ " doubleParamParent "+m);
	}
}
class Child extends Parent{
	Child(){
		System.out.println("child constructor");
	}
	Child(int x,int y){
		super(x,y);
		System.out.println(y+" paramChild "+x);
	}
}
class paramConstruct{
	public static void main(String[] args) {
			Child c = new Child(4,8);
	}
}
