package com.example.android.lifecycles.step1;

import android.arch.lifecycle.ViewModel;

/**
 * Created by Saurabh on 19-05-2017.
 */

public class ChronometerViewModel extends ViewModel {

    private Long startDate;



    public Long getStartDate() {

        return startDate;
    }

    public void setStartDate(Long startDate) {
        this.startDate = startDate;
    }
}
