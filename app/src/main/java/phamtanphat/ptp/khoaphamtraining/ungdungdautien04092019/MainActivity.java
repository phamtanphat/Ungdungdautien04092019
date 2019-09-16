package phamtanphat.ptp.khoaphamtraining.ungdungdautien04092019;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //1 : Array : xem , sua
        // Khoi tao
//        String[] mangTens = new String[5];
        //Chinh sua
//        mangTens[0] ="Hoa";
//        mangTens[1] ="Ti";
//        mangTens[2] ="Hue";
//        mangTens[3] ="Lan";
//        mangTens[4] ="Tuan";
//        String mangten[] = {"Hoa","Hue","Lan","Ngoc","Tuan"};
//        for (int i = 0 ; i < mangTens.length ; i++){
//            //ctrl +  P : xem tham so truyen vao
//            Log.d("BBB", mangTens[i]);
//        }
        // 2 : Arraylist
        //khoi tao:

        //type
        //ctrl + space : phim goi y code
        ArrayList<Integer> mangintegers = new ArrayList<>();
        //Them gia tri
        mangintegers.add(1);
        mangintegers.add(2);
        mangintegers.add(3);
        // Xem kich thuoc mang
        Log.d("BBB", String.valueOf(mangintegers.size()));
        // Xoa
        mangintegers.remove(0);
        Log.d("BBB", String.valueOf(mangintegers.size()));
        mangintegers.set(0,5);
        Log.d("BBB", mangintegers.get(0).toString());
    }
}
