def call(Map config) {
    node {
      echo ${config.message}
      sh '''
        git version
        pwd
      '''
    }
}
