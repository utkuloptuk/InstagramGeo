package linkedgeo.linkedgeo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import linkedgeo.linkedgeo.Facebook.face_Login;
import linkedgeo.linkedgeo.Instagram.insta_Login;
import linkedgeo.linkedgeo.Local.localGeo;

public class MedyaSecimEkrani extends AppCompatActivity {

    //değişken tanımlamaları burada başladı
    Button instagram_Button;
    Button facebook_Button;
    Button local_Button;
    ImageView media_Logo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medya_secim_ekrani);

        //sayfa üzerinde bulunan bileşenler buradaki değişkenlere bağlandı
        Button instagram_Button =(Button)findViewById(R.id.instaButton);
        Button facebook_Button=(Button)findViewById(R.id.faceButton);
        Button local_Button=(Button)findViewById(R.id.localButton);
        ImageView media_Logo=(ImageView)findViewById(R.id.mediaLogo);


        /*Şahsi Not:bir activity'den diğer activity'e bağlantı kurabilmek için intent yapısı kullanılır.
        * Bunun için;
        * İlk olarak intent objesi olusturulur.(intent(suan bulunan sınıf.this, gidilecek olan sınıf.class))
        * bu intent ne yapılacağı set edilir.(i.setclass(getApplicationContext(), insta_Login.class))
        * Activity başlatılır.(startActivity(i))
        * */

        //Bağlanan değişkenlereActivity ataması yapıldı

        //Instagram activitysine bağlantı
        instagram_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            Intent i = new Intent(MedyaSecimEkrani.this, insta_Login.class);
                i.setClass(getApplicationContext(), insta_Login.class);
                startActivity(i);
            }
        });

        //Facebook activity'sine bağlantı
        facebook_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MedyaSecimEkrani.this,face_Login.class);
                i.setClass(getApplicationContext(), face_Login.class);
                startActivity(i);
            }
        });

        //Local activitysine bağlantı
        local_Button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i =new Intent(MedyaSecimEkrani.this, localGeo.class);
                i.setClass(getApplicationContext(), localGeo.class);
                startActivity(i);
            }
        });




    }
}
