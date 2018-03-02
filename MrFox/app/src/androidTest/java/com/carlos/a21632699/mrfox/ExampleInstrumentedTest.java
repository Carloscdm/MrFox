package com.carlos.a21632699.mrfox;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.TextView;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest extends ActivityInstrumentationTestCase2<MyLogin> {
    private Button mloginbutton;
    private MyLogin actividad;


    public ExampleInstrumentedTest() {
        super(MyLogin.class);
    }
    protected void setUp() throws Exception {
        super.setUp();
        actividad = getActivity();
        mloginbutton = (Button) actividad.findViewById(R.id.idBTN);
    }
}
