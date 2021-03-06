package com.syahputrareno975.ayolesapp.ui.fragment.fragment_home

import com.syahputrareno975.ayolesapp.base.BaseContract
import com.syahputrareno975.ayolesapp.model.banner.AllBannerRequest
import com.syahputrareno975.ayolesapp.model.banner.AllBannerResponse
import com.syahputrareno975.ayolesapp.model.category.AllCategoryRequest
import com.syahputrareno975.ayolesapp.model.category.AllCategoryResponse
import com.syahputrareno975.ayolesapp.model.category.OneCategoryResponse
import com.syahputrareno975.ayolesapp.model.course.AllCourseRequest
import com.syahputrareno975.ayolesapp.model.course.AllCourseResponse

class FragmentHomeContract {
    interface View: BaseContract.View {

        // mandatory response
        fun showProgress(show: Boolean)
        fun showError(error: String)

        // add more for response
        fun onGetAllBanner(s : AllBannerResponse)
        fun onGetAllCategory(s : AllCategoryResponse)
        fun onGetAllCategoryForCourse(s : AllCategoryResponse)
        fun onGetAllCourses(s : AllCourseResponse,position : Int)
    }

    interface Presenter: BaseContract.Presenter<View> {

        // add for request
        fun getAllBanner(r : AllBannerRequest)
        fun getAllCategory(r : AllCategoryRequest)
        fun getAllCategoryForCourse(r : AllCategoryRequest)
        fun getAllCourses(r : AllCourseRequest,position : Int)
    }
}