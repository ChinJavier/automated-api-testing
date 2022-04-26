package utils.constants;

public enum QueryParams implements Constant<String> {

    CHECK_IN("checkin");

    private String value;

    QueryParams(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return this.value;
    }
}
