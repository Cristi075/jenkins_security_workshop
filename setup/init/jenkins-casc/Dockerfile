FROM jenkins/jenkins:lts

# Skip the initial setup wizard
ENV JAVA_OPTS="-Djenkins.install.runSetupWizard=false"

# Set JCasC configuration path
ENV CASC_JENKINS_CONFIG=/var/jenkins_conf/jenkins.yaml

# Copy plugins list and install plugins
COPY plugins.txt /usr/share/jenkins/ref/plugins.txt
RUN jenkins-plugin-cli --plugin-file /usr/share/jenkins/ref/plugins.txt

# Copy init scripts
RUN mkdir -p /usr/share/jenkins/ref/init.groovy.d
COPY init.groovy.d/ /usr/share/jenkins/ref/init.groovy.d/

# Copy JCasC configuration
COPY jenkins.yaml /var/jenkins_conf/jenkins.yaml

USER jenkins