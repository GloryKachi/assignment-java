package Airconditional;

public class Airconditioner {
    private boolean isOn;
    private int temperature;

    public void setOn(boolean state){
        isOn = state;

    }

    public boolean getACIsOn(){
        return isOn;

    }

    public int getTemperature(){
        return temperature;

    }

    public void increaseTemperature(){
        if(temperature < 30){
            temperature = temperature + 1;
        }

    }


    public void decreaseTemperatue(){
        if(temperature > 16){
            temperature = temperature - 1;

        }

    }

}
