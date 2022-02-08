package kz.flyingv.quicktodo.activity.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.fragment.app.FragmentActivity
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.NavigationUI
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import kz.flyingv.quicktodo.R
import kz.flyingv.quicktodo.activity.settings.SettingsActivity
import kz.flyingv.quicktodo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        setSupportActionBar(binding.toolbar)

        setupUI()
        setupNavigation()

    }

    private fun setupNavigation(){

        val navHost = supportFragmentManager.findFragmentById(binding.fragmentContainer.id) as NavHostFragment
        NavigationUI.setupWithNavController(binding.bottomNavigationView, navHost.navController)
    }

    private fun setupUI(){
        //bottom app bar, round corners
        val background = binding.bottomAppBar.background as MaterialShapeDrawable
        val shapeAppearanceModel = background.shapeAppearanceModel
        background.shapeAppearanceModel =
            shapeAppearanceModel.toBuilder().setAllCorners(CornerFamily.ROUNDED, 22f).build()

        //bottom navigation view, clear background
        binding.bottomNavigationView.background = null

        binding.createToDo.setOnClickListener {
            newToDo()
        }

    }

    private fun newToDo(){

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_top, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            R.id.settings -> startActivity(Intent(this, SettingsActivity::class.java))
        }
        return super.onOptionsItemSelected(item)
    }

}