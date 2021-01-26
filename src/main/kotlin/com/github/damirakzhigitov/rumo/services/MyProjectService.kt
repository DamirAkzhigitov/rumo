package com.github.damirakzhigitov.rumo.services

import com.github.damirakzhigitov.rumo.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
