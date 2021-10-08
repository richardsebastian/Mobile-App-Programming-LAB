package umn.ac.id.uts_lab_33861;

public class Audio {
    private String title;
    private String description;
    private String soundUri;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSoundUri() {
        return soundUri;
    }

    public void setSoundUri(String soundUri) {
        this.soundUri = soundUri;
    }
    public Audio(String title, String description, String soundUri) {
        this.title = title;
        this.description = description;
        this.soundUri = soundUri;
    }
}
