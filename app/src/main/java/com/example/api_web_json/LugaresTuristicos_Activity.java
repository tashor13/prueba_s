package com.example.api_web_json;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import com.example.api_web_json.WebServices.Asynchtask;
import com.example.api_web_json.WebServices.WebService;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.text.BreakIterator;
import java.util.HashMap;
import java.util.Map;

public class LugaresTuristicos_Activity extends AppCompatActivity implements Asynchtask {

    Bundle bundle = this.getIntent().getExtras();
    Map<String, String> datos = new HashMap<String, String>();
    WebService ws= new WebService(
            "https://uteqia.com/api/choferes"
                    + bundle.getString("Usr") + "&pass=" + bundle.getString("clave"),
            datos, LugaresTuristicos_Activity.this, LugaresTuristicos_Activity.this);
ws.execute("GET");
    @Override
    public void processFinish(String result) throws
            JSONException {
        BreakIterator txtResp= null;
        txtResp.setText("Resp: " + result );
    }
}