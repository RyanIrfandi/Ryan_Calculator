package id.ac.unsyiah.elektro.mobile.ryan.test02;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.HashMap;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
    public void onClickTombolgHItung(View view) {
        EditText txtangka1=(EditText) findViewById(R.id.txtangka1);
        String angka1Str=String.valueOf(txtangka1.getText());
        int angka1=Integer.valueOf(angka1Str);

        EditText txtangka2=(EditText) findViewById(R.id.txtangka2);
        String angka2Str=String.valueOf(txtangka2.getText());
        int angka2=Integer.valueOf(angka2Str);

        EditText angkaI1=(EditText) findViewById(R.id.angkaI1);
        String angkaI1Str=String.valueOf(angkaI1.getText());
        int angka1Imajiner=Integer.valueOf(angkaI1Str);

        EditText angkaI2=(EditText) findViewById(R.id.angkaI2);
        String angkaI2Str=String.valueOf(angkaI2.getText());
        int angka2Imajiner=Integer.valueOf(angkaI2Str);

        Spinner selOperasi =(Spinner)findViewById(R.id.selOperasi);
        String daftarOperasi=String.valueOf(selOperasi.getSelectedItem());
        int Hasil=0;
        int hasilI=0;

        if(daftarOperasi.equalsIgnoreCase("+" )){
            Hasil = angka1+angka2;
            hasilI= angka1Imajiner+angka2Imajiner;

        }
        else if (daftarOperasi.equalsIgnoreCase("-" )){
            Hasil = angka1-angka2;
            hasilI= angka1Imajiner-angka2Imajiner;

        }

        else if (daftarOperasi.equalsIgnoreCase("*")){
             Hasil = (angka1*angka2)+(-(angka1Imajiner*angka2Imajiner));
            hasilI= angka1Imajiner*angka2+angka2Imajiner*angka1;

        }

        char tanda;

        if(hasilI<=0){
            tanda='-';
            hasilI*=-1;
        }
        else {
            tanda='+';
        }


        String hasilStr=String.valueOf(Hasil);
        String hasil2Str=String.valueOf(hasilI);

         TextView lblhasil=(TextView)findViewById(R.id.lblhasil);
        lblhasil.setText(hasilStr+tanda+"j"+hasil2Str);



    }
    }



