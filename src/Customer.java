public class Customer {

    String firstname;
    String name;

    int age;
    String profession;

    String status;

    public Customer(String firstname, String name, int age, String profession, String status) {
        this.firstname = firstname;
        this.name = name;
        this.age = age;
        this.profession = profession;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Customer{"+ firstname +" "+
                name +" "+ "возраст: " + age + " "+
                 profession +" " + status + '}';

    }
//    public static Customer parsePerson ( String s){
//        s = s.replace(",", "").replace(".", "");
//        s =s.substring(1);
//        String[] word = s.split(" ");
//        int a = Integer.parseInt(word[2]);
//        Customer per = new Customer(word[0], word[1], a, word[4], word[5]);
//
//        return per;
//


    }

