package org.glucosio.android.db;

import java.util.Date;

import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class HB1ACReading extends RealmObject {
    @PrimaryKey
    private long id;

    private int reading;
    private Date created;

    public HB1ACReading() {
    }

    public HB1ACReading(int reading,Date created) {
        // %
        this.reading=reading;
        this.created=created;
    }

    public int getReading() {
        return reading;
    }

    public void setReading(int reading) {
        this.reading = reading;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
