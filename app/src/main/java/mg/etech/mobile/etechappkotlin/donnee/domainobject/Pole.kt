package mg.etech.mobile.etechappkotlin.donnee.domainobject

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by mahery.haja on 24/10/2017.
 */

@Entity(tableName = "Pole")
data class Pole(

        @PrimaryKey
        var id: Long,

        @ColumnInfo(name = "name")
        var name: String,

        @ColumnInfo(name = "id_server")
        var idServer: String
)