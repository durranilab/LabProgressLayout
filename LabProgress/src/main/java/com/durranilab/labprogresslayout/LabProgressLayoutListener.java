package com.durranilab.labprogresslayout;

public interface LabProgressLayoutListener {
    void onProgressCompleted();
    void onProgressChanged(int seconds);
}
