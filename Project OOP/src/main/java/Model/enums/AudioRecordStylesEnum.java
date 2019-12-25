package Model.enums;

public enum AudioRecordStylesEnum {
    ELECTRONIC("ELECTRONIC"),
    ROCK("ROCK"),
    JAZZ("JAZZ"),
    DUBSTEP("DUBSTEP"),
    RHYTHM_AND_BLUES("RHYTHM_AND_BLUES"),
    TECHNO("TECHNO"),
    COUNTRY("COUNTRY");

    private String description;

    private AudioRecordStylesEnum(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
