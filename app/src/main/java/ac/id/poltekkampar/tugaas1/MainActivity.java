package ac.id.poltekkampar.tugaas1;

import android.support.v7.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Character op = 'q';
    float i,num,numtemp;
    TextView layar;
    Button tujuh;
    Button satu;
    Button dua;
    Button tiga;
    Button empat;
    Button lima;
    Button enam;
    Button delapan;
    Button sembilan;
    Button tambah;
    Button kurang;
    Button kali;
    Button bagi;
    Button titik;
    Button hasil;
    Button nol;
    Button hapus;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView showResult = (TextView) findViewById(R.id.layar);

        layar = findViewById(R.id.layar);
        tujuh = findViewById(R.id.tujuh);
        tujuh.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("7");
            }
        });

        layar = findViewById(R.id.layar);
        satu = findViewById(R.id.satu);
        satu.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("1");
            }
        });

        layar = findViewById(R.id.layar);
        dua = findViewById(R.id.dua);
        dua.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("2");
            }
        });

        layar = findViewById(R.id.layar);
        tiga = findViewById(R.id.tiga);
        tiga.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("3");
            }
        });

        layar = findViewById(R.id.layar);
        empat = findViewById(R.id.empat);
        empat.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("4");
            }
        });

        layar = findViewById(R.id.layar);
        lima = findViewById(R.id.lima);
        lima.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("5");
            }
        });

        layar = findViewById(R.id.layar);
        enam = findViewById(R.id.enam);
        enam.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("6");
            }
        });

        layar = findViewById(R.id.layar);
        delapan = findViewById(R.id.delapan);
        delapan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("8");
            }
        });

        layar = findViewById(R.id.layar);
        sembilan = findViewById(R.id.sembilan);
        sembilan.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("9");
            }
        });

        layar = findViewById(R.id.layar);
        tambah = findViewById(R.id.tambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("+");
            }
        });

        layar = findViewById(R.id.layar);
        kali = findViewById(R.id.kali);
        kali.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("*");
            }
        });

        layar = findViewById(R.id.layar);
        bagi = findViewById(R.id.bagi);
        bagi.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("/");
            }
        });

        layar = findViewById(R.id.layar);
        kurang = findViewById(R.id.kurang);
        kurang.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("-");
            }
        });

        layar = findViewById(R.id.layar);
        titik = findViewById(R.id.titik);
        titik.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText(",");
            }
        });

        layar = findViewById(R.id.layar);
        hasil = findViewById(R.id.hasil);
        hasil.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("=");
            }
        });

        layar = findViewById(R.id.layar);
        nol = findViewById(R.id.nol);
        nol.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("0");
            }
        });

        layar = findViewById(R.id.layar);
        hapus = findViewById(R.id.hapus);
        hapus.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                layar.setText("CLEAR");
            }
        });

        {
            if(op == '+')
                num = numtemp+num;
            else if(op == '-')
                num = numtemp-num;
            else if(op == '/')
                num = numtemp/num;
            else if(op == '*')
                num = numtemp*num;
            showResult.setText(""+num);
        }

        {
            if(op == '+')
                num = numtemp+num;
            else if(op == '-')
                num = numtemp-num;
            else if(op == '/')
                num = numtemp/num;
            else if(op == '*')
                num = numtemp*num;
        }

    }
}
