public class Runnable {
    public static void main(String[] args) {


        testInterface testInterface= new testInterface() {
            @Override
            public int testMethod1() {
                return 1;
            }

            @Override
            public double testMethod2() {
                return 3.2;
            }

            @Override
            public boolean testMethod3() {
                return false;
            }
        };
        System.out.println(
                testInterface.testMethod1());

    }

}
