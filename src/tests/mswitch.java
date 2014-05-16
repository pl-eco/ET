package tests;

modes{   lo <: hi;  
         hi <: full;    }

class X{
	public void operate(){
	}
}

public class Test@mode(full){
    public static void main(String[] args) {
        Test test = new Test@mode(full)();
      	test.testmswitch();
    }
    
    public void testmswitch(){
         X math = new X@mode(full)();
         
         modev t = #hi;
          mswitch(t){
                case #lo:  math.operate();
			  case #hi: math.operate();
          }
          math.operate();
    }    
}

