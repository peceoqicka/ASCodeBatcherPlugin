package com.github.peceoqicka.ascodebatcherplugin.services

import com.github.peceoqicka.ascodebatcherplugin.MyBundle
import com.intellij.openapi.project.Project

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
