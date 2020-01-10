package Controller.Actions;

import Controller.interfaces.Actionable2;
import Model.AudioModel;
import Model.entity.AudioRecord;

import java.util.ArrayList;
import java.util.List;

public class FindByDuration implements Actionable2{

    private AudioModel audioModel = new AudioModel();

    @Override
    public String action(double d1, double d2) {
        List<AudioRecord> records = audioModel.getDiscRecords();
        List<AudioRecord> res = new ArrayList<>();
        AudioRecord rec;
        for (AudioRecord record : records) {
            if (record.getDuration() > d1 && record.getDuration() < d2) {
            res.add(record);
        }
    }
        return res.toString();
    }
}
