/**
 * Created by Usuario on 12/01/2017.
 */
import java.util.Date;

public class Weather {
    private Date today = new Date();
    private int temperature = 0;
    private int maxTemperature = 0;
    private int minTemperature = 0;
    private String description = "";
    private int wSpeed = 0;
    private String wDirection = "";
    private String aHumidity = "";
    private String aPressure = "";
    private String aVisibility = "";

    public int getTemperature() {
        return this.temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getMaxTemperature() {
        return this.maxTemperature;
    }

    public void setMaxTemperature(int maxTemperature) {
        this.maxTemperature = maxTemperature;
    }

    public int getMinTemperature() {
        return this.minTemperature;
    }

    public void setMinTemperature(int minTemperature) {
        this.minTemperature = minTemperature;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getwSpeed() {
        return this.wSpeed;
    }

    public void setwSpeed(int wSpeed) {
        this.wSpeed = wSpeed;
    }

    public String getwDirection() {
        return this.wDirection;
    }

    public void setwDirection(String wDirection) {
        this.wDirection = wDirection;
    }

    public String getaHumidity() {
        return this.aHumidity;
    }

    public void setaHumidity(String aHumidity) {
        this.aHumidity = aHumidity;
    }

    public String getaPressure() {
        return this.aPressure;
    }

    public void setaPressure(String aPressure) {
        this.aPressure = aPressure;
    }

    public String getaVisibility() {
        return this.aVisibility;
    }

    public void setaVisibility(String aVisibility) {
        this.aVisibility = aVisibility;
    }

    public Weather(int Temp, int maxTemp, int minTemp, String desc, int wSpe, String wDir, String aHum, String aPres, String aVis) {
        this.temperature = Temp;
        this.maxTemperature = maxTemp;
        this.minTemperature = minTemp;
        this.description = desc;
        this.wSpeed = wSpe;
        this.wDirection = wDir;
        this.aHumidity = aHum;
        this.aPressure = aPres;
        this.aVisibility = aVis;
    }

    public Weather(int maxTemp, int minTemp, String desc) {
        this.maxTemperature = maxTemp;
        this.minTemperature = minTemp;
        this.description = desc;
    }

    public String toString() {
        return "Temperature: " + this.temperature + "\nMin and Max: " + this.minTemperature + " " + this.maxTemperature + "\nDescription: " + this.description + "\nWind Speed: " + this.wSpeed + "\nWind Direction: " + this.wDirection + "\nHumidity: " + this.aHumidity + "\nAtmospheric Pressure: " + this.aPressure + "\nVisibility: " + this.aVisibility;
    }
}

