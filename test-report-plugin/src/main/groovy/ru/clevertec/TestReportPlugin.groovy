package ru.clevertec

import org.gradle.api.Plugin
import org.gradle.api.Project

class TestReportPlugin implements Plugin<Project> {

    @Override
    void apply(Project project) {
        project.tasks.register("deleteTestReport") {
            onlyIf {
                project.file("${project.rootDir}/test-report").exists()
            }

            doFirst {
                println "Deleting a test report..."
            }

            doLast {
                project.delete("${project.rootDir}/test-report")
            }
        }

        project.tasks.register('testReport') {
            dependsOn("deleteTestReport")
            finalizedBy("copyTestReport")

            doFirst {
                println "Running a test report..."
            }
        }

        project.tasks.register("copyTestReport") {
            dependsOn("testReport")

            onlyIf {
                project.file("${project.buildDir}/reports").exists()
                project.file("${project.buildDir}/test-results").exists()
            }

            doFirst {
                println "Copying a test report..."
            }

            doLast {
                project.copy {
                    from "$project.buildDir/reports"
                    into "$project.rootDir/test-report/${project.name}/reports"
                }

                project.copy {
                    from "$project.buildDir/test-results"
                    into "$project.rootDir/test-report/${project.name}/test-results"
                }
            }
        }
    }

}
