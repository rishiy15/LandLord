package com.example.aurav.myapplication;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import android.widget.CalendarView.OnDateChangeListener;
import android.widget.Toast;

/**
 * Created by ryemme on 7/21/2016.
 */
public class CalendarActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.calendar_fragment);
        CalendarView calendarView=(CalendarView) findViewById(R.id.calendar);
        calendarView.setOnDateChangeListener(new OnDateChangeListener() {

            @Override
            public void onSelectedDayChange(CalendarView view, int year, int month,
                                            int dayOfMonth) {
                Toast.makeText(getApplicationContext(), dayOfMonth +"/"+month+"/"+ year, Toast.LENGTH_LONG).show();// TODO Auto-generated method stub

            }
        });
    }
}
