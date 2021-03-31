package com.example.yadbeyadappnewnew;

import android.app.VoiceInteractor;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.net.HttpURLConnection;

import static java.lang.System.exit;

public class Registration extends AppCompatActivity {
    SharedPreferences sp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        final TextView textView123 = (TextView) findViewById(R.id.textView123);

        super.onCreate(savedInstanceState);
        setContentView(R.layout.registration);
        Button finished = (Button) findViewById(R.id.finished);


        sp = getSharedPreferences("finished", MODE_PRIVATE);
        if (sp.getBoolean("logged", false)) {
            goToMainActivity();
        }

        RequestQueue queue = Volley.newRequestQueue(this);
        String url = "http://10.0.2.2:5000/api/token";

        StringRequest stringRequest = new StringRequest(Request.Method.GET, url,
                new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {
                        textView123.setText("Response is: " + response.substring(0, 500));
                    }
                }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
                textView123.setText("That didn't work!");
            }
        });

// Add the request to the RequestQueue.
        queue.add(stringRequest);

        finished.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText nameEdit = (EditText) findViewById(R.id.name);
                EditText phoneEdit = (EditText) findViewById(R.id.phoneNumber);
                EditText addressEdit = (EditText) findViewById(R.id.address);
                EditText cityEdit = (EditText) findViewById(R.id.city);
            }
        });
    }
        public void goToMainActivity(){
            Intent intent = new Intent(getBaseContext(), MainActivity.class);
            startActivity(intent);
        }
}


//

//
//
//                BufferedReader reader = null;
//                String text = "";
//                try {
//
//                    String name = URLEncoder.encode(nameEdit.getText().toString(), "UTF-8");
//                    String phone = URLEncoder.encode(phoneEdit.getText().toString(), "UTF-8");
//                    String address = URLEncoder.encode(addressEdit.getText().toString(), "UTF-8");
//                    String city = URLEncoder.encode(cityEdit.getText().toString(), "UTF-8");
//                    String data = name + "&" + phone + "&" + address + "&" + city;
//
//
//                    URL url = new URL("http://10.0.2.2:5000/api/token");
//                    URLConnection conn = url.openConnection();
//                    conn.setDoOutput(true);
//                    OutputStreamWriter wr = new OutputStreamWriter(conn.getOutputStream());
//                    wr.write(data);
//                    wr.flush();
//
//                    reader = new BufferedReader(new InputStreamReader(conn.getInputStream()));
//                    StringBuilder sb = new StringBuilder();
//                    String line = null;
//
//                    while ((line = reader.readLine()) != null) {
//                        // Append server response in string
//                        sb.append(line).append("\n");
//                    }
//
//
//                    text = sb.toString();
//                } catch (Exception ex) {
//                    exit(1);
//                } finally {
//                    goToMainActivity();
//                    try {
//                        assert reader != null;
//                        reader.close();
//                    } catch (Exception ex) {
//                        exit(1);
//                    }
//                }
//
//            }
//            }
//        );}


