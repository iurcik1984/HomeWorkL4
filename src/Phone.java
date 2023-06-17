public class Phone {
    private String number;
    private String model;
    private int weight;
    public void receiveCall(String name)
    {
        System.out.println("Suna "+name);
    }
    public void receiveCall(String name,String number)
    {
        System.out.println("Suna "+name+" cu numarul "+number);
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public Phone() {
    }

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
