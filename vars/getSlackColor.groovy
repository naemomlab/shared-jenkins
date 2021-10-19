def call(currentResult) {
    switch(currentResult) {
        case "SUCCESS":
            return "good"
            break
        case "FAILURE":
        case "UNSTABLE":
            return "danger"
            break
        default:
            return "warning"
            break
    }
}