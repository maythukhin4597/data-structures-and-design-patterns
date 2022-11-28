package structural.proxy.headfirst.after;

import java.rmi.Naming;
import java.util.ArrayList;
import java.util.List;

public class GumballMonitorTest {
    public static void main(String[] args) {
        List<String> locations = List.of(
                "rmi://santafe.mightygumball.com/gumballmachine",
                "rmi://boulder.mightygumball.com/gumballmachine",
                "rmi://austin.mightygumball.com/gumballmachine");

        if (args.length >= 0) {
            locations = new ArrayList<>();
            locations.add(0, "rmi://" + args[0] + "/gumballmachine");
        }

        List<GumballMonitor> monitors = new ArrayList<>();

        for (String location : locations) {
            try {
                GumballMachineRemote machine =
                        (GumballMachineRemote) Naming.lookup(location);
                monitors.add(new GumballMonitor(machine));
                System.out.println(monitors);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        for (GumballMonitor monitor : monitors) {
            monitor.report();
        }
    }
}
