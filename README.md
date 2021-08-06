
# PikactivityTracker-server
PikactivityTracker-server is backend part of an aplication that serves gathering statisics about your webside. To do so, webside must download library () and use it to deliver events regarding that side. You can than use this () to display results in a dashboard.

Empty project was generated with use of https://start.spring.io/. We use Maven to deal with our dependencies and JUnit for testing. Jacoco is used as a stage in Maven to check the cover of tests.

To generate well-looking reports use: mvn jacoco:report

To run a projest on a Docker do this (requires installed Docker):
- build jar: mvn clean install
- build image: docker build -t <image_name> . 
- run image: docker run <image_namef>
- image runs at port 8080, if you want to change port please add this option -p<new_port>:8080
