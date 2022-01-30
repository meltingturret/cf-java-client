# cf-java-client
Spring boot client application for cloud foundry API to replace outdated https://github.com/cloudfoundry/cf-java-client client.This application will provide a cloud foundry API client that uses the springboot (https://docs.spring.io/spring-boot/docs/current/reference/htmlsingle/#io.rest-client.webclient) webclient for REST API implementation.

The Cloud Foundry (https://github.com/cloudfoundry/cloud_controller_ng) controller does not contain an API design specification such as Open API which will require a generator to reverse engineer the ruby reources into an Open API spec YAML file that we can then use to generate our springboot REST API.


[![Build Application](https://github.com/meltingturret/cf-java-client/actions/workflows/maven-publish.yml/badge.svg)](https://github.com/meltingturret/cf-java-client/actions/workflows/maven-publish.yml)

 
 
