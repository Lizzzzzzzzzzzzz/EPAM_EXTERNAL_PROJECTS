package Model;

import Model.entity.AudioRecord;

import java.util.List;

public class AudioModel {

    private static AudioModel instance;
    private static AudioModel AudioModel;
    private List<AudioRecord> records;
    private List<AudioRecord> discRecords;

    public AudioModel() {
        records = AudioDisc.writeDownAudioRecords(10);
        this.discRecords = discRecords;
    }

    public static AudioModel getAudioModel() {
        return AudioModel;
    }

    public static void setAudioModel(Model.AudioModel audioModel) {
        AudioModel = audioModel;
    }

    public List<AudioRecord> getRecords() {
        return records;
    }

    public void setRecords(List<AudioRecord> records) {
        this.records = records;
    }

    public List<AudioRecord> getDiscRecords() {
        return discRecords;
    }

    public void setDiscRecords(List<AudioRecord> discRecords) {
        this.discRecords = discRecords;
    }

    public List<AudioRecord> addRecordToDisc(AudioRecord record) {
        records.add(record);

        return records;
    }

    public List<AudioRecord> getDisc() {
        return records;
    }

    public static AudioModel getInstance() {
        if (instance == null) {
            instance = new AudioModel();
        }
        return instance;
    }

}

