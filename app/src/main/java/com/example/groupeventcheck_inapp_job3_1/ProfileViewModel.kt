package com.example.groupeventcheck_inapp_job3_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

data class UserProfile(val name: String, val email: String)

class ProfileViewModel : ViewModel() {
    private val _profileData = MutableLiveData<UserProfile>()
    val profileData: LiveData<UserProfile> get() = _profileData

    init {

        _profileData.value = UserProfile("John Doe", "john.doe@example.com")
    }

    fun updateProfile(name: String, email: String) {
        _profileData.value = UserProfile(name, email)
    }
}
