package Model.entity;

import Model.enums.AudioRecordStylesEnum;
import Model.enums.Authors;

public class AudioRecord {
    private double duration;
    private Authors author;
    private AudioRecordStylesEnum style;

    public AudioRecord(double duration, Authors author, AudioRecordStylesEnum style) {
        this.duration = duration;
        this.author = author;
        this.style = style;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public Authors getAuthor() {
        return author;
    }

    public void setAuthor(Authors author) {
        this.author = author;
    }

    public AudioRecordStylesEnum getStyle() {
        return style;
    }

    public void setStyle(AudioRecordStylesEnum style) {
        this.style = style;
    }
}
