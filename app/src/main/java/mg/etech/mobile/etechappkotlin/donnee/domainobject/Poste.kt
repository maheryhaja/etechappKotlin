package mg.etech.mobile.etechappkotlin.donnee.domainobject

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey

/**
 * Created by mahery.haja on 25/10/2017.
 */
@Entity(tableName = "Poste")
data class Poste(
        @PrimaryKey var id: String,
        @ColumnInfo(name = "name") var name: String,
        @ColumnInfo(name = "tag") var tag: String
)