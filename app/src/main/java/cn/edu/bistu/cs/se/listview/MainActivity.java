package cn.edu.bistu.cs.se.listview;

import android.app.Activity;
import android.app.ListActivity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static cn.edu.bistu.cs.se.listview.R.id.txtName;

public class MainActivity extends Activity {

    private final static String NAME="name";
    private final static String CLASS="class";
    private final static String NUMBER="number";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        String[] name={"张三","李四","王五","赵六"};
        String[] classs={"软工1401","软工1402","网工1403","计科1404"};
        String[] number={"2014011000","2014011001","2014011002","2014011003"};

        List<Map<String,Object>> items=new ArrayList<Map<String,Object>>();

        for(int i=0;i<name.length;i++) {
            Map<String,Object> item=new HashMap<String,Object>();
            item.put(NAME, name[i]);
            item.put(CLASS, classs[i]);
            item.put(NUMBER, number[i]);
            items.add(item);
        }

        SimpleAdapter adapter=new SimpleAdapter(this,items,R.layout.item,new String[]{NAME,CLASS,NUMBER},new int[]{R.id.txtName,R.id.txtClass,R.id.txtNumber});

        ListView list=(ListView)findViewById(R.id.list);
        list.setAdapter(adapter);


    }

}

