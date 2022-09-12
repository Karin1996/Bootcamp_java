public class Demo {
	public static void main(String[] args) {	
		
		//Trying out classes and Has-a relationship
		/*
		Student s1 = new Student("Karin", 345677);
		s1.CheckGraduated(7, "Creative Media");
		
		Student s2 = new Student("Jan", 654456);
		s2.CheckGraduated(4, "Information Technology");
		*/
		
		//-----------------------------------------------------------------------
		
		//Mini-assignment 1
		String str1 = "dop";
	    String str2 = "erwt";
	    String str3 = "en";
	    String result;
	    // Concateneer str1, str2 en str3 en assign aan result
	    result = str1 + str2 + str3;
	    // print string result
	    System.out.println("Assignment 1 result: "+ result);
	    
	    //-----------------------------------------------------------------------
	    
	    //Mini-assignment 2
	    System.out.println("Assignment 2 result: "+ CheckAmountOfCharacters("Regenen", 'e') );
	    //-----------------------------------------------------------------------
	    
	    //Mini-assignment 3
	    int[] array = {1,2,3};
	    System.out.println("Assignment 3 result: "+ CalculateSumOfArray(array) );
	    
		
		Persoon liv = new Baby();
		liv.Bewegen();
	    
	     
	}
	//Mini-assignment 2
	static int CheckAmountOfCharacters(String str, char chr){
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
	    	if(str.charAt(i) == chr) {
	    		count ++;
	    	}
	    }
		return count;
    }
	//-----------------------------------------------------------------------
	//Mini-assignment 3
	static int CalculateSumOfArray(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
	    	sum += arr[i];
	    }
		return sum;
	}
	//-----------------------------------------------------------------------
	//Mini-assignment 4
	
	
	
	
	
}


abstract class Persoon {
	String voornaam;
	abstract void Bewegen();
}


class Baby extends Persoon{
	@Override
	void Bewegen() {
		System.out.println("Babies kruipen");
		
	}
}





/*
class Waterfles {
	int inhoud;
	Dop dopje = new Dopje(); // Kan je meteen vullen of later
}

class Dop {
	int diameter = 9;
}

//Has-a relatie
		Waterfles wf1 = new Waterfles();
		//wf1.dopje = new Dop();
*/



//Non access modifiers: -, static, final, static final.

/*
Mens
	leeftijd
	final: bsn
	static: uitgestorven (false)
	final static: aantal biologische ouders

Bootcamp
	locatie;
	final: afstudeerdatum;
	static: deadline;
	final static: einddatumBootcamp;
*/


//niet statisch, niet final, mag veranderen
//final onveranderlijk, moet meteen een waarde hebben (mag via een constructor een waarde worden gegeven)
//static De waarde is voor alle instance object hetzelfde
//static final alle instance object zelfde waarde en onveranderlijk