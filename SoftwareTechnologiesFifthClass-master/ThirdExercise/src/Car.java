public class Car {

    String brand;
    String type;
    String code;

public boolean checkCode(String code){

    abstract class AbstractCarCode {

       abstract boolean checkCarCode(String carCode);

    }

    class CarCode extends AbstractCarCode {

        @Override
        public boolean checkCarCode(String carCode) {

            //TODO check it
            return false;


        }
    }

    AbstractCarCode carCode= new CarCode();
    return carCode.checkCarCode(code);

}

public  boolean checkCodeNameless(String code){

    CarCodeInterface carCode= new CarCodeInterface() {
        @Override
        public boolean checkCarCode(String carCode) {
            //todo check if string is  correct
            return false;
        }

    };
    return carCode.checkCarCode(code);
}


}
