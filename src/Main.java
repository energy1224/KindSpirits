import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        String fname = "input.txt";
        String s;
        ArrayList<Customer> persons = new ArrayList<Customer>();

        Scanner sc = new Scanner(new File(fname));

        while (sc.hasNext()) {
            s = sc.nextLine();
            s = s.replace(",", "").replace(".", "");
            s =s.substring(1);
           // System.out.println(s);
            String[] word = s.split(" ");
         //  System.out.println(word[1]);
           int a = Integer.parseInt(word[3]);
           Customer per = new Customer(word[1], word[2], a, word[5], word[6]);
            System.out.println(per);
//
////            return per;
////         Customer per = Customer.parsePerson(s);
//         persons.add(per);


                }
            };



        }


