stage "Load meow from github file."
def meow = new com.puppet.util.Meow()

node {
     meow.experimental_repo_2_test()
}
