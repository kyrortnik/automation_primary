package test.java.by.epam;

import main.java.by.epam.Airport;
import main.java.by.epam.planes.ExperimentalPlane;
import main.java.by.epam.models.ClassificationLevel;
import main.java.by.epam.models.ExperimentalType;
import main.java.by.epam.models.MilitaryType;
import main.java.by.epam.planes.MilitaryPlane;
import main.java.by.epam.planes.PassengerPlane;
import main.java.by.epam.planes.Plane;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class AirportTest {

    private static List<Plane> planes = Arrays.asList(
            new PassengerPlane("Boeing-737", 900, 12000, 60500, 164),
            new PassengerPlane("Boeing-737-800", 940, 12300, 63870, 192),
            new PassengerPlane("Boeing-747", 980, 16100, 70500, 242),
            new PassengerPlane("Airbus A320", 930, 11800, 65500, 188),
            new PassengerPlane("Airbus A330", 990, 14800, 80500, 222),
            new PassengerPlane("Embraer 190", 870, 8100, 30800, 64),
            new PassengerPlane("Sukhoi Superjet 100", 870, 11500, 50500, 140),
            new PassengerPlane("Bombardier CS300", 920, 11000, 60700, 196),
            new ExperimentalPlane("Bell X-14", 277, 482, 500, ExperimentalType.HIGH_ALTITUDE, ClassificationLevel.SECRET),
            new ExperimentalPlane("Ryan X-13 Vertijet", 560, 307, 500, ExperimentalType.VTOL, ClassificationLevel.TOP_SECRET),
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT)
    );

    private static List<MilitaryPlane> militaryPlanes = Arrays.asList(
            new MilitaryPlane("B-1B Lancer", 1050, 21000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("B-2 Spirit", 1030, 22000, 70000, MilitaryType.BOMBER),
            new MilitaryPlane("B-52 Stratofortress", 1000, 20000, 80000, MilitaryType.BOMBER),
            new MilitaryPlane("F-15", 1500, 12000, 10000, MilitaryType.FIGHTER),
            new MilitaryPlane("F-22", 1550, 13000, 11000, MilitaryType.FIGHTER),
            new MilitaryPlane("C-130 Hercules", 650, 5000, 110000, MilitaryType.TRANSPORT)
    );

    private static Airport airport = new Airport(planes);
    private static PassengerPlane planeWithMaxPassengerCapacity = new PassengerPlane("Boeing-747", 980, 16100, 70500, 242);

    @Test
    public void getTransportMilitaryPlanes() {
        List<MilitaryPlane> expected = airport.getMilitaryPlanes();
        List<MilitaryPlane> actual  = militaryPlanes;
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void getPassengerPlaneWithMaxCapacity() {
        PassengerPlane expectedPlaneWithMaxPassengersCapacity = airport.getPassengerPlaneWithMaxPassengersCapacity();
        PassengerPlane actualPlaneWithMaxPassengersCapacity = planeWithMaxPassengerCapacity;
        Assert.assertTrue(expectedPlaneWithMaxPassengersCapacity.equals(planeWithMaxPassengerCapacity));
    }

    @Test
    public void sortPlanesByMaxLoadCapacity() {
        airport.sortByMaxLoadCapacity();
        Plane firstPlane = airport.getPlanes().get(0);
        Plane secondPlane = airport.getPlanes().get(1);
        Assert.assertTrue(firstPlane.getMaxLoadCapacity() < secondPlane.getMaxLoadCapacity());
    }

    @Test
    public void hasAtLeastOneBomberInMilitaryPlanes() {
        List<MilitaryPlane> bomberMilitaryPlanes = airport.getBomberMilitaryPlanes();
        Assert.assertNotNull(bomberMilitaryPlanes);
    }

    @Test
    public void testExperimentalPlanesHasClassificationLevelHigherThanUnclassified(){
        List<ExperimentalPlane> experimentalPlanes = airport.getExperimentalPlanes();
        boolean hasHigherThanUnclassifiedPlanes = false;
        for(ExperimentalPlane experimentalPlane : experimentalPlanes){
            if(experimentalPlane.getClassificationLevel() != ClassificationLevel.UNCLASSIFIED){
                hasHigherThanUnclassifiedPlanes = true;
                break;
            }
        }
        Assert.assertTrue(hasHigherThanUnclassifiedPlanes);
    }
}
