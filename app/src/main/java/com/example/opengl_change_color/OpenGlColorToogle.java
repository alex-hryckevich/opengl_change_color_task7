package com.example.opengl_change_color;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;

import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

import static android.opengl.GLES20.glClear;
import static android.opengl.GLES20.glClearColor;
import static android.opengl.GLES20.glViewport;

public class OpenGlColorToogle implements GLSurfaceView.Renderer {

    float r=0.1f,g=0.5f,b=0.9f;

    @Override
    public void onDrawFrame(GL10 arg0) {
        glClearColor(r, g, b, 1);
        glClear(GLES20.GL_COLOR_BUFFER_BIT|GLES20.GL_DEPTH_BUFFER_BIT);
    }

    @Override
    public void onSurfaceChanged(GL10 arg0, int width, int height) {
        glViewport(0, 0, width, height);
    }

    @Override
    public void onSurfaceCreated(GL10 arg0, EGLConfig arg1) {
        draw(false);
    }

    public void draw(boolean redColor){
        if(redColor){
            r = 1f;
            b = 1f;
            g = 0f;
        }
        else {
            r = 1f;
            b = 0f;
            g = 0f;
        }
    }

}