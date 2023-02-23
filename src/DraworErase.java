/**
 * @Author FeiYang
 * @Date 2/23/2023 4:54 PM
 */
public class DraworErase {
    Canvas canvas = new Canvas();
    Circle circle = new Circle();
    Rectangle rectangle = new Rectangle();
    Triangle triangle = new Triangle();
    public void drawShape(int type){
        switch (type){
            case 1:
                new Circle().draw();
                canvas.add(circle);
                break;
            case 2:
                new Triangle().draw();
                canvas.add(triangle);
                break;
            case 3:
                new Rectangle().draw();
                canvas.add(rectangle);
                break;
            default:
                break;
        }
    }

    public void eraseShape(int number){
        canvas.remove(number);
    }
    public void show(){
        canvas.show();
    }
}
