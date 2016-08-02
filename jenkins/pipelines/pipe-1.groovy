stage "Load meow from shared library"
def meow = new com.puppet.util.Meow()

node {
     meow.experimental_repo_2_test()
}
