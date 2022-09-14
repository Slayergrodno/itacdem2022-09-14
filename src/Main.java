public class Main {
    public static void main(String[] args) {
        byte xByte = 14;
        System.out.println(xByte);
        float xFloat = 22.4f;
        System.out.println(xFloat);
        int xInt = 0b0101;
        System.out.println(xInt);
        Car s10 = new Car(10);
        Car s20 = new Car(20);
        System.out.println(s10.maxSpeed);
        System.out.println(s20.maxSpeed);
        s10 = null;
        System.out.println(s10);
        //System.out.println(s10.maxSpeed);  - Ошибка вывода... Так обращаться к переменной нельзя!!!
        System.out.println();
    }
}