import java.util.ArrayList;
import java.util.List;

/**
 * @Author FeiYang
 * @Date 2/23/2023 4:04 PM
 */
public class Canvas {
    List<Shape> shapes = new ArrayList<Shape>();

    public void add(Shape shape) {
        shapes.add(shape);
    }
    public void remove(int num) {
        for (int i = 0; i < shapes.size()-1 ; i++) {
            if (i == num-1){
                shapes.set(i, shapes.get(i+1));
                shapes.remove(shapes.size() -1);
            }
        }
    }
    public void show() {
        int numberOfShapes = 1;
        for (int i = 0; i <shapes.size();i++){
            System.out.println(numberOfShapes + "."+shapes.get(i).getClass().getName());
            numberOfShapes++;
        }
    }
}
