package model;

public enum RoomType {
    SINGLE ("1"),
    DOUBLE ("2");
    public final String label;
    private RoomType(String label) {
        this.label = label;
    }
}
