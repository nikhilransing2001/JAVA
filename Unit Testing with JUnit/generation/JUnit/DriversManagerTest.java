package generation.JUnit;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.jupiter.api.Test;

public class DriversManagerTest
{

    private final DriversManager driversManager = new DriversManager();

    @Before
    public void setup(){
        driversManager.addPassenger( new Passenger( "Carlos", "44234", 100 ) );
        driversManager.addPassenger( new Passenger( "Elise", "533434", 100 ) );
        driversManager.addPassenger( new Passenger( "Ian", "5343433", 100 ) );
        driversManager.addPassenger( new Passenger( "Debbie", "44555521", 100 ) );
        driversManager.addPassenger( new Passenger( "Cleon", "559988", 100 ) );
        driversManager.addPassenger( new Passenger( "Santiago", "1203123", 100 ) );

        driversManager.addDriver( new Driver( "Emilio", "1234990", 10f ) );
        driversManager.addDriver( new Driver( "Pedro", "12312440", 12f ) );
        driversManager.addDriver( new Driver( "Constanza", "9824990", 11f ) );
    }
    @Test
    public void addPassengerTest() {
        Passenger passenger = new Passenger("John", "654321", 50);
        driversManager.addPassenger(passenger);
        assertEquals(passenger, driversManager.getPassenger("654321"));
    }
    
    @Test
    public void addDriverTest() {
        Driver driver = new Driver("Michael", "987654", 15f);
        driversManager.addDriver(driver);
        assertEquals(driver, driversManager.getDriver("987654"));
    }
    
    @Test
    public void startTripTest() {
        // Implement the test logic
        Passenger passenger = driversManager.getPassenger("44234");
        Driver driver = driversManager.getDriver("1234990");
        driversManager.startTrip(passenger.getId(), driver.getId());
        assertTrue(passenger.isOnTrip());
        assertFalse(driver.isAvailable());
    }

    @Test
    public void endTripTest() {
        // Implement the test logic
        Passenger passenger = driversManager.getPassenger("44234");
        Driver driver = driversManager.getDriver("1234990");
        driversManager.endTrip(passenger.getId(), driver.getId(), 0);
        assertFalse(passenger.isOnTrip());
        assertTrue(driver.isAvailable());
    }

    @Test
    public void nextAvailableDriverTest() {
        // Implement the test logic, intentionally make it fail
        assertEquals("driver_id", driversManager.findNextAvailableDriver());
    }
    
    @Test
    public void startTripPassengerNotExistsTest() {
        // Test when starting a trip with a non-existing passenger
        driversManager.addDriver(new Driver("Michael", "987654", 15f));
        assertFalse(driversManager.getPassenger("invalidPassengerId").isOnTrip());
    }

    @Test
    public void endTripDriverNotExistsTest() {
        // Test when ending a trip with a non-existing driver
        driversManager.addPassenger(new Passenger("John", "654321", 50));
        driversManager.endTrip("654321", "invalidDriverId", 0);
        assertFalse(driversManager.getDriver("invalidDriverId").isAvailable());
    }
}