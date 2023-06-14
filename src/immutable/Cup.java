package immutable;

public class Cup {
    private int size;
    private String color;

    private void keepWarm(){
        System.out.println("****");
    }

    public int getSize() {
        return size;
    }

    public Cup(){}
    private Cup(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public static void main(String[] args) {
        Cup c = new Cup();

        System.out.println(c.color);
        c.keepWarm();
    }


}
