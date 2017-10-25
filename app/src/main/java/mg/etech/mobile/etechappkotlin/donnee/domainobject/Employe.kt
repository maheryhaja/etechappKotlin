package mg.etech.mobile.etechappkotlin.donnee.domainobject

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.ForeignKey
import android.arch.persistence.room.PrimaryKey
import java.util.*

/**
 * Created by mahery.haja on 24/10/2017.
 */
@Entity(tableName = "Employe")
data class Employe(
        @PrimaryKey
        var id: Long,

        @ColumnInfo(name = "firstName")
        var firstName: String,

        @ColumnInfo(name = "lastName")
        var lastName: String,

        @ColumnInfo(name = "birthDate")
        var birthDate: Date,

        @ColumnInfo(name = "hiringDate")
        var hiringDate: Date,

        @ColumnInfo(name = "mail")
        var mail: String,

        @ColumnInfo(name = "matricule")
        var matricule: Long,

        @ForeignKey(entity = Pole::class, parentColumns = arrayOf("id"), childColumns = arrayOf("pole_id"))
        @ColumnInfo(name = "pole_id")
        var poleId: Long,

        @ColumnInfo(name = "is_male")
        var isMale: Boolean,

        @ColumnInfo(name = "photo_uri")
        var photoUri: String,

        @ColumnInfo(name = "photo_uri")
        var photoUrl: String
)

