# flipperclock
Android library which can be used to implement a flipping clock

![Gif showing example](https://github.com/Fjessin2/flipperclock/blob/master/example.gif)

## Prerequisites

- Android Studio
- An Android studio project
- Internet connection
- minSdkVersion of 19 or higher

## Getting started

To add the library to your Android project, you must do the following two steps:
1. Add the jitpack repository to your root build.gradle file

```
allprojects {
  repositories {
     ...
     maven { url 'https://jitpack.io' }
  }
}
```

2. Add the dependency in your module's build.gradle file

```
dependencies {
    ...
    implementation 'com.github.Fjessin2:flipperclock:1.0.4'
}
```

## Example usage

Include the CountDownClock in your desired layout

```
<dk.fjinc.flipperclocklibrary.CountDownClock
    android:id="@+id/countdownClockFirst"
    android:layout_width="wrap_content"
    android:layout_height="wrap_content"
    android:layout_gravity="center"
    android:clipChildren="false"
    android:clipToPadding="false"
    countdownClock:resetSymbol="8"
    countdownClock:digitSplitterColor="@color/colorAccent"
    countdownClock:digitDividerColor="@color/colorAccent"
    countdownClock:digitTopDrawable="@drawable/background_top"
    countdownClock:digitBottomDrawable="@drawable/background_bottom"
    countdownClock:digitTextColor="@color/colorAccent"
    countdownClock:digitPadding="3dp"
    countdownClock:splitterPadding="1dp"
    countdownClock:animationDuration="350"
    countdownClock:almostFinishedCallbackTimeInSeconds="5"
    countdownClock:countdownTickInterval="250"
    countdownClock:halfDigitHeight="15dp"
    countdownClock:digitWidth="40dp"
    countdownClock:digitTextSize="18sp" />
```

#### Available attributes tweaking

| XML property                                        | Description  | Possible values  |
| :-------------                                      |:-------------| :-----:|
| countdownClock:resetSymbol                          | Sets the default symbol which should be used if countdown isn't started, or is reset. Default value is "" | Any symbol |
| countdownClock:digitSplitterColor                   | Sets the color of the splitter between the minutes and seconds. the ":" symbol.     | Any color |
| countdownClock:digitDividerColor                    | Sets the color of the line between upper and lower side of a digit. Default color is transparent      | Any color |
| countdownClock:digitTopDrawable                     | Sets the drawable background of the upper part of a digit. Default is transparent background      | Any drawable |
| countdownClock:digitBottomDrawable                  | Sets the drawable background of the lower part of a digit. Default is transparent      | Any drawable |
| countdownClock:digitTextColor                       | Sets the color of the digits. Default is transparent      | Any color |
| countdownClock:digitPadding                         | Sets padding to the containers of the countdown digits, except on the sides next to the digit splitter.      | Float, Int |
| countdownClock:splitterPadding                      | Sets padding to the sides of the splitter.     | Float, Int |
| countdownClock:animationDuration                    | Sets how long the total flip animation should be. Default is 600ms      | Int |
| countdownClock:almostFinishedCallbackTimeInSeconds  | Sets when the almost finished callback is invoked. Default is 5 seconds     | Int |
| countdownClock:countdownTickInterval                | Sets how often the current countdown time should be checked. Default is once per second (1000ms)      | Int |
| countdownClock:halfDigitHeight                      | Sets half of the whole digit height. The total height is 2 * halfDigitHeight      | dp, px |
| countdownClock:digitWidth                           | Sets the digit width.      | dp, px |
| countdownClock:digitTextSize                        | Sets the digit text size      | sp, px |


## Other
Questions, ideas and requests are always welcome.

Author: Frederik J Jensen
