def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.bat')
    sh "./hello-world.bat ${config.name} ${config.dayOfWeek}"
}
