package Controller.Actions;

import Controller.Controller;
import Controller.interfaces.Actionable;
import Model.AudioDisc;
import Model.AudioModel;
import Model.entity.AudioRecord;

import java.util.ArrayList;
import java.util.List;

public class CountDuration implements Actionable {
    private AudioModel audioModel = new AudioModel();

    public void action() {
        List<AudioRecord> records = audioModel.getDiscRecords();
        double dur = 0;
        for (AudioRecord record : records) {
            dur += record.getDuration();
        }
        System.out.println("");
    }
}
