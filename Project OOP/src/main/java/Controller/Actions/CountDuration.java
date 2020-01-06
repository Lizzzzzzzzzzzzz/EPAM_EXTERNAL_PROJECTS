package Controller.Actions;

import Controller.Controller;
import Controller.interfaces.Actionable;
import Model.AudioDisc;
import Model.AudioModel;
import Model.entity.AudioRecord;

import java.util.ArrayList;
import java.util.List;

public class CountDuration {
    AudioModel audioModel = new AudioModel();

    public String action() {
        AudioModel audioModel = new AudioModel();
        List<AudioRecord> records = audioModel.getDiscRecords();
        double dur = 0;
        for (AudioRecord record : records) {
            dur += record.getDuration();
        }
        return records.toString();
    }
}
