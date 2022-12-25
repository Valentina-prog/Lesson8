package lesson8;

        public class midValue {
            public static void main(String[] args) {
                double[] numbers = {3, 7, 5, 20, 43, 2, 12, 31, 18, 25, 37, 200, 6, 17, 55, 9, 30, 42, 301, 44};
                for(int i = 0; i < numbers.length; i++) {
                    System.out.println(numbers[i]);
                }
                double suma = 0;
                for(int i = 0; i < numbers.length; i++) {
                    suma += numbers[i];
                }
                double middleValue = suma/ numbers.length;
                System.out.println("Middle value is: " + middleValue);

            }
}




