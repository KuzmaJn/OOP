package entity;

public enum MotorcycleType {
    CRUISER,
    SCOOTER,
    SPORT,
    ;
    @Override
    public String toString() {
        return switch (this) {
            case CRUISER -> "Cruiser";
            case SCOOTER -> "Scooter";
            case SPORT -> "Sport";
        };
    }
}
