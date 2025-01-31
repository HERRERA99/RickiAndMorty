package com.aitor.rickmorty.presentation

import androidx.lifecycle.ViewModel
import androidx.paging.PagingData
import com.aitor.rickmorty.data.RickMortyRepository
import com.aitor.rickmorty.presentation.model.CharacterModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class RickListViewModel @Inject constructor(val rickMortyRepository: RickMortyRepository) : ViewModel() {

    val characters:Flow<PagingData<CharacterModel>> = rickMortyRepository.getAllCharacters()

}