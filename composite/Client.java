package composite;

public class Client {
    public static void main(String[] args) {

        Manager m1 = new Manager("Hihi");
        Manager m2 = new Manager("Bobo");

        Salesperson s1 = new Salesperson("Lisa");
        Salesperson s2 = new Salesperson("Rose");

        SalesTeam team = new SalesTeam();
        team.addMember(m1);
        team.addMember(m2);
        team.addMember(s1);
        team.addMember(s2);

        team.payExpenses(1000);
    }
}