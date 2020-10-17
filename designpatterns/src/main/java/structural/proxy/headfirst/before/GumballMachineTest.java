package structural.proxy.headfirst.before;


import java.util.Scanner;

public class GumballMachineTest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter location and count for gumball machine");
        String input = scanner.nextLine();
        String[] array = input.split(" ");
        GumballMachine gumballMachine = new GumballMachine(Integer.parseInt(array[1]), array[0]);
        GumballMonitor monitor = new GumballMonitor(gumballMachine);
        monitor.report();

//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.ejectQuarter();
//        gumballMachine.dispense();
//        System.out.println(gumballMachine);
//        System.out.println("----------------------------------------------------------------------");
//        gumballMachine.insertQuarter();
//        gumballMachine.ejectQuarter();
//        gumballMachine.turnCrank();
//        System.out.println("----------------------------------------------------------------------");
//
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.ejectQuarter();
//        System.out.println(gumballMachine);
//        System.out.println("----------------------------------------------------------------------");
//        System.out.println("Current State " + gumballMachine.getCurrentState());
//        System.out.println("----------------------------------------------------------------------");
//
//        gumballMachine.insertQuarter();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        System.out.println(gumballMachine);
    }
}
