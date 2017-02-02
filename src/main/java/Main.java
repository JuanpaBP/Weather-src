
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

import Domain.State;
import Domain.Weather;
import DataAccess.*;

import Proxy.DaoProxys;
import Resource.WeatherResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public Main() {
    }

    public static void main(String[] args) throws IOException {

        ApplicationContext context = new ClassPathXmlApplicationContext("WEB-INF/beans.xml");
        DAOCountry CountryA = (DAOCountry) context.getBean("springPersistencyCountry");
        DAOState StateA = (DAOState) context.getBean("springPersistencyState");
        DAOWeather WeatherA = (DAOWeather) context.getBean("springPersistencyWeather");
        WeatherResource weatherResource = (WeatherResource) context.getBean("WeatherResource");
        DateFormat df = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        Date today = Calendar.getInstance().getTime();
        String reportDate = df.format(today);



        /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Por favor ingrese el ID del pais");
        int cID = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el nombre");
        String cName = br.readLine();
        System.out.println("Ingrese la abreviatura de 2 letras");
        String cAlpha2 = br.readLine();
        System.out.println("Ingrese la abreviatura de 3 letras");
        String cAlpha3 = br.readLine();
        //System.out.println("Ingrese el ID del estado");
        //int sID = Integer.parseInt(br.readLine());
        System.out.println("Ingrese el nombre del estado");
        String sName = br.readLine();
        System.out.println("Ingrese la abreviatura del estado");
        String sAbbr = br.readLine();
        System.out.println("Ingrese el area del estado en KM2 sin la unidad");
        int sArea = Integer.parseInt(br.readLine());
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
        int wAHum = Integer.parseInt(br.readLine());
        System.out.println("Ingrese la presion atmosferica");
        int wAPress = Integer.parseInt(br.readLine());
        System.out.println("Ingrese la Visibilidad actual");
        String wAVisibility = br.readLine();
        State N = new State(reportDate ,cID, cName, cAlpha2, cAlpha3, wTemp, wMaxTemp, wMinTemp, wDesc, wWSpe, wWDir, wAHum,
            wAPress, wAVisibility, sName, sAbbr, sArea, sLargest_city, sCapital);*/

        //new Weather(wMaxTemp, wMinTemp, wDesc);

        //System.out.println(N.toString());

        /*Calendar cal = Calendar.getInstance();
        cal.setTime(new Date());
        cal.set(Calendar.HOUR, cal.get(Calendar.HOUR)+10);


        List<Weather> we = new ArrayList<Weather>();      //Lista genérica


        for(int i = 0; i < 10; ++i) {
            Weather weather;
            if(i == 0) {
                weather = new Weather(wTemp, wMaxTemp, wMinTemp, wDesc, wWSpe, wWDir, wAHum,wAPress,wAVisibility);
                System.out.println(weather.toString());
            }
            else{
                weather = new Weather(wMaxTemp, wMinTemp, wDesc);
                System.out.println(weather.shortToString());
            }
            we.add(weather);
        }
        for(Weather w:we){
            System.out.println(w.toString());
        }
        System.out.println(we.size());*/

        //These are the things that do the inserts on the DB
        //CountryA.insertCountry(cID, cName,cAlpha3,context);
        //WeatherA.insertWeather(reportDate, wTemp,wMaxTemp,wMinTemp,wDesc,wWSpe,wWDir,wAHum,wAPress,wAVisibility,context);
        //StateA.insertState(cID,sName,sAbbr,sArea, sLargest_city, sCapital,context);



        }

    }



