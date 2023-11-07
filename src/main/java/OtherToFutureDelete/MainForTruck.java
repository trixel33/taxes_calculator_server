package OtherToFutureDelete;

import lombok.val;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MainForTruck {
    public static void main(String[] args) {
        Truck truck1 = Truck.builder()
                .model("Volvo")
                .year(2009)
                .mileage(420000)
                .build();
//        System.out.println("Hello");
        Truck truck2 = Truck.builder()
                .model("Man")
                .year(2012)
                .mileage(400000)
                .build();
        Truck truck3 = Truck.builder()
                .model("Kamaz")
                .year(2007)
                .mileage(540000)
                .build();
        Truck truck4 = Truck.builder()
                .model("Nissan")
                .year(2011)
                .mileage(680000)
                .build();
        ArrayList <Truck> truckList = new ArrayList<>();
        truckList.add(truck1);
        truckList.add(truck2);
        truckList.add(truck3);
        truckList.add(truck4);
        Stream <Truck> stream = truckList.stream()
                .sorted();
        stream.forEach(System.out::println);
//        Optional <Truck> optionalList = stream.
    }


}
