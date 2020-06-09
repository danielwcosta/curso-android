package com.example.entregavel_marvel.viewmodel

import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel
import com.example.entregavel_marvel.model.Comic
import com.example.entregavel_marvel.repository.RepositoryMarvel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch

class ViewModelMarvel : ViewModel() {

    var listMutableComic = MutableLiveData<MutableSet<Comic>>()
    private val repositoryMarvel = RepositoryMarvel()

    fun getAllComics() = CoroutineScope(IO).launch {
       listMutableComic.postValue(repositoryMarvel.getComicService().data.results)
        }
    }
