def call(String name, String dayOfWeek) {
    sh "echo Hello Alina ${name}. It is ${dayOfWeek}."
}


def call(Map config = [:]) {
  sh "echo Hello Alina ${config.name}. It is ${config.dayOfWeek}."
}
