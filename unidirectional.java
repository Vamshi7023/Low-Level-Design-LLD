class customer{
    private address address;
    public customer(address addd){
        this.address = addd;
    }
    public void print(){
        System.out.println(address.getAddress());
    }
}
class address{
    private String fullAddress;
    public address(String fullAddress){
        this.fullAddress = fullAddress;
    }
    public String getAddress(){
        return  fullAddress;
    }
}
public class unidirectional {
    public static void main(String[] args) {
        address a1 = new address("house 11");
        customer cc = new customer(a1);
        cc.print();

    }
}
