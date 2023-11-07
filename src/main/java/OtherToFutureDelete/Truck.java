package OtherToFutureDelete;

import lombok.*;


@Getter
@Setter
@Builder
@ToString
public class Truck implements Comparable <Truck> {
    private String model;
    private int year;
    private int mileage;

    @Override
    public int compareTo(Truck o) {
        Integer result1 = this.getMileage();
        Integer result2 = o.getMileage();
        return Integer.compare(result1, result2);
    }
}
