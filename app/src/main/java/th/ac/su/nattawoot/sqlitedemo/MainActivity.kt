package th.ac.su.nattawoot.sqlitedemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ListView
import kotlinx.android.synthetic.main.activity_main.*
import th.ac.su.nattawoot.sqlitedemo.adapter.ListStudentAdapter
import th.ac.su.nattawoot.sqlitedemo.model.Student

class MainActivity : AppCompatActivity() {
    var listStudent= ArrayList<Student>()
    lateinit var  listViewStudent:ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var student1 = Student( 1 , "toon" ,  "toonbaba1.gg@gmail.com" )
        var student2 = Student(2 , "oon" ,  "toonbaba2.gg@gmail.com" )
        var student3 = Student( 3 , "oo" , "toonbaba3.gg@gmail.com" )
        listStudent.add(student1)
        listStudent.add(student2)
        listStudent.add(student3)


        listViewStudent =  findViewById<ListView>(R.id.listViewStudent)

        reloadData()


    }
    fun reloadData(){
        val adpter = ListStudentAdapter(this@MainActivity,listStudent)
        listViewStudent.adapter = adpter


    }
}
