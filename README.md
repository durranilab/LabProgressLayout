# LabProgressLayout
###### Quite simple effective Progress Bar Layout

[ ![Download](https://api.bintray.com/packages/durranilab/maven/com.durranilab.labprogresslayout/images/download.svg) ](https://bintray.com/durranilab/maven/com.durranilab.labprogresslayout/_latestVersion)


![alt text](https://raw.githubusercontent.com/durranilab/LabProgressLayout/master/lab_layout.jpg)

Simple,Colorful and Rounded(optional) Progress Bar Layout for Android.

Min API 16

### Usage

#### in your build.gradle (Module)
```
implementation 'com.durranilab:LabProgress:1.0'
```

in your .xml
```
 <com.durranilab.labprogresslayout.LabProgressLayout
                android:id="@+id/labProgressLayout"
                android:layout_width="match_parent"
                android:layout_height="10dp"
                app:autoProgress="true"
                app:cornerRadius="10"
                app:emptyColor="#e8f5e9"
                app:loadedColor="#81c784"
                app:maxProgress="100" />

```
Change emptyColor and loadedColor as needed.

in your activity

```
//Declare
LabProgressLayout labProgressLayout;

//Define
labProgressLayout = findViewById(R.id.labProgressLayout);

//Usage
labProgressLayout.setCurrentProgress(100);

// Optional Functions
// Max Progress
labProgressLayout.setMaxProgress(100);

// AutoProgress
labProgressLayout.setAutoProgress(true);

//Callback Listeners

labProgressLayout.setProgressLayoutListener(new LabProgressLayoutListener() {
                                      @Override
                                      public void onProgressCompleted() {

                                      }

                                      @Override
                                      public void onProgressChanged(int seconds) {

                                      }
                                  });


```

for support please email contact@durranilab.com

#### Thank You








