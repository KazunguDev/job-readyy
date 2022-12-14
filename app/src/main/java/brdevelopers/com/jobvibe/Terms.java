package brdevelopers.com.jobvibe;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Terms extends AppCompatActivity {

    ImageView iv_back;
    public String email=Home.canemail;
    public String name=Home.name;
    public String degree=Home.getdegree;
    public String fos=Home.getfos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);
        iv_back=findViewById(R.id.IV_back);
        iv_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Terms.this,Home.class);
                intent.putExtra("emailid",email);
                intent.putExtra("name",name);
                intent.putExtra("getdegree",degree);
                intent.putExtra("getfos",fos);
                startActivity(intent);
                overridePendingTransition(R.anim.topttobottom,R.anim.bottomtotop);
                finish();

            }
        });
    }
    @Override
    public void onBackPressed() {
        super.onBackPressed();
        Intent intent=new Intent(Terms.this,Home.class);
        intent.putExtra("emailid",email);
        intent.putExtra("name",name);
        intent.putExtra("getdegree",degree);
        intent.putExtra("getfos",fos);
        startActivity(intent);
        finish();
        overridePendingTransition(R.anim.topttobottom,R.anim.bottomtotop);
    }
}
