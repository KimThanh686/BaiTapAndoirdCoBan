package com.example.getapi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.getapi.api.GitHunDataRepository
import com.example.getapi.model.ListUserFollowers
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val gitHubDataRepository = GitHunDataRepository()
        CoroutineScope(Dispatchers.IO).launch {
            val userModel = gitHubDataRepository.getUserDetailsFromApi("ToanMobile")
            Log.e("TEST_DATA",userModel.toString())
            withContext(Dispatchers.Main){
                findViewById<TextView>(R.id.textDetails).text = userModel?.name ?: ""
            }
            val listUserFollowers = gitHubDataRepository.getListUserFollowers("ToanMobile")
            withContext(Dispatchers.Main){
                findViewById<RecyclerView>(R.id.recyclerView).adapter = UserAdapter(this@MainActivity, listUserFollowers?: ListUserFollowers())
            }
        }


    }
}