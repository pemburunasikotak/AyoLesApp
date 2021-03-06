package com.syahputrareno975.ayolesapp.model.teacher

import com.google.gson.annotations.SerializedName
import com.syahputrareno975.ayolesapp.model.BaseModel
import java.io.Serializable

class TeacherModel : BaseModel {
    @SerializedName("id")
    var Id : String = ""

    @SerializedName("name")
    var Name : String = ""

    @SerializedName("email")
    var Email : String = ""

    @SerializedName("password")
    var Password : String = ""

    constructor()

    constructor(Id: String, Name: String, Email: String, Password: String) {
        this.Id = Id
        this.Name = Name
        this.Email = Email
        this.Password = Password
    }
}