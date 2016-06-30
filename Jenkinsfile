stage "Load meow from github file."
def meow = fileLoader.fromGit(
    'src/com/puppet/util/Meow',
    'git@github.com:puppetlabs/jenkins-global-workflowlib',
    'master', null, '')

stage "meow"
meow.meow()
