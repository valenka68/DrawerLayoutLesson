package com.example.valentinabulanova.drawerlayoutlesson

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.core.view.GravityCompat
import com.example.valentinabulanova.drawerlayoutlesson.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.apply {
            navV.setNavigationItemSelectedListener {
                when(it.itemId){
                    R.id.item1 -> Toast.makeText(this@MainActivity, "item1", Toast.LENGTH_SHORT).show()
                    R.id.item2 -> Toast.makeText(this@MainActivity, "item2", Toast.LENGTH_SHORT).show()
                    R.id.item3 -> Toast.makeText(this@MainActivity, "item3", Toast.LENGTH_SHORT).show()
                    R.id.item4 -> Toast.makeText(this@MainActivity, "item4", Toast.LENGTH_SHORT).show()

                    R.id.item21 -> Toast.makeText(this@MainActivity, "item1", Toast.LENGTH_SHORT).show()
                    R.id.item22 -> Toast.makeText(this@MainActivity, "item2", Toast.LENGTH_SHORT).show()
                    R.id.item23 -> Toast.makeText(this@MainActivity, "item3", Toast.LENGTH_SHORT).show()
                    R.id.item24 -> Toast.makeText(this@MainActivity, "item4", Toast.LENGTH_SHORT).show()
                }
                drawer.closeDrawer(GravityCompat.START)
                true }
            open.setOnClickListener {
                drawer.openDrawer(GravityCompat.START)
            }
        }
    }
}