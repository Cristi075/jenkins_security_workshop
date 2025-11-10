# Instructions - how to run

## Pre-requisites
- you should have Docker and Docker compose installed on your system
    - You don't really need any Docker related skills for this
    - But you might pick up some commands and some troubleshooting techniques while going through this workshop :)
- you should have a working Internet connection and you should be able to reach Docker Hub

## Running the Jenkins instance
- go to the jenkins_setup folder (where the docker-compose.yml file is)
- run 'docker compose up --build'
    - You can also run 'docker compose up --build -d'. This way, the logs won't be shown on your active terminal
    - Note: if you want to remove EVERYTHING, you should run 'docker compose down -v'. Including '-v'  makes docker compose destroy the named volume too

# What is included in this setup?

By running this, you will get:
- a Jenkins instance (with weak security)
- a LDAP server
- a phpldapadmin server (for troubleshooting LDAP, if needed)