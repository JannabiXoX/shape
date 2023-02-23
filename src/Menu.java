/*
 * @Author:user
 * @Date:2/23/2023 11:48 AM
 */
import java.util.Scanner;

public class Menu {

    public void domain(){
        DraworErase draworErase = new DraworErase();
        boolean flag = true;
        while (flag)
        {
            System.out.println("-----选择你需要的操作-----");
            System.out.println("--------1.画图----------");
            System.out.println("--------2.擦除----------");
            System.out.println("----3.查看画板上的图形-----");
            System.out.println("--------4.退出----------");
            int choiceone = 0;
            int choicetwo = 0;
            Scanner scanner = new Scanner(System.in);
            choiceone = scanner.nextInt();
            switch (choiceone){
                case 1:
                    System.out.println("-----选择你需要画的图形-----");
                    System.out.println("---------1.圆圈----------");
                    System.out.println("---------2.矩形----------");
                    System.out.println("--------3.三角形----------");
                    choicetwo = scanner.nextInt();
                    draworErase.drawShape(choicetwo);
                    break;
                case 2:
                    System.out.println("----输入你需要擦除的图形----");
                    choicetwo = scanner.nextInt();
                    draworErase.eraseShape(choicetwo);
                    break;
                case 3:
                    System.out.println("------画板------");
                    draworErase.show();
                    break;
                case 4:
                     flag = false;
                    break;
            }
        }

    }
}

