package SingletonReceiveArguments;

import ValidatorParams.Algorihm.ValidateAlgorithm;
import ValidatorParams.BattleField.ValidatorBattleField;
import ValidatorParams.Orientation.ValidateOrientation;
import ValidatorParams.Type.ValidateType;
import ValidatorParams.Units.ValidateUnits;

public class ReceiveArguments {

    private static String [] arguments;
    private static ReceiveArguments instance = new ReceiveArguments();

    private ReceiveArguments(){
    }

    public static String[] getArgs(){
        ReceiveArguments viendo = instance;
        return arguments;
    }

    public static ReceiveArguments getInstance(String[] argumentsClI){
      if(instance == null){
          instance = new ReceiveArguments();
      }

      ReceiveArguments viendo = instance;
      if (ReceiveArguments.arguments == null){
          ReceiveArguments.arguments = argumentsClI;
      }

      return instance;
    }

    public static void activador(){
        ValidateAlgorithm.validateTypeandPresence();
        ValidateType.validateTypeandPresence();
        ValidateOrientation.validateTypeandPresence();
        ValidatorBattleField.validateTypeandPresence();
        ValidateUnits.validateTypeandPresence();
    }
    
}
