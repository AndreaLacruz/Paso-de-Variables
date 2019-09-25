import ar.com.pasoVar.Arithmetic;
import ar.com.pasoVar.Result;

public class App {
    public static void main(String[] args) {

        Result resultado = new Result();
        Arithmetic operacion = new Arithmetic();

        int a, b;
        Integer n1,n2;

        a = 6;
        b= 9;

        n1 = 7;
        n2= 4;

        operacion.sum(resultado,a ,b);
        System.out.println("El resultado de la suma es: " + resultado.getResultSum());

        operacion.sum(resultado,n1,n2);
        System.out.println("El resultado de la segunda suma es: " + resultado.getResultSum1());

        operacion.subtraction(resultado, a, b);
        System.out.println("El resultado de la resta es: " + resultado.getResultSubtraction());

        operacion.subtraction(resultado, n1, n2);
        System.out.println("El resultado de la segunda resta es: " + resultado.getResultSubtraction1());

        operacion.division(resultado, a, b);
        System.out.println("El resultado de la division es: " + resultado.getDivision());

        operacion.multiplication(resultado, a, b);
        System.out.println("el resultado de la multiplicacion es: " + resultado.getMultiplication());
    }
}
