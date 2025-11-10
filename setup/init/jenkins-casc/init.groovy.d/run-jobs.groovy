import jenkins.model.Jenkins
import hudson.model.Queue
import hudson.model.Job

// Wait for Jenkins to be fully initialized
Jenkins jenkins = Jenkins.getInstance()

// Give Jenkins a bit more time to finish loading all jobs
Thread.sleep(5000)


// Get all jobs and trigger them
jenkins.getAllItems(Job.class).each { job ->
    println "Triggering job: ${job.fullName}"
    try {
        job.scheduleBuild2(0)
        println "Job '${job.fullName}' queued successfully"
    } catch (Exception e) {
        println "Failed to trigger job '${job.fullName}': ${e.message}"
    }
}

println "All jobs have been queued for execution"