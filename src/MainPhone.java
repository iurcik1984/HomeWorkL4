public class MainPhone {
    public static void main(String[] args) {
        Phone phone=new Phone();
        Phone phone1=new Phone("+37379758041","Samsung A20");
        Phone phone2=new Phone("+37379712345","Samsung A30",150);
        phone.setModel("Nokia 3010");
        phone.setNumber("+37369612345");
        phone.setWeight(350);
        System.out.println(phone.getNumber());
        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        phone1.receiveCall("Vasea");
        phone.receiveCall("Ion",phone.getNumber());
        phone2.receiveCall("Iurii",phone1.getNumber());

    }
}
