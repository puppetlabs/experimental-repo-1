def value_stream = "experimental"
def owner_name = "waynr"
def project_name = "experimental-repo-1"
def branch_name = "${P_GIT_BRANCH_NAME}"

pipelineJob("${value_stream}_${project_name}_pipe-1_${branch_name}") {
  scm {
    git("git@github.com:${owner_name}/${project_name}.git")
  }
  triggers {
    scm("H/5 * * * *")
  }
  definition {
    cpsScm {
      scm {
        git {
          remote {
            name("github")
            url("git@github.com:${owner_name}/${project_name}.git")  
          }
          branch(branch_name)
        }
      }
      scriptPath("jenkins/pipelines/pipe-1.groovy")
    }
  }
}

pipelineJob("${value_stream}_${project_name}_pipe-2_${branch_name}") {
  scm {
    git("git@github.com:${owner_name}/${project_name}.git")
  }
  triggers {
    scm("H/5 * * * *")
  }
  definition {
    cpsScm {
      scm {
        git {
          remote {
            name("github")
            url("git@github.com:${owner_name}/${project_name}.git")  
          }
          branch(branch_name)
        }
      }
      scriptPath("jenkins/pipelines/pipe-2.groovy")
    }
  }
}
