package objectExp2;

public class Employe2 {
	
	   int id;
	  
	   Employe2(int id){
		   
		   this.id=id;
	   }
	   
	   public String toString(){
		   
		   return "id of emp "+id;
		   
	   }
	   public static void main(String[] args) {
		   
		   Employe2 e = new Employe2(33);
		  
		   
		   System.out.println(e);
		  
		
		   
	}

}
