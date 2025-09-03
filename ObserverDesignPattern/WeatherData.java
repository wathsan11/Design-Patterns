import java.util.ArrayList;

public class WeatherData implements WhetherStation {
    private ArrayList observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData(){
        observers = new ArrayList<>();
    }
    
    public void registerObserver(Observer o){
        observers.add(o);
    }

    public void removeObserver(Observer o){
        int i = observers.indexOf(o);
        if(i>=0){
            observers.remove(i);
        }
    }

    public void notifyObservers(){
        for(int i=0; i< observers.size();i++){
            Observer ob = (Observer)observers.get(i);
            ob.update(temperature, humidity, pressure);
        }
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temp,float humidity,float pressure){
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
    
}
