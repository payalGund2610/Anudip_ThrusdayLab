package String;

class Myclass{
	 
public String toString(){
System.out.println("Executing the toString()");
return ("returned from toString()");
}
 
public static void main(String[] args){
Myclass ob = new Myclass();
System.out.println(ob);
}
}
