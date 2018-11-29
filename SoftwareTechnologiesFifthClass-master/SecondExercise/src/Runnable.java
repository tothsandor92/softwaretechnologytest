public class Runnable {
    public static void main(String[] args) {
        Function.LinearFunction function= new Function.LinearFunction(4,5);
        FunctionSolver functionSolver= new FunctionSolver();

     FunctionSolver.LinearFunctionSolver functionSolver1= functionSolver.getLinearFunctionSolver(function);
    }
}
