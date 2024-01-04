import java.util.Scanner;
//64050030 นาย กิติภูมิ หน่อเนื้อ
public class Main {

    public static void display(Customer customer){
        customer.createMail();
        customer.createBrochure();   
    }
    public static void main(String[] args){
        AbstractFactory factory = FactoryProducer.getFactory();
        Scanner sc = new Scanner(System.in);
        System.out.print("Please choose customer type 1. Regular, 2. Mountain, 3. Delinquent ");
        int num = sc.nextInt();
        
        Customer customer = null;

        switch(num){
            case 1:
                customer = factory.customerType("Regular"); 
                break;
            case 2:
                customer = factory.customerType("Mountain");
                break;
            case 3:
                customer = factory.customerType("Delinquent");
                break;
        }
        sc.close();
        display(customer);
    }
}
