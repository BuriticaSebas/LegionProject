import SingletonMapArguments.MapWithArguments;
import SingletonReceiveArguments.ReceiveArguments;
import ValidatorParams.Algorihm.ValidateAlgorithm;
import ValidatorParams.Type.ValidateType;

public class Main {
    public static void main(String[] args) {

        //Recibir parametros
        //Validar parametros
        //Desglosar cada parametro y ejecutarse de acuerdo al parametro

        ReceiveArguments.getInstance(args);
        ReceiveArguments.activador();
        System.out.println(MapWithArguments.getGlobalArguments());
    }
}