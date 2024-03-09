package com.notagain.notagain

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.gson.GsonBuilder
import com.loopj.android.http.AsyncHttpClient
import com.loopj.android.http.JsonHttpResponseHandler
import com.notagain.CreatorAdapter
import com.notagain.CreatorModel
import org.json.JSONArray
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    lateinit var imageList: ArrayList<CreatorModel>
    lateinit var creatorAdapter: CreatorAdapter
    lateinit var recyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.crerecycler)
        imageList=ArrayList<CreatorModel>()

        val client = AsyncHttpClient(true, 80, 443)
        creatorAdapter = CreatorAdapter(applicationContext, imageList)
        recyclerView.layoutManager = LinearLayoutManager(applicationContext)
        recyclerView.setHasFixedSize(true)

        client.get(this, "https://jereson.pythonanywhere.com/creators"
            ,null, "application/json",
            object  : JsonHttpResponseHandler(){
                override fun onSuccess(
                    statusCode: Int,
                    headers: Array<out cz.msebera.android.httpclient.Header>?,
                    response: JSONArray?
                ) {
                    val gson = GsonBuilder().create()
                    val List = gson.fromJson(response.toString(),
                        Array<CreatorModel>::class.java).toList()

                    if (List.size == 0){
                        Toast.makeText(applicationContext, "No creators yet", Toast.LENGTH_LONG).show()

                    }else {
                        creatorAdapter.setImageListItems(List)
                    }
                }


                override fun onFailure(
                    statusCode: Int,
                    headers: Array<out cz.msebera.android.httpclient.Header>?,
                    responseString: String?,
                    throwable: Throwable?
                ) {
                    Toast.makeText(applicationContext, "Try again "+statusCode, Toast.LENGTH_LONG).show()

                }
            })//ends handler

        recyclerView.adapter = creatorAdapter




    }//ends oncreate
}//ends class