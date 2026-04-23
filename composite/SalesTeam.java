package composite;

import java.util.ArrayList;
import java.util.List;

public class SalesTeam implements Payee {
    private List<Payee> members = new ArrayList<>();

    public void addMember(Payee p) {
        members.add(p);
    }

    public void removeMember(Payee p) {
        members.remove(p);
    }

    @Override
    public void payExpenses(int amount) {
        System.out.println("Thanh toán chi phí cho Sales Team:");
        for (Payee p : members) {
            p.payExpenses(amount);
        }
    }
}