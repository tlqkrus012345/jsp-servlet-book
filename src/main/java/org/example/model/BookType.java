package org.example.model;

public enum BookType {
    LITERATURE("문학"),
    ECONOMY("경제"),
    EDUCATION("교육");
    private final String value;
    BookType(String value) {
        this.value = value;
    }
    public String getValue() {
        return value;
    }
    public static BookType fromValue(String value) {
        for (BookType bookType : BookType.values()) {
            if (bookType.value.equals(value)) {
                return bookType;
            }
        }
        throw new IllegalArgumentException("Invalid BookType value: " + value);
    }
}
