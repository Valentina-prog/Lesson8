package notDivisible;

public class notDivBy {
    public static void main(String[] args) {
        for(int i=1; i <= 50; i++){
            if(i % 3 !=0 && i % 7 !=0) {

                System.out.println(i);
            }
        }
    }
}
