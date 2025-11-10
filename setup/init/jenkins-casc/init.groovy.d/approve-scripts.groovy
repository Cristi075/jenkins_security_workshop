import org.jenkinsci.plugins.scriptsecurity.scripts.*
import jenkins.model.Jenkins

// Give Jenkins a bit more time to finish loading all jobs
Thread.sleep(5000)

// Auto-approve all scripts on startup
def scriptApproval = ScriptApproval.get()

// Approve all pending scripts
def pendingScripts = scriptApproval.pendingScripts.collect()
pendingScripts.each { ps ->
    scriptApproval.approveScript(ps.getHash())
}

println "All pending scripts approved"