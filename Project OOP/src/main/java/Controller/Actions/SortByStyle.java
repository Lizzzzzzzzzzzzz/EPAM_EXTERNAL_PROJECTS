package Controller.Actions;

import java.util.Collections.*;
import java.util.List;

import Controller.interfaces.Actionable;
import Model.AudioModel;
import Model.entity.AudioRecord;

public class SortByStyle {

    AudioModel model = AudioModel.getInstance();

    public String action() {
        model.getDiscRecords().sort((AudioRecord a1, AudioRecord a2) -> a1.getStyle().compareTo(a2.getStyle()));
        return "";
    }



}
