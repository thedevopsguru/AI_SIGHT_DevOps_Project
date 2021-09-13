public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("HelloWorld running in Docker.");
    }

    public boolean isEvenNumber(int number){

        boolean result = false;
        if(number%2 == 0){
            result = true;
        }
        return result;
    }
}
