public class FizzBuzz {

  public static void main(String[] args){

//First we want to check for the numbers that are divisble by both 3 & 5, and if so print "FizzBuzz"
    for(int i = 1; i <= 100; i++){
          if(i % 3 == 0 && i % 5 == 0){
        System.out.println("FizzBuzz");
        
//Check numbers divisble by 3 and print "Fizz"
      } else if (i % 3 == 0){
        System.out.println("Fizz");
        
//Check numbers divisble by 5 and print "Buzz"
      } else if (i % 5 == 0){
        System.out.println("Buzz");
        
//Now check for numbers not divisble by 3 or 5, or both, and print the numbers 
      } else if (i % 3 != 0 && i % 5 != 0){
        System.out.println(i);
        
      } else if (i % 3 != 0){
        System.out.println(i);
        
      } else if (i % 5 != 0){
        System.out.println(i);
      }
    }

  }
}
