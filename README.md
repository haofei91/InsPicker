# MediaPickerInstagram

![gallery](https://cloud.githubusercontent.com/assets/10350755/20528721/99b9154a-b0cd-11e6-8597-d0ddf11bdca4.png) ![capture_photo](https://cloud.githubusercontent.com/assets/10350755/20528723/9aa26b64-b0cd-11e6-983d-e796701f52f8.png) ![capture_video](https://cloud.githubusercontent.com/assets/10350755/20528725/9b248ba8-b0cd-11e6-84b7-a1396cb1219e.png)

## Work In Progress

* ~~Gallery picker~~
* ImageView cropper
* ~~Capture photo~~
* Capture video
* Editor photo

## Project Structure
```
AndroidManifest.xml
assets/
  |- fonts/
java/
  |- com/
  |  |- octopepper/
  |  |  |- mediapickerinstagram/
  |  |  |  |- commons/
  |  |  |  |- components/
  |  |  |  |- MainActivity.java
  |  |  |  |- MainApplication.java
res/
  |- drawable/
  |- layout/
  |- mipmap-hdpi/
  |- mipmap-mdpi/
  |- mipmap-xhdpi/
  |- mipmap-xxhdpi/
  |- mipmap-xxxhdpi/
  |- values/
  |- values-v21/
  |- values-w820dp/
```

## Libraries
### Core
* Butter Knife --> [link](http://jakewharton.github.io/butterknife/)

## Naming Conventions
```java
public class MyClass {

    public static final int SOME_CONSTANT = 42;
    public int publicField;
    private static MyClass sSingleton;
    int mPackagePrivate;
    private int mPrivate;
    protected int mProtected;
    boolean isBoolean;
    boolean hasBoolean;

    @BienView({id})
    View mMyView;

    @BindString({id})
    String _myString;

    @BindColor({id})
    int _myColor;

}
```

Code style for Android --> [link](http://source.android.com/source/code-style.html)

## Android Version Support
Android fragmentation analytics --> [Platform Versions](http://developer.android.com/about/dashboards/index.html#Platform)

* Min API 21 --> Android 5.0
* Max API 29 --> Android 10.0
* support AndroidX.

## Contributors
[penkzhou](https://github.com/penkzhou)


## origin source
[luoyiqi](https://github.com/luoyiqi/MediaPickerInstagram)
