public class CustomerFactory extends AbstractFactory{

    @Override
    Customer customerType(String type) {
        // TODO Auto-generated method stub
        if(type.equals("Regular")){
            return new RegularCustomer();
        }else if(type.equals("Mountain")){
            return new MountainCustomer();
        }else if(type.equals("Delinquent")){
            return new DelinquentCustomer();
        }else{
            return null;
        }
    }    
}
