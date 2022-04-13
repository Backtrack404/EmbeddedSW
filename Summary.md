# 1. 안드로이드 기본 구조

## 1. Android Architecture

| 어플리케이션 |        |
| :---:|    :---:    |
| 어플리케이션 프레임워크  |
| 라이브러리 | 런타임    |
| 리눅스 커널|         |

## 2. 프로젝트 뷰

``` tree
app
└─── manifests
│       AndroidManifest.xml    // 프로젝트 기본정보 관리
│
└─── Java                      // 자바 클래스 관리
│    └─── Pakage name
│           MainActivity
└─── res                       // 리소스 관리(레이아웃, 이미지, ...)
     └─── drawable
     └─── layout
     │      activity_main.xml
     └─── mipmap
     └─── values
            colors.xml
            strings.xml
            styles.xml
```

## 3. AndroidManifests.xml

``` xml

<?xml version="1.0" encoding="utf-8"?>
<manifest xmlns:android="http://schemas.android.com/apk/res/android"
          package="com.example.lifecycle">

    <application
            android:allowBackup="true"
            android:icon="@mipmap/ic_launcher"    // 아이콘 이미지 설정
            android:label="@string/app_name"      // app 이름 설정(res - values - strings.xml에 위치) 
            android:roundIcon="@mipmap/ic_launcher_round"
            android:supportsRtl="true"
            android:theme="@style/Theme.LifeCycle">
        <activity
                android:name=".MainActivity"
                android:exported="true">
            <intent-filter>
                <action android:name="android.intent.action.MAIN"/>

                <category android:name="android.intent.category.LAUNCHER"/>
            </intent-filter>
        </activity>
    </application>

</manifest>

```

