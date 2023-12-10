package generation.JUnit;

public class Driver
{
    private final String name;

    private final String id;

    private final double fee;

    private double balance;

    private boolean isAvailable = false;
    
    private double distance;

    public Driver( String name, String id, double fee )
    {
        this.name = name;
        this.id = id;
        this.fee = fee;
    }
    
    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public String getName()
    {
        return name;
    }

    public String getId()
    {
        return id;
    }

    public double getFee()
    {
        return fee;
    }

    public double getBalance()
    {
        return balance;
    }

    public boolean isAvailable()
    {
        return isAvailable;
    }

    public void startTrip()
    {
        isAvailable = false;
    }

    public void endTrip()
    {
        isAvailable = true;
        balance += fee * distance;
    }


}
