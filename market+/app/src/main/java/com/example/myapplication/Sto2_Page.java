package com.example.myapplication;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class Sto2_Page extends AppCompatActivity {

    ArrayList<String> catalog_ID = new ArrayList<>();
    ArrayList<String> catalog_Category = new ArrayList<>();
    ArrayList<String> catalog_Name = new ArrayList<>();
    ArrayList<String> catalog_Description = new ArrayList<>();
    ArrayList<String> catalog_Price = new ArrayList<>();
    ArrayList<String> catalog_Time_result = new ArrayList<>();
    ArrayList<String> catalog_Preparation = new ArrayList<>();
    ArrayList<String> catalog_Bio = new ArrayList<>();
    ArrayList<String> news_ID = new ArrayList<>();
    ArrayList<String> news_Name = new ArrayList<>();
    ArrayList<String> news_Description = new ArrayList<>();
    ArrayList<String> news_price = new ArrayList<>();
    ArrayList<String> category_ID = new ArrayList<>();
    ArrayList<String> category_Name = new ArrayList<>();




    RecyclerView recyclerStor, recyclerCategories, recycler_shop_item;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.store);
        recyclerStor = findViewById(R.id.recycleStore);
        recycler_shop_item = findViewById(R.id.recycle_shop_item);
        recyclerCategories = findViewById(R.id.recycleCategories);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.VERTICAL, false);
        recycler_shop_item.setLayoutManager(linearLayoutManager);
        LinearLayoutManager linearLayoutManager2 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL, false);
        recyclerCategories.setLayoutManager(linearLayoutManager2);
        LinearLayoutManager linearLayoutManager1 = new LinearLayoutManager(getApplicationContext(),LinearLayoutManager.HORIZONTAL, false);
        recyclerStor.setLayoutManager(linearLayoutManager1);

        try{
            JSONObject obj = new JSONObject(loadJSONFromAsset("catalog.json"));
            JSONArray resultArray=obj.getJSONArray("results");
            for (int i = 0; i < resultArray.length();i++){
                JSONObject resultDetail = resultArray.getJSONObject(i);
                catalog_ID.add(resultDetail.getString("id"));
                catalog_Category.add(resultDetail.getString("category"));
                catalog_Name.add(resultDetail.getString("name"));
                catalog_Description.add(resultDetail.getString("description"));
                catalog_Price.add(resultDetail.getString("price"));
                catalog_Time_result.add(resultDetail.getString("time_result"));
                catalog_Preparation.add(resultDetail.getString("preparation"));
                catalog_Bio.add(resultDetail.getString("bio"));
            }
        }catch (JSONException e){
            e.printStackTrace();
        }

        try{
            JSONObject obj = new JSONObject(loadJSONFromAsset("news.json"));
            JSONArray resultArray=obj.getJSONArray("results");
            for (int i = 0; i < resultArray.length();i++){
                JSONObject resultDetail = resultArray.getJSONObject(i);
                news_ID.add(resultDetail.getString("id"));
                news_Name.add(resultDetail.getString("name"));
                news_Description.add(resultDetail.getString("description"));
                news_price.add(resultDetail.getString("price"));
            }
        }catch (JSONException e){
            e.printStackTrace();
        }
        try{
            JSONObject obj = new JSONObject(loadJSONFromAsset("category.json"));
            JSONArray resultArray=obj.getJSONArray("results");
            for (int i = 0; i < resultArray.length();i++){
                JSONObject resultDetail = resultArray.getJSONObject(i);
                category_ID.add(resultDetail.getString("id"));
                category_Name.add(resultDetail.getString("name"));
            }
        }catch (JSONException e){
            e.printStackTrace();
        }
        CatalogAdapter CatalogAdapter = new CatalogAdapter(Sto2_Page.this,catalog_ID,catalog_Category,catalog_Name,catalog_Description,catalog_Price,
                catalog_Time_result,catalog_Preparation,catalog_Bio);
        recyclerStor.setAdapter(CatalogAdapter);
        NewsAdapter NewsAdapter = new NewsAdapter(Sto2_Page.this,news_ID, news_Description, news_Name, news_price);
        recycler_shop_item.setAdapter(NewsAdapter);
        CategoryAdapter categoryAdapter = new CategoryAdapter(Sto2_Page.this,category_ID, category_Name);
        recyclerCategories.setAdapter(categoryAdapter);
    }


    public String loadJSONFromAsset (String path) {
        String json = null;
        try {
            InputStream is = getAssets().open(path);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
        return json;
    }
}