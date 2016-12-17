package ainor.com.my.timestable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //List of sifir

        ListView sifirListView = (ListView) findViewById(R.id.sifirListView);

        ArrayList sifir = new ArrayList();

        sifir.add(1);
        sifir.add(2);
        sifir.add(3);
        sifir.add(4);
        sifir.add(5);
        sifir.add(6);
        sifir.add(7);
        sifir.add(8);
        sifir.add(9);
        sifir.add(10);
        sifir.add(11);
        sifir.add(12);

        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, sifir);

        sifirListView.setAdapter(arrayAdapter);


        // control sifir

        SeekBar controlSeekBar = (SeekBar) findViewById(R.id.controlSeekBar);

        controlSeekBar.setMax(12);

        controlSeekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b) {
                Log.i("Sifir : ", String.valueOf(i));
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
