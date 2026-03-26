package facade;

public class Client {
    public static void main(String[] args) {
        VacationFacade facade = VacationFacade.getInstance();

        facade.option1();
        System.out.println("----------------");

        facade.option2();
        System.out.println("----------------");

        facade.option3();
    }
}

