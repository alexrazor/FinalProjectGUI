import com.goit.javaonline3.nod.CustomScanner;
import com.goit.javaonline3.nod.Nod;

/**
 * Created by Ler4enko on 17.07.2016.
 */
public class Runner {

    public static void main(String[] arg) {

        System.out.println("Please enter two Integer numbers");

        int firstNumber = CustomScanner.getInt();
        int secondNumber = CustomScanner.getInt();

        System.out.println("NOD for your two numbers is " + Nod.findNod(firstNumber, secondNumber));

    }

}
