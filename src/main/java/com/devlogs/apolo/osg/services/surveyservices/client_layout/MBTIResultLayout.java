package com.devlogs.apolo.osg.services.surveyservices.client_layout;


/*
*
*     <LinearLayout
        android:orientation="vertical"
        android:gravity="center"
        android:layout_width="match_parent"
        android:layout_height="match_parent">
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="MBTI"
            android:textColor="@color/colorRed"
            android:textSize="27sp"
            android:textStyle="bold"
            android:textAlignment="center" />
        <TextView
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:text="asdasd ajsdnakjsdn asjdnaskjnd asdjnaskjdnaskdnas asjkdnkasjndas"
            android:textColor="#000000"
            android:paddingTop="10dp"
            android:textSize="14sp"
            android:textAlignment="center" />
    </LinearLayout>

* */

public class MBTIResultLayout {
    public final String type = "LinearLayout";
    public final String layout_width =  "match_parent";
    public final String layout_height = "match_parent";
    public final String orientation = "vertical";
    public final String gravity = "center";
    public final String padding = "10dp";
    public final String background = "#ffffff";
    public final Object[] children = {
            new Object() {
                public final String layout_width =  "match_parent";
                public final String layout_height = "wrap_content";
                public final String type = "TextView";
                public final String text = "$resultDetail.result";
                public final String textColor = "#D14555";
                public final String textSize = "26sp";
                public final String textAlignment = "center";
            },
            new Object() {
                public final String layout_width =  "match_parent";
                public final String layout_height = "wrap_content";
                public final String type = "TextView";
                public final String text = "$resultDetail.description";
                public final String textColor = "#000000";
                public final String textSize = "13sp";
                public final String paddindTop = "10dp";
                public final String textAlignment = "center";
            }
    };
}
