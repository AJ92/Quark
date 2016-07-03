package com.threedevs.quarkengine.core;


import android.content.Context;
import android.graphics.PixelFormat;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;

/**
 * Created by AJ on 14.11.2014.
 */

public class OpenGLSurfaceView extends GLSurfaceView {

    protected final OpenGLEngine renderer;
    private String TAG = "OpenGLSurfaceView";

    public OpenGLSurfaceView(Context context, AttributeSet attrs) {
        super(context, attrs);

        // Create an OpenGL ES 2.0 context.
        setEGLContextClientVersion(2);

        setEGLContextClientVersion(2);
        setEGLConfigChooser(8, 8, 8, 8, 16, 0);

        renderer = new OpenGLEngine(this);

        setRenderer(renderer);

        // old : TRANSLUCENT  possible fix for sigseg fault...
        getHolder().setFormat(PixelFormat.TRANSPARENT);
        setZOrderMediaOverlay(true);

        // Render the view all the time...
        setRenderMode(GLSurfaceView.RENDERMODE_CONTINUOUSLY);
    }


    public void onInit(){

    }

    public void onPreDrawFrame(){

    }

    public void onPostDrawFrame(){

    }

    @Override
    public boolean onTouchEvent(MotionEvent e) {
        // MotionEvent reports input details from the touch screen
        // and other input controls. In this case, you are only
        // interested in events where the touch position changed.

        float x = e.getX();
        float y = e.getY();

        switch (e.getAction()) {
            case MotionEvent.ACTION_MOVE: {
                break;
            }

            case MotionEvent.ACTION_DOWN: {
                break;
            }

            case MotionEvent.ACTION_UP: {
                break;
            }
        }
        return true;
    }
}
