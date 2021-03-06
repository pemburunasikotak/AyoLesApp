package com.syahputrareno975.ayolesapp.di.component

import com.syahputrareno975.ayolesapp.di.module.ActivityModule
import com.syahputrareno975.ayolesapp.ui.activity.detail_course.DetailCourseActivity
import com.syahputrareno975.ayolesapp.ui.activity.login.LoginActivity
import com.syahputrareno975.ayolesapp.ui.activity.material_classroom.MaterialClassRoomActivity
import com.syahputrareno975.ayolesapp.ui.activity.material_detail.MaterialDetailClassRoomActivity
import com.syahputrareno975.ayolesapp.ui.activity.register.RegisterActivity
import com.syahputrareno975.ayolesapp.ui.activity.search_course.SearchCourseActivity
import com.syahputrareno975.ayolesapp.ui.activity.update_profile.UpdateProfileActivity
import dagger.Component

@Component(modules = arrayOf(ActivityModule::class))
interface ActivityComponent {

    // add for each new activity
    fun inject(loginActivity: LoginActivity)
    fun inject(searchCourseActivity: SearchCourseActivity)
    fun inject(detailCourseActivity: DetailCourseActivity)
    fun inject(materialClassRoomActivity: MaterialClassRoomActivity)
    fun inject(registerActivity: RegisterActivity)
    fun inject(updateProfileActivity: UpdateProfileActivity)
    fun inject(materialDetailClassRoomActivity: MaterialDetailClassRoomActivity)
}