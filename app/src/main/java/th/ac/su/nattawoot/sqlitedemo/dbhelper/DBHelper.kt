package th.ac.su.nattawoot.sqlitedemo.dbhelper
import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
class DBHelper(context: Context): SQLiteOpenHelper(context,DATABASE_NAME,null,DATABASE_VERSION) {
    companion object{
        private val DATABASE_VERSION = 1
        private val DATABASE_NAME = "University.db"

        private val TABLE_NAME = "student"
        private val COL_ID = "id"
        private val COL_NAME = "name"
        private val COL_EMAIL = "email"

    }

    override fun onCreate(db: SQLiteDatabase?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
    //contstand จะใช้ตัวใหญ่ในการประกาศตัวแปล
}