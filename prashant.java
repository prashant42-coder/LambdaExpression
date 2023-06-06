// Lambda Expression 
@FunctionalInterface
interface A {
  void show();
  
}
//class B extends Object implements A{
//public void show(){
  //  System.out.println("hello bacho kay halchal");
//}

//}


class prashant{
 public static void main(String[] args) {
    // -> IS LAMBDA EXPRESION  
   A obj =()-> System.out.println(" i love you ");// define the function 
   
  obj.show();// call the function 
 }
}