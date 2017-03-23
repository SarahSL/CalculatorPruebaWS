/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatoruse;

public class CalculatorUse {

    public static void main(String[] args) {
        System.out.println("Resta:" + CalculatorUse.resta(5, 4));
        System.out.println("Multiplicacion:" + CalculatorUse.mult(3, 4));
        System.out.println("Division:" + CalculatorUse.div(10, 2));
        System.out.println("Sumar:" + CalculatorUse.add(5, 5));
    }

    private static int resta(int x, int y) {
        calculator.CalculatorWS_Service service = new calculator.CalculatorWS_Service();
        calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.resta(x, y);
    }

    private static int mult(int z, int k) {
        calculator.CalculatorWS_Service service = new calculator.CalculatorWS_Service();
        calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.mult(z, k);
    }

    private static int div(int m, int l) {
        calculator.CalculatorWS_Service service = new calculator.CalculatorWS_Service();
        calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.div(m, l);
    }

    private static int add(int i, int j) {
        calculator.CalculatorWS_Service service = new calculator.CalculatorWS_Service();
        calculator.CalculatorWS port = service.getCalculatorWSPort();
        return port.add(i, j);
    }
    
}
