import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RoadCamera
{
    public static void main(String[] args) throws IOException
    {
        //Параметры программы
        int maxOncomingSpeed = 41; // km/h
        int speedFineGrade = 20; // km/h
        int finePerGrade = 500; // RUB
        int criminalSpeed = 180; // km/h
        int x = 2;

        //=============================================================

        System.out.println("Введите скорость автомобиля:");

        //Скорость автомобиля
        int oncomingSpeed = Integer.parseInt((new BufferedReader(new InputStreamReader(System.in))).readLine());
        if(oncomingSpeed >= criminalSpeed)
        {
            System.out.println("Вызов полиции...");
        }
        else if(oncomingSpeed >= maxOncomingSpeed)
        {
            int overSpeed = oncomingSpeed - maxOncomingSpeed; //60 - 41 = 19
            int gradesCount = overSpeed / speedFineGrade; //19 / 20 = 0.95
            int fine = finePerGrade * gradesCount; //500 * 0.95 (0) = 0

            if (fine == 0){
                System.out.println("Скорость не превышена");
            }else{
                System.out.println("Сумма штрафа: " + fine * x);
            }
        }
        else {
            System.out.println("Скорость не превышена");
        }
    }
}