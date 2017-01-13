/**
 * Created by Usuario on 12/01/2017.
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.List;

public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {

        /*Date today = new Date();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese el ID del pais");
        int cID = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el nombre");
        String cName = br.readLine();
        System.out.println("Ingrese la abreviatura de 2 letras");
        String cAlpha2 = br.readLine();
        System.out.println("Ingrese la abreviatura de 3 letras");
        String cAlpha3 = br.readLine();
        System.out.println("Ingrese el nombre del estado");
        String sName = br.readLine();
        System.out.println("Ingrese la abreviatura del estado");
        String sAbbr = br.readLine();
        System.out.println("Ingrese el area del estado en KM2 sin la unidad");
        String sArea = br.readLine();
        System.out.println("Ingrese la ciudad mas grande del estado");
        String sLargest_city = br.readLine();
        System.out.println("Ingrese la capital del Estado");
        String sCapital = br.readLine();
        System.out.println("Ingrese la temperatura actual del estado en grados sin la unidad");
        int wTemp = Integer.parseInt(br.readLine());
        System.out.println("Ingrese la temperatura maxima del estado sin la unidad");
        int wMaxTemp = Integer.parseInt(br.readLine());
        System.out.println("Ingrese la temperatura minima del estado sin la unidad");
        int wMinTemp = Integer.parseInt(br.readLine());
        System.out.println("Ingrese una descripcion del clima en el estado");
        String wDesc = br.readLine();
        System.out.println("Ingrese la velocidad del viento");
        int wWSpe = Integer.parseInt(br.readLine());
        System.out.println("Ingrese la direccion del viento");
        String wWDir = br.readLine();
        System.out.println("Ingrese Humedad");
        String wAHum = br.readLine();
        System.out.println("Ingrese la presion atmosferica");
        String wAPress = br.readLine();
        System.out.println("Ingrese la Visibilidad actual");
        String wAVisibility = br.readLine();
        State1 N = new State1(cID, cName, cAlpha2, cAlpha3, wTemp, wMaxTemp, wMinTemp, wDesc, wWSpe, wWDir, wAHum,
                wAPress, wAVisibility, sName, sAbbr, sArea, sLargest_city, sCapital);

        new Weather(wMaxTemp, wMinTemp, wDesc);

        System.out.println(N.toString());*/

        /*Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR, cal.get(Calendar.HOUR)+10);


        /*List<Weather> we = new ArrayList<>();       //Lista genérica


        for(int i = 0; i < 10; ++i) {
            Weather weather;
            if(i == 0) {
               weather = new Weather(wTemp, wMaxTemp, wMinTemp, wDesc, wWSpe, wWDir, wAHum,wAPress,wAVisibility);
               System.out.println(weather.toString());
            }
            else
            {
                weather = new Weather(wMaxTemp, wMinTemp, wDesc);
                System.out.println(weather.shortToString());
            }
            we.add(weather);
        }
        /*for(Weather w:we){
            System.out.println(w.toString());
        }
        System.out.println(we.size());*/
        DB_Connect db = new DB_Connect();
        db.TryConn();



    }
}
