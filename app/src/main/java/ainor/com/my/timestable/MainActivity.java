package ainor.com.my.timestable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    public void generateTimesTable (int timesTable) {


        ArrayList sifir = new ArrayList();

        for (int i = 1; i <= 12; i++) {
            sifir.add(Integer.toString(i*timesTable));
        }


        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, sifir);

        listView.setAdapter(arrayAdapter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        //List of sifir

        listView = (ListView) findViewById(R.id.listView);
        generateTimesTable(6);


        // control sifir

        final SeekBar controlSeekBar = (SeekBar) findViewById(R.id.controlSeekBar);

        controlSeekBar.setMax(12);
        controlSeekBar.setProgress(6);

        controlSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {


                int min = 1;
                int timesTable;
                if (i < min) {
                    timesTable = min;
                    controlSeekBar.setProgress(min);
                } else {
                    timesTable = i;
                }

                generateTimesTable(timesTable);
                Log.i("TimesTable : ", String.valueOf(timesTable));

            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });


    }
}
