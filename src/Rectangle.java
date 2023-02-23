/**
 * @Author FeiYang
 * @Date 2/23/2023 4:54 PM
 */
public class Rectangle extends Shape{
    @Override
    void draw() {
        System.out.println("画矩形");
    }

    @Override
    void erase() {
        System.out.println("擦除矩形");
    }
}
