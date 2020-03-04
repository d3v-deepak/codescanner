package com.transaktsdk.volley_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.JsonWriter;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.Header;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonArrayRequest;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
TextView result;
    JSONObject jsonObject;
    ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        result=findViewById(R.id.res);
    progressBar=findViewById(R.id.progressBar);
   /*

        RequestQueue quene= Volley.newRequestQueue(this);



        try {

            jsonObject = new JSONObject();

           jsonObject.put("merchant_token","3c01abeb-b031-4fea-9f2d-c55c283cd78e");
        } catch (JSONException e) {
            e.printStackTrace();

        }
        //final String requestBody = jsonObject.toString();

        String url ="https://jsonplaceholder.typicode.com/todos/1";
        JSONArray jsonArray=null;

             jsonArray=new JSONArray();
             jsonArray.put(jsonObject);

JsonArrayRequest jsonArrayRequest=new JsonArrayRequest(Request.Method.POST, url,null, new Response.Listener<JSONArray>() {
    @Override
    public void onResponse(JSONArray response) {

        try {
            Object issuer=response.getJSONObject(1).getJSONArray("issuers").getJSONObject(1).get("issuer_name");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}, new Response.ErrorListener() {
    @Override
    public void onErrorResponse(VolleyError error) {

    }
}){
    @Override
    public byte[] getBody() {



        return jsonObject.toString().getBytes();
    }
    s
};

*/






















    /*    JsonArrayRequest jsonArrayRequest=new StringRequest(Request.Method.POST, url,new Response.Listener<String>() {
                @Override
            public void onResponse(String response) {


            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError error) {
result.setText(error.toString());
            }
        }
        ){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return super.getHeaders();
            }

            @Override
            protected Map<String, String> getParams() throws AuthFailureError {
                return super.getParams();
            }
        };












        quene.add(stringRequest);
   */ }


public void on(View view){
    progressBar.setVisibility(View.INVISIBLE);

}

    public void off(View view){
progressBar.setVisibility(View.GONE);
    }


}
