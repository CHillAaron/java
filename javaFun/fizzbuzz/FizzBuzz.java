public class FizzBuzz {
    public String buzzFizz(int number) {
        // fizzbuzz logic here
        if(number%3 == 0 && number%5 ==0){
            System.out.println("FizzBuzz");
            return "FizzBuzz";
        }else if(number%5 == 0 ) {
            System.out.println("Buzz");
            return "Buzz";
        }else if (number%3 == 0){
            System.out.println("Fizz");
            return "Fizz";
        }else System.out.println(number );
        return  "Try another number " + number ;
    }
}

