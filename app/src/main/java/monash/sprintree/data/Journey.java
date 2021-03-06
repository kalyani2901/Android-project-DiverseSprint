package monash.sprintree.data;

import com.orm.SugarRecord;

import java.util.List;


public class Journey extends SugarRecord<Journey> {

    public Long timestamp;
    public String date;
    public long score;
    public long distance;   //meters
    public int hours;
    public int mins;
    public int seconds;
    public String journeyImagePath; // path of image in local database

    public List<JourneyPath> getPath() {
        return JourneyPath.find(JourneyPath.class, "journey = ?",  getId().toString());
    }

    public List<JourneyTree> getTrees() {
        return JourneyTree.find(JourneyTree.class, "journey = ?",  getId().toString());
    }
}
