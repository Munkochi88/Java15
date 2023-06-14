package ArrayList;

import object.BankAccount;

import java.util.ArrayList;

public class TestComputer {
    public static void main(String[] args) {
        ArrayList<Computer> computers= new ArrayList<>();
        Computer computer1 = new Computer("Apple",1999,"Black",13);
        Computer computer2 = new Computer("Samsung",1899,"White",14);
        Computer computer3 = new Computer("Sony",799,"Blue",15.6);
        Computer computer4 = new Computer("HP",699,"Gray",21);

        computers.add(computer1);
        computers.add(computer2);
        computers.add(computer3);
        computers.add(computer4);

        System.out.print(computers);
        System.out.println("-----------");

        // find computers they are less than $1000 and show their brand cost and color to user

        for (int i=0;i<computers.size();i++){
            if (computers.get(i).price<1000){
                System.out.println(computers.get(i).brand+" - "+computers.get(i).price+" - "+computers.get(i).color);
            }
        }

        System.out.println(findFancyComputer(computers));
        System.out.println(totalPrice(computers));
        BankAccount account = new BankAccount();
        account.withdraw(totalPrice(computers));
    }

    /*
    create a method that will get an arrayList as parameter
    this method will find out computers that has price more than $1200
    and screen size is more than 13.5
    this method will store and return those computers as a new arrayList
     */

    public static ArrayList<Computer> findFancyComputer(ArrayList<Computer> devices){
       ArrayList<Computer>fancyComputer = new ArrayList<>();
        for (Computer device : devices){
            if (device.price>1200 && device.screenSize>13.5){
               fancyComputer.add(device);
            }
        }
        return fancyComputer;
    }

    public static Double totalPrice(ArrayList<Computer> list){
        double sum = 0;
        for (Computer com:list){
            sum+= com.price;
        }
        return sum;
    }

    /*
    find out and tell me the total prices of computers so that I can buy all
    create a method to solve this task
     */


}
