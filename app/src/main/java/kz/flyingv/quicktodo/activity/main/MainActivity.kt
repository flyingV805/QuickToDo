package kz.flyingv.quicktodo.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.FragmentActivity
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import kz.flyingv.quicktodo.R
import kz.flyingv.quicktodo.databinding.ActivityMainBinding

class MainActivity : FragmentActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        //setSupportActionBar(binding.toolbar)

        setupUI()

    }

    private fun setupUI(){
        //bottom app bar, round corners
        val background = binding.bottomAppBar.background as MaterialShapeDrawable
        val shapeAppearanceModel = background.shapeAppearanceModel
        background.shapeAppearanceModel =
            shapeAppearanceModel.toBuilder().setAllCorners(CornerFamily.ROUNDED, 22f).build()

        //bottom navigation view
        binding.bottomNavigationView.background = null
        //binding.bottomNavigationView.menu.getItem(2).isEnabled = false

    }

}