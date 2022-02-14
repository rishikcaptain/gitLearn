class TV {
  void ON(){
   System.out.println("Tv is switched on");
}
   void ChangeChannel(){
     System.out.println("Channel Changed on Tv");
   }
}

class SmartTv extends TV{
  @Override
  void ON(){
    System.out.println("SmartTv is switched On");
  }
  @Override
  void ChangeChannel(){
    System.out.println("Channel Changed on SmartTv");
  }

  void Stream(){
    System.out.println("Streaming is available on SmartTv");
  }

}

class MethodOverriding{
  public static void main(String[] args) {
  /*  TV tv = new TV();
    tv.ON();
    tv.ChangeChannel();
    SmartTv st = new SmartTv();
    st.ON();
    st.ChangeChannel();*/
//Tv is switched on
//Channel Changed on Tv
//SmartTv is switched On
//Channel Changed on SmartTv
TV stv = new SmartTv();
stv.Stream();//this will give an error because the object of reference is not having the method called 
  }
}
