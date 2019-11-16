package com.example.navecontextmenu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

/**
 * this activity show you the first 20 numbers from your chosen sidra and give you the option to see the place or the sum of the choosen num
 */
public  class Main2Activity extends AppCompatActivity implements View.OnLongClickListener, OnItemLongClickListener {
    int first,hefr,sid,index,summ;
    String fn,hef,ort;
    ListView lv4;
    Integer [] twenty={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
    TextView tv3;


    @Override

    /**
     * this act create the context menu
     */
    public void onCreateContextMenu(ContextMenu menu, View v,
                                    ContextMenu.ContextMenuInfo menuInfo) {
        menu.setHeaderTitle("Operations");
        menu.add("place");
        menu.add("sum");

    }

    /**
     * this act set the choosen information on textview
     * @param item
     * @return
     */
    public boolean onContextItemSelected(MenuItem item) {
        String oper=item.getTitle().toString();
        if (oper.equals("sum")) {
            for (int i=0;i<=index;i++){
              summ=twenty[i]+summ;
            }
            tv3.setText("sum is"+""+summ);
        }

        if (oper.equals("place")) {
            index++;
            tv3.setText("index is"+""+index);
        }

        return super.onContextItemSelected(item);}

    /**
     * this act fill the twenty list with numbers and set the listeners for the listview
     * @param savedInstanceState
     */
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent di=getIntent();

        fn = di.getStringExtra("n");
         hef = di.getStringExtra("nn");
         ort = di.getStringExtra("nnn");

         first=Integer.parseInt(fn);
         hefr=Integer.parseInt(hef);
         sid=Integer.parseInt(ort);

         lv4= findViewById(R.id.lv4);
         tv3=findViewById(R.id.textView2);



         if ((sid==1)){
             twenty[0]= first;
             twenty[1]= first*hefr;
             twenty[2]= twenty[1]*hefr;
             twenty[3]= twenty[2]*hefr;
             twenty[4]= twenty[3]*hefr;
             twenty[5]= twenty[4]*hefr;
             twenty[6]= twenty[5]*hefr;
             twenty[7]= twenty[6]*hefr;
             twenty[8]= twenty[7]*hefr;
             twenty[9]= twenty[8]*hefr;
             twenty[10]= twenty[9]*hefr;
             twenty[11]= twenty[10]*hefr;
             twenty[12]= twenty[11]*hefr;
             twenty[13]= twenty[12]*hefr;
             twenty[14]= twenty[13]*hefr;
             twenty[15]= twenty[14]*hefr;
             twenty[16]= twenty[15]*hefr;
             twenty[17]= twenty[16]*hefr;
             twenty[18]= twenty[17]*hefr;
             twenty[19]= twenty[18]*hefr;
             ArrayAdapter <Integer> adp = new ArrayAdapter<Integer>(this,R.layout.support_simple_spinner_dropdown_item,twenty);
             lv4.setAdapter(adp);
             lv4.setOnCreateContextMenuListener(this);
             lv4.setOnItemLongClickListener(this);
         }
        if ((sid==2)){
            twenty[0]= first;
            twenty[1]= first+hefr;
            twenty[2]= twenty[1]+hefr;
            twenty[3]= twenty[2]+hefr;
            twenty[4]= twenty[3]+hefr;
            twenty[5]= twenty[4]+hefr;
            twenty[6]= twenty[5]+hefr;
            twenty[7]= twenty[6]+hefr;
            twenty[8]= twenty[7]+hefr;
            twenty[9]= twenty[8]+hefr;
            twenty[10]= twenty[9]+hefr;
            twenty[11]= twenty[10]+hefr;
            twenty[12]= twenty[11]+hefr;
            twenty[13]= twenty[12]+hefr;
            twenty[14]= twenty[13]+hefr;
            twenty[15]= twenty[14]+hefr;
            twenty[16]= twenty[15]+hefr;
            twenty[17]= twenty[16]+hefr;
            twenty[18]= twenty[17]+hefr;
            twenty[19]= twenty[18]+hefr;
            ArrayAdapter <Integer> adp = new ArrayAdapter<Integer>(this,R.layout.support_simple_spinner_dropdown_item,twenty);
            lv4.setAdapter(adp);
            lv4.setOnCreateContextMenuListener(this);
            lv4.setOnItemLongClickListener(this);
        }
        if ((sid !=1)|| (sid !=2)){
            Toast toast1;
            toast1 = Toast.makeText(this, "plz pick 1 or 2", Toast.LENGTH_SHORT);
            toast1.show();
        }
    }


    /**
     * this act send the user back to the open activity
     * @param view
     */
    public void goback(View view) {
        finish();
    }



    @Override
    /**
     * this is the long click listener and it gave us the information about the position of the num we picked
     */
    public boolean onItemLongClick(AdapterView<?> parent, View view, int position, long id) {
       index= position;
        return false;
    }

    @Override
    public boolean onLongClick(View v) {
        return false;
    }
}
