package Domain; /**
 * Created by Usuario on 12/01/2017.
 */

//Todo change the name of the propertys to the one matching the JSON
public class Weather {
    private String today = "";
    private int temp = 0;
    private int maxTemperature = 0;
    private int minTemperature = 0;
    private String description = "";
    private int speed = 0;
    private String direction = "";
    private int humidity = 0;
    private float pressure = 0f;
    private String text = "";

    public String getToday() {
        return today;
    }

    public void setToday(String today) {
        this.today = today;
    }

    public int getTemp() {
        return this.temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
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

    public int getSpeed() {
        return this.speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return this.direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public int getaHumidity() {
        return this.humidity;
    }

    public void setaHumidity(int aHumidity) {
        this.humidity = aHumidity;
    }

    public float getPressure() {return this.pressure;}

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Weather(){

    }
    public Weather(int Temp, int maxTemp, int minTemp, String desc, int wSpe, String wDir, int aHum, int aPres, String aVis) {
        this.temp = Temp;
        this.maxTemperature = maxTemp;
        this.minTemperature = minTemp;
        this.description = desc;
        this.speed = wSpe;
        this.direction = wDir;
        this.humidity = aHum;
        this.pressure = aPres;
        this.text = aVis;
    }

    public Weather(int maxTemp, int minTemp, String desc) {
        this.maxTemperature = maxTemp;
        this.minTemperature = minTemp;
        this.description = desc;
    }

    public String toString() {
        return "Temperature: " + this.temp + "\nMin and Max: " + this.minTemperature + " " + this.maxTemperature + "\nDescription: " + this.description + "\nWind Speed: " + this.speed + "\nWind Direction: " + this.direction + "\nHumidity: " + this.humidity + "\nAtmospheric Pressure: " + this.pressure + "\nVisibility: " + this.text;
    }

    public String shortToString(){
        return "Max: " + this.maxTemperature + "\nMin: " + this.minTemperature + "\nSummary: " + this.description;
    }
}

