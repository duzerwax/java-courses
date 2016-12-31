import java.util.Scanner;

public class InteractRuner{

	
	
	public static void main(String[] arg){
		Scaner reader = new Scaner(System.in);
		try{
			calculator calc = new calculator();
			String exit="no";
			while(!exit.equals("yes")){
			
			}
		}finally{
			reader.close();
		}
	}
	
	public int getResult (){
		return this.result;
	}

	public void cleanResult (){
		this.result=0;
	}
	

}