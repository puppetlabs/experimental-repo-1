stage "herps and derps"

parallel 'all the herps': {
  node {
    echo "herp 1 complete"

    echo "herp 2 complete"
  }
}, 'all the derps': {
  node {
    echo "derp 1 complete"

    echo "derp 2 complete"
  }
}
stage "demonstrate success"
sh: "/usr/bin/env true"

stage "demonstrate failure"
sh: "/usr/bin/env false"
