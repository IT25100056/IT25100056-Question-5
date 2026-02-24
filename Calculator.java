package Q5;



    public class Calculator {
        public int add(int a, int b) {

            return a + b;
        }

        public int multiply(int a, int b) {
            return a * b;
        }

        public int Square(int a) {
            return a * a;
        }
    }


    class Calculations {
        public static void main(String[] args) {
            Calculator calc = new Calculator();
            int part1 = calc.multiply(3, 4);
            int part2 = calc.multiply(5, 7);
            int sum1 = calc.add(part1, part2);
            int result1 = calc.Square(sum1);
            System.out.println("Result 1: " + result1);

            int sum2 = calc.add(4, 7);
            int sum3 = calc.add(8, 3);
            int square1 = calc.Square(sum2);
            int square2 = calc.Square(sum3);
            int result2 = calc.add(square1, square2);
            System.out.println("Result 2: " + result2);
        }
    }

}
