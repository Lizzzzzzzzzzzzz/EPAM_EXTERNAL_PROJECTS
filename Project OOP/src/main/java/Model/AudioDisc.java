package Model;

import Model.entity.AudioRecord;
import Model.enums.AudioRecordStylesEnum;
import Model.enums.Authors;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class AudioDisc {
    public static List<AudioRecord> writeDownAudioRecords(int amount) {
        List<AudioRecord> records = new ArrayList<AudioRecord>();
        Random random = new Random();
        while (amount-- > 0) {
            double duration = random.nextInt(300);
            AudioRecordStylesEnum style = AudioRecordStylesEnum.values()[random.nextInt(AudioRecordStylesEnum.values().length)];
            Authors author = Authors.values()[random.nextInt(Authors.values().length)];
            AudioRecord record = new AudioRecord(duration, author, style);
            records.add(record);
        }
        return records;
    }
}
