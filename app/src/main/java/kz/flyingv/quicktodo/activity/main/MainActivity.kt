package kz.flyingv.quicktodo.activity.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.shape.CornerFamily
import com.google.android.material.shape.MaterialShapeDrawable
import kz.flyingv.quicktodo.R
import kz.flyingv.quicktodo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)


        val background = binding.bottomAppBar.background as MaterialShapeDrawable
        val shapeAppearanceModel = background.shapeAppearanceModel
        background.shapeAppearanceModel =
            shapeAppearanceModel.toBuilder().setAllCorners(CornerFamily.ROUNDED, 22f).build()
    }

}