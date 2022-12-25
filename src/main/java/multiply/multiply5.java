package multiply;

public class multiply5 {
    public static void main(String[] args) {

        int [] arrMulty= new int[20];
        for (int i = 0; i < arrMulty.length; i++){
            arrMulty[i] = i * 5;
        }
        for (int i = 0; i < arrMulty.length; i++){
            System.out.printf("The indx is:%d and multiply is: %d\n", i, arrMulty[i]);
        }


    }

}
