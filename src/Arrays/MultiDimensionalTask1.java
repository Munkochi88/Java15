package Arrays;

public class MultiDimensionalTask1 {
    public static void main(String[] args) {
        /*
        --Computer--
Apple -> 2500
Dell -> 1800
Acer -> 1399
Samsung -> 1550.99

--TV--
LG -> 1100
Sony -> 800
Toshiba -> 599

--Speaker--
google -> 99.99
Bose -> 120.99
JBL -> 89.95
         */
        String[][] brand = {{"Apple", "Dell", "google", "Acer", "Samsung"}, {"LG", "Sony", "Toshiba"}, {"google", "Bose", "JBL"}};
        double[][] price = {{2500, 1800, 400, 1399, 1550.99}, {1100, 800, 599}, {99.99, 120.99, 89.95}};
        // "JBL is 89.95"...
        // show me google product which are less than $100

        for (int i= 0; i< brand.length;i++){
            for (int k = 0; k<brand[i].length; k++){
                if (brand[i][k].equalsIgnoreCase("google")&&price[i][k]<100) {
                    System.out.println(brand[i][k] + " is $" + price[i][k]);
                }
            }
        }
    }
}
