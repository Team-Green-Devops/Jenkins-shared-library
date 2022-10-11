def call(Map config = [:]) {
    loadLinuxScript(name: 'hello-world.bat')
    sh "./hello-world.sh ${config.name} ${config.dayOfWeek}"
}
