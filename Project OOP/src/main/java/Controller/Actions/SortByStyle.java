package Controller.Actions;

import java.util.Collections.*;
import Controller.interfaces.Actionable;
import Model.AudioModel;
import Model.entity.AudioRecord;

public class SortByStyle implements Actionable {

    private AudioModel model = AudioModel.getInstance();

    @Override
    public void action() {
        model.getDiscRecords().sort((AudioRecord a1, AudioRecord a2) -> a1.getStyle().compareTo(a2.getStyle()));
        System.out.println("");
    }

}
