import javax.sound.sampled.Line;

public class FunctionSolver  extends  Function{


    public LinearFunctionSolver getLinearFunctionSolver(LinearFunction linearFunction){
        return new LinearFunctionSolver(linearFunction);
    }


    public class LinearFunctionSolver{

        double result;

        public LinearFunctionSolver(LinearFunction function) {
            this.result = solveLinearFunction(function);
        }

        public double getResult() {
            return result;
        }

        private double solveLinearFunction(LinearFunction function){
            if (function.getA() ==0 || function.getB() ==0)
                return 0;
            else return -function.getB()/function.getA();

        }
    }

    class QuadraticFunctionSolver{

        double resultPlus;
        double resultMinus;
        boolean solvable;


        public QuadraticFunctionSolver(QuadraticFunction function) {
            if(solvable=calculateDiscriminant(function)<=0)
                solveQuadraticFunction(function);

        }

        private void solveQuadraticFunction(QuadraticFunction function) {

            if (calculateDiscriminant(function)>0){


            }
            else if (calculateDiscriminant(function)==0){
                resultMinus=0;
                resultPlus=(function.getB())/2*function.getA();
            }else
                resultPlus=0;
            resultMinus=0;
            System.out.println("Cant be solved");
        }

        private double calculateDiscriminant(QuadraticFunction function) {
          return Math.pow(function.getB(),2)-4*function.getA()*function.getC();
        }
    }

}
