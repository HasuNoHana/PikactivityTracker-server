
# PikactivityTracker-server
PikactivityTracker-server is backend part of an aplication that serves gathering statisics about your webside. To do so, webside must download library (https://github.com/HasuNoHana/PikactivityTracker-library) and use it to deliver events regarding that side. You can than use this (https://github.com/HasuNoHana/PikactivityTracker-website) to display results in a dashboard.

Project was realized in cooperation with Marcin Bąk (https://www.linkedin.com/in/marcinbak/) who work as Vice President in FICC Post Execution Automation at Goldman Sachs.

Empty project was generated with use of https://start.spring.io/. We use Maven to deal with our dependencies and JUnit for testing. Jacoco is used as a stage in Maven to check the cover of tests.

To generate well-looking reports use: mvn jacoco:report

To run a projest on a Docker do this (requires installed Docker):
- build jar: mvn clean install
- build image: docker build -t <image_name> . 
- run image: docker run <image_namef>
- image runs at port 8080, if you want to change port please add this option -p<new_port>:8080

Authors:
- Aleksandra Okrutny (https://github.com/aleokr)
- Aniela Kosek (https://github.com/aksek)
- Patryk Karbownik (https://github.com/p-karbownik)
- Zuzanna Santorowska (https://github.com/HasuNoHana)
