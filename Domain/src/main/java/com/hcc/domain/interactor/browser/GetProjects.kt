package com.hcc.domain.interactor.browser

import com.hcc.domain.executor.PostExecutionThread
import com.hcc.domain.interactor.ObservableUseCase
import com.hcc.domain.model.Project
import com.hcc.domain.repository.ProjectsRepository
import io.reactivex.Observable
import javax.inject.Inject

class GetProjects @Inject constructor(
        private val projectsRepository: ProjectsRepository,
        postExecutionThread: PostExecutionThread) : ObservableUseCase<List<Project>, Nothing>(postExecutionThread) {

    override fun buildUseCaseObservable(params: Nothing?): Observable<List<Project>> {
        return projectsRepository.getProjects()
    }

}