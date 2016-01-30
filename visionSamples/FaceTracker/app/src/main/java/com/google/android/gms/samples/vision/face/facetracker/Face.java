package com.google.android.gms.samples.vision.face.facetracker;

/**
 * Created by mray on 1/29/16.
 */
public class Face {

    public class Point {
        float x;
        float y;
        public Point() {
            x = 0;
            y = 0;
        }
    }

    public Point left_eye, right_eye, nose, left_cheek, right_cheek, left_lip, right_lip, chin;

    public Face() {
        
    }


}
