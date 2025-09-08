import Singletons.SingletonMapArguments.MapWithArguments;
import Singletons.SingletonReceiveArguments.ReceiveArguments;

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