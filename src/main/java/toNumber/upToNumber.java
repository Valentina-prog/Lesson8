package toNumber;

public class upToNumber {
    public static void main(String[] args) {
     //  printToOne(7);
       printToNumberN(7);
    }

    public static void printToOne(int numberN){
        while(numberN > 0){
            System.out.println(numberN);
           numberN--;
        }
    }
    public static void printToNumberN(int numberN){
        if (numberN < 0)
            numberN = 0;
        int counter = 1;
        while(counter != numberN + 1){
            System.out.println(counter);
            counter++;
        }
    }
}
