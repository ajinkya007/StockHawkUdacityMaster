package com.sam_chordas.android.stockhawk.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by ajinkyawavare on 4/17/2016.
 */
public class DateHighMain implements Serializable {
    public List<DateHigh> datehigh = new ArrayList<DateHigh>();

    public List<DateHigh> getDatehigh() {
        return datehigh;
    }

    /**
     *
     * @param datehigh
     * The datehigh
     */
    public void setDatehigh(List<DateHigh> datehigh) {
        this.datehigh = datehigh;
    }
    public void addDatehigh(DateHigh datehigh) {
        this.datehigh.add(datehigh);
    }
}
