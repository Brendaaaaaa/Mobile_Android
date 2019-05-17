package hello.brenda.com.br.numeroaleatorio;

import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarNumero(View view)
    {
        TextView tv = (TextView) findViewById(R.id.txt);
        int num = new Random().nextInt(10);
        Resources res = getResources();
        String resp = res.getString(R.string.txt);
        String space = res.getString(R.string.space);
        tv.setText(resp +space+ num);

    }
}
